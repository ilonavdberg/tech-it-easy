package com.tech_it_easy.TechItEasy.controllers;

import com.tech_it_easy.TechItEasy.dtos.CIModuleRequestDto;
import com.tech_it_easy.TechItEasy.dtos.CIModuleResponseDto;
import com.tech_it_easy.TechItEasy.mappers.CIModuleMapper;
import com.tech_it_easy.TechItEasy.models.CIModule;
import com.tech_it_easy.TechItEasy.services.CIModuleService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ci-modules")
public class CIModuleController {
    private final CIModuleService ciModuleService;

    public CIModuleController(CIModuleService ciModuleService) {
        this.ciModuleService = ciModuleService;
    }

    @GetMapping
    public ResponseEntity<List<CIModuleResponseDto>> getAllCIModules() {
        List<CIModule> ciModules = ciModuleService.getAllCIModules();
        List<CIModuleResponseDto> response = CIModuleMapper.toCIModuleResponseList(ciModules);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CIModuleResponseDto> getCIModule(@PathVariable Long id) {
        CIModule ciModule = ciModuleService.getCIModule(id);
        CIModuleResponseDto response = CIModuleMapper.toCIModuleResponse(ciModule);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<CIModuleResponseDto> createCIModule(@Valid @RequestBody CIModuleRequestDto request) {
        CIModule ciModule = CIModuleMapper.toCIModule(request);
        ciModuleService.saveCIModule(ciModule);
        CIModuleResponseDto response = CIModuleMapper.toCIModuleResponse(ciModule);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CIModuleResponseDto> updateCIModule(@PathVariable Long id, @Valid @RequestBody CIModuleRequestDto request) {
        CIModule ciModule = CIModuleMapper.toCIModule(request);
        ciModuleService.updateCIModule(id, ciModule);
        CIModuleResponseDto response = CIModuleMapper.toCIModuleResponse(ciModule);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCIModule(@PathVariable Long id) {
        ciModuleService.deleteCIModule(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
