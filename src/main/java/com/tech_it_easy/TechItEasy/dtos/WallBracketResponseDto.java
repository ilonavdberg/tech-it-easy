package com.tech_it_easy.TechItEasy.dtos;

import java.math.BigDecimal;

public record WallBracketResponseDto(
        Long id,
        String size,
        Boolean adjustable,
        String name,
        BigDecimal price
) {
}
