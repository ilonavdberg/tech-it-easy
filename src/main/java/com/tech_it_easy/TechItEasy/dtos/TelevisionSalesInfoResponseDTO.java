package com.tech_it_easy.TechItEasy.dtos;

public record TelevisionSalesInfoResponseDTO(
        Long id,
        Double price,
        Integer originalStock,
        Integer sold
) {
}
