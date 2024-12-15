package com.tech_it_easy.TechItEasy.dtos;

public record WallBracketResponseDto(
        Long id,
        String size,
        Boolean adjustable,
        String name,
        Double price
) {
}
