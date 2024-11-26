package com.tech_it_easy.TechItEasy.controllers;

import com.tech_it_easy.TechItEasy.exception.exceptions.ProductNotFoundException;
import com.tech_it_easy.TechItEasy.models.Television;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/televisions")
public class TelevisionController {
    // this will be replaced with a repository when the application is connected to a database
    private final List<Television> televisionDatabase = new ArrayList<>();

    @GetMapping("")
    public List<Television> findAll() {
        return televisionDatabase;
    }

    @GetMapping("/{id}")
    public Television findById(@PathVariable Integer id) {
        return televisionDatabase.stream()
                .filter(tv -> tv.id.equals(id))
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody Television television) {
        televisionDatabase.add(television);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Television television) {
        if (televisionDatabase.stream().noneMatch(tv -> tv.id.equals(id))) {
            throw new ProductNotFoundException(id);
        }
        televisionDatabase.add(id, television);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        if (televisionDatabase.stream().noneMatch(tv -> tv.id.equals(id))) {
            throw new ProductNotFoundException(id);
        }
        televisionDatabase.remove((int) id);
    }

    // add two tv's to the database on start-up (for testing purposes)
    @PostConstruct
    private void init() {
        Television tv1 = new Television(1, "LG Oled 4K");
        Television tv2 = new Television(2, "Samsung Qled 8k");
        televisionDatabase.addAll(List.of(tv1, tv2));
    }

}
