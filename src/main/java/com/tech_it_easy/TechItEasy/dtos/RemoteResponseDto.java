package com.tech_it_easy.TechItEasy.dtos;

import java.math.BigDecimal;

public record RemoteResponseDto(
        Long id,
        String compatibleWith,
        String batteryType,
        String name,
        String brand,
        BigDecimal price
) {
}
