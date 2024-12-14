package com.tech_it_easy.TechItEasy.controllers;

import com.tech_it_easy.TechItEasy.dtos.TelevisionRequestDto;
import com.tech_it_easy.TechItEasy.dtos.TelevisionResponseDto;
import com.tech_it_easy.TechItEasy.dtos.TelevisionSalesInfoResponseDTO;
import com.tech_it_easy.TechItEasy.mappers.TelevisionMapper;
import com.tech_it_easy.TechItEasy.models.Television;
import com.tech_it_easy.TechItEasy.services.TelevisionService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/televisions")
public class TelevisionController {
    private final TelevisionService televisionService;

    public TelevisionController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }

    @GetMapping("")
    public ResponseEntity<List<TelevisionResponseDto>> getAllTelevisions() {
        List<Television> televisions = televisionService.getAllTelevisions();
        List<TelevisionResponseDto> response = TelevisionMapper.toTelevisionDtoList(televisions);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TelevisionResponseDto> getTelevision(@PathVariable Long id) {
        Television television = televisionService.getTelevision(id);
        TelevisionResponseDto response = TelevisionMapper.toTelevisionDto(television);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/sales-info")
    public ResponseEntity<List<TelevisionSalesInfoResponseDTO>> getAllTelevisionsSalesInfo() {
        List<Television> televisions = televisionService.getAllTelevisions();
        List<TelevisionSalesInfoResponseDTO> response = TelevisionMapper.toTelevisionSalesInfoDtoList(televisions);
        return ResponseEntity.ok(response);
    }

    @PostMapping("")
    public ResponseEntity<TelevisionResponseDto> createTelevision(@Valid @RequestBody TelevisionRequestDto request) {
        Television television = TelevisionMapper.toTelevision(request);
        televisionService.saveTelevision(television);
        TelevisionResponseDto response = TelevisionMapper.toTelevisionDto(television);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TelevisionResponseDto> updateTelevision(@PathVariable Long id, @Valid @RequestBody TelevisionRequestDto request) {
        Television television = TelevisionMapper.toTelevision(request);
        televisionService.updateTelevision(id, television);
        TelevisionResponseDto response = TelevisionMapper.toTelevisionDto(television);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelevision(@PathVariable Long id) {
        televisionService.deleteTelevision(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
