package com.tech_it_easy.TechItEasy.mappers;

import com.tech_it_easy.TechItEasy.dtos.CIModuleRequestDto;
import com.tech_it_easy.TechItEasy.dtos.CIModuleResponseDto;
import com.tech_it_easy.TechItEasy.models.CIModule;

import java.util.List;

public class CIModuleMapper {
    public static CIModuleResponseDto toCIModuleResponse(CIModule ciModule) {
        return new CIModuleResponseDto(
                ciModule.getId(),
                ciModule.getName(),
                ciModule.getBrand(),
                ciModule.getPrice()
        );
    }

    public static List<CIModuleResponseDto> toCIModuleResponseList(List<CIModule> ciModules) {
        return ciModules.stream().map(CIModuleMapper::toCIModuleResponse).toList();
    }

    public static CIModule toCIModule(CIModuleRequestDto request) {
        CIModule ciModule = new CIModule();

        ciModule.setName(request.getName());
        ciModule.setBrand(request.getBrand());
        ciModule.setPrice(request.getPrice());
        ciModule.setOriginalStock(request.getOriginalStock());

        return ciModule;
    }
}
