package com.tech_it_easy.TechItEasy.dtos;

public record RemoteResponseDto(
        Long id,
        String compatibleWith,
        String batteryType,
        String name,
        String brand,
        Double price
) {
}
