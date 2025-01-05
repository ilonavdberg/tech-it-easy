package com.tech_it_easy.TechItEasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public class CIModuleRequestDto {
    @NotBlank
    private String name;
    @NotBlank
    private String brand;
    @PositiveOrZero
    private BigDecimal price;
    @PositiveOrZero
    private Integer originalStock;

    //Getters
    public @NotBlank String getName() {
        return name;
    }

    public @NotBlank String getBrand() {
        return brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public @PositiveOrZero Integer getOriginalStock() {
        return originalStock;
    }
}
