package com.tech_it_easy.TechItEasy.dtos;

import java.math.BigDecimal;

public record CIModuleResponseDto(
        Long id,
        String name,
        String brand,
        BigDecimal price
) {
}
