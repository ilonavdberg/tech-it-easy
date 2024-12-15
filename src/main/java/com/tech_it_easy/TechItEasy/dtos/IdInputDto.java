package com.tech_it_easy.TechItEasy.dtos;

import jakarta.validation.constraints.Positive;

public class IdInputDto {
    @Positive
    Long id;

    //Getter
    public Long getId() {
        return id;
    }
}
