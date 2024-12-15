package com.tech_it_easy.TechItEasy.controllers;

import com.tech_it_easy.TechItEasy.dtos.WallBracketRequestDto;
import com.tech_it_easy.TechItEasy.dtos.WallBracketResponseDto;
import com.tech_it_easy.TechItEasy.mappers.WallBracketMapper;
import com.tech_it_easy.TechItEasy.models.WallBracket;
import com.tech_it_easy.TechItEasy.services.WallBracketService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wall-brackets")
public class WallBracketController {
    private final WallBracketService wallBracketService;

    public WallBracketController(WallBracketService wallBracketService) {
        this.wallBracketService = wallBracketService;
    }

    @GetMapping
    public ResponseEntity<List<WallBracketResponseDto>> getAllWallBrackets() {
        List<WallBracket> wallBrackets = wallBracketService.getAllWallBrackets();
        List<WallBracketResponseDto> response = WallBracketMapper.toWallBracketDtoList(wallBrackets);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WallBracketResponseDto> getWallBracket(@PathVariable Long id) {
        WallBracket wallBracket = wallBracketService.getWallBracket(id);
        WallBracketResponseDto response = WallBracketMapper.toWallBracketDto(wallBracket);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<WallBracketResponseDto> createWallBracket(@Valid @RequestBody WallBracketRequestDto request) {
        WallBracket wallBracket = WallBracketMapper.toWallBracket(request);
        wallBracketService.saveWallBracket(wallBracket);
        WallBracketResponseDto response = WallBracketMapper.toWallBracketDto(wallBracket);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WallBracketResponseDto> updateWallBracket(@PathVariable Long id, @Valid @RequestBody WallBracketRequestDto request) {
        WallBracket wallBracket = WallBracketMapper.toWallBracket(request);
        wallBracketService.updateWallBracket(id, wallBracket);
        WallBracketResponseDto response = WallBracketMapper.toWallBracketDto(wallBracket);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWallBracket(@PathVariable Long id) {
        wallBracketService.deleteWallBracket(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
