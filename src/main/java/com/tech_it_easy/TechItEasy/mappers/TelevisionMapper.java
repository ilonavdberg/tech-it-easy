package com.tech_it_easy.TechItEasy.mappers;

import com.tech_it_easy.TechItEasy.dtos.TelevisionRequestDto;
import com.tech_it_easy.TechItEasy.dtos.TelevisionResponseDto;
import com.tech_it_easy.TechItEasy.dtos.TelevisionSalesInfoResponseDTO;
import com.tech_it_easy.TechItEasy.models.Television;

import java.util.List;


public class TelevisionMapper {
    public static TelevisionResponseDto toTelevisionDto(Television television) {
        return new TelevisionResponseDto(
                television.getId(),
                television.getType(),
                television.getBrand(),
                television.getName(),
                television.getPrice(),
                television.getAvailableSize(),
                television.getRefreshRate(),
                television.getScreenType(),
                television.getScreenQuality(),
                television.getIsSmartTv(),
                television.getHasWifi(),
                television.getHasVoiceControl(),
                television.getHasHdr(),
                television.getHasBluetooth(),
                television.getHasAmbiLight()
        );
    }

    public static List<TelevisionResponseDto> toTelevisionDtoList(List<Television> televisions) {
        return televisions.stream().map(TelevisionMapper::toTelevisionDto).toList();
    }

    public static TelevisionSalesInfoResponseDTO toTelevisionSalesInfoDto(Television television) {
        return new TelevisionSalesInfoResponseDTO(
                television.getId(),
                television.getPrice(),
                television.getOriginalStock(),
                television.getSold()
        );
    }

    public static List<TelevisionSalesInfoResponseDTO> toTelevisionSalesInfoDtoList(List<Television> televisions) {
        return televisions.stream().map(TelevisionMapper::toTelevisionSalesInfoDto).toList();
    }

    public static Television toTelevision(TelevisionRequestDto request) {
        Television television = new Television();

        television.setType(request.getType());
        television.setBrand(request.getBrand());
        television.setName(request.getName());
        television.setPrice(request.getPrice());
        television.setAvailableSize(request.getAvailableSize());
        television.setRefreshRate(request.getRefreshRate());
        television.setScreenType(request.getScreenType());
        television.setScreenQuality(request.getScreenQuality());
        television.setIsSmartTv(request.getIsSmartTv());
        television.setHasWifi(request.getHasWifi());
        television.setHasVoiceControl(request.getHasVoiceControl());
        television.setHasHdr(request.getHasHdr());
        television.setHasBluetooth(request.getHasBluetooth());
        television.setHasAmbiLight(request.getHasAmbiLight());
        television.setOriginalStock(request.getOriginalStock());
        television.setSold(request.getSold());

        return television;
    }
}
