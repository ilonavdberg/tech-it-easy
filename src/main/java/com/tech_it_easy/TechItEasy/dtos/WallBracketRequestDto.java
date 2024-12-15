package com.tech_it_easy.TechItEasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class WallBracketRequestDto {
    @NotBlank
    String size;
    @NotNull
    Boolean adjustable;
    @NotBlank
    String name;
    @PositiveOrZero
    Double price;
    @PositiveOrZero
    Integer originalStock;

    //Getters
    public @NotBlank String getSize() {
        return size;
    }

    public @NotNull Boolean getAdjustable() {
        return adjustable;
    }

    public @NotBlank String getName() {
        return name;
    }

    public @PositiveOrZero Double getPrice() {
        return price;
    }

    public @PositiveOrZero Integer getOriginalStock() {
        return originalStock;
    }
}
