package com.tech_it_easy.TechItEasy.mappers;

import com.tech_it_easy.TechItEasy.dtos.WallBracketRequestDto;
import com.tech_it_easy.TechItEasy.dtos.WallBracketResponseDto;
import com.tech_it_easy.TechItEasy.models.WallBracket;

import java.util.List;

public class WallBracketMapper {
    public static WallBracketResponseDto toWallBracketDto(WallBracket wallBracket) {
        return new WallBracketResponseDto(
                wallBracket.getId(),
                wallBracket.getSize(),
                wallBracket.getAdjustable(),
                wallBracket.getName(),
                wallBracket.getPrice()
        );
    }

    public static List<WallBracketResponseDto> toWallBracketDtoList(List<WallBracket> wallBrackets) {
        return wallBrackets.stream().map(WallBracketMapper::toWallBracketDto).toList();
    }

    public static WallBracket toWallBracket(WallBracketRequestDto request) {
        WallBracket wallBracket = new WallBracket();

        wallBracket.setSize(request.getSize());
        wallBracket.setAdjustable(request.getAdjustable());
        wallBracket.setName(request.getName());
        wallBracket.setPrice(request.getPrice());
        wallBracket.setOriginalStock(request.getOriginalStock());

        return wallBracket;
    }
}
