package com.tech_it_easy.TechItEasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/televisions")
public class TelevisionController {

    @GetMapping("")
    public ResponseEntity<String> findAll() {
        return ResponseEntity.ok("all televisions");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> findById(@PathVariable Integer id) {
        return ResponseEntity.ok("television with id " + id);
    }

    @PostMapping("")
    //RequestBody will be implemented in the future
    public ResponseEntity<String> create() {
        return ResponseEntity.created(null).body("television");
    }

    @PutMapping("/{id}")
    //PathVariable id will be implemented in the future
    public ResponseEntity<String> update() {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    //PathVariable id will be implemented in the future
    public ResponseEntity<String> delete() {
        return ResponseEntity.noContent().build();
    }

}
