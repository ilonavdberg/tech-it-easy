package com.tech_it_easy.TechItEasy.dtos;

public record WallBracketResponseDto(
        Long id,
        String size,
        Boolean adjustable,
        String name,
        java.math.BigDecimal price
) {
}
