package com.tech_it_easy.TechItEasy.controllers;

import com.tech_it_easy.TechItEasy.exception.exceptions.ProductNotFoundException;
import com.tech_it_easy.TechItEasy.models.Television;
import com.tech_it_easy.TechItEasy.repositories.TelevisionRepository;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/televisions")
public class TelevisionController {
    private final TelevisionRepository televisionRepository;

    public TelevisionController(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    @GetMapping("")
    public List<Television> findAll() {
        return televisionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Television findById(@PathVariable Long id) {
        return televisionRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody Television television) {
        televisionRepository.save(television);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @Valid @RequestBody Television updatedTelevision) {
        Television existingTelevision = televisionRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));

        existingTelevision.setType(updatedTelevision.getType());
        existingTelevision.setBrand(updatedTelevision.getBrand());
        existingTelevision.setName(updatedTelevision.getName());
        existingTelevision.setPrice(updatedTelevision.getPrice());
        existingTelevision.setAvailableSize(updatedTelevision.getAvailableSize());
        existingTelevision.setRefreshRate(updatedTelevision.getRefreshRate());
        existingTelevision.setScreenType(updatedTelevision.getScreenType());
        existingTelevision.setScreenQuality(updatedTelevision.getScreenQuality());
        existingTelevision.setIsSmartTv(updatedTelevision.getIsSmartTv());
        existingTelevision.setHasWifi(updatedTelevision.getHasWifi());
        existingTelevision.setHasVoiceControl(updatedTelevision.getHasVoiceControl());
        existingTelevision.setHasHdr(updatedTelevision.getHasHdr());
        existingTelevision.setHasBluetooth(updatedTelevision.getHasBluetooth());
        existingTelevision.setHasAmbiLight(updatedTelevision.getHasAmbiLight());
        existingTelevision.setOriginalStock(updatedTelevision.getOriginalStock());
        existingTelevision.setSold(updatedTelevision.getSold());

        televisionRepository.save(existingTelevision);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        televisionRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        televisionRepository.deleteById(id);
    }

}
