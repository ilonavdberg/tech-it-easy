package com.tech_it_easy.TechItEasy.dtos;

public record TelevisionSalesInfoResponseDTO(
        Long id,
        java.math.BigDecimal price,
        Integer originalStock,
        Integer sold
) {
}
