package com.tech_it_easy.TechItEasy.controllers;

import com.tech_it_easy.TechItEasy.dtos.TelevisionRequestDto;
import com.tech_it_easy.TechItEasy.dtos.TelevisionResponseDto;
import com.tech_it_easy.TechItEasy.dtos.TelevisionSalesInfoResponseDTO;
import com.tech_it_easy.TechItEasy.mappers.TelevisionMapper;
import com.tech_it_easy.TechItEasy.models.Television;
import com.tech_it_easy.TechItEasy.services.TelevisionService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
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
    public List<TelevisionResponseDto> getAllTelevisions() {
        List<Television> televisions = televisionService.getAllTelevisions();
        return TelevisionMapper.toTelevisionDtoList(televisions);
    }

    @GetMapping("/{id}")
    public TelevisionResponseDto getTelevision(@PathVariable Long id) {
        Television television = televisionService.getTelevision(id);
        return TelevisionMapper.toTelevisionDto(television);
    }

    @GetMapping("/sales-info")
    public List<TelevisionSalesInfoResponseDTO> getAllTelevisionsSalesInfo() {
        List<Television> televisions = televisionService.getAllTelevisions();
        return TelevisionMapper.toTelevisionSalesInfoDtoList(televisions);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createTelevision(@Valid @RequestBody TelevisionRequestDto request) {
        Television television = TelevisionMapper.toTelevision(request);
        televisionService.saveTelevision(television);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void updateTelevision(@PathVariable Long id, @Valid @RequestBody TelevisionRequestDto request) {
        Television television = TelevisionMapper.toTelevision(request);
        televisionService.updateTelevision(id, television);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteTelevision(@PathVariable Long id) {
        televisionService.deleteTelevision(id);
    }

}
