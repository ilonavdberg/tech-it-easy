package com.tech_it_easy.TechItEasy.dtos;

import java.math.BigDecimal;

public record TelevisionResponseDto(
        Long id,
        String type,
        String brand,
        String name,
        BigDecimal price,
        Double availableSize,
        Integer refreshRate,
        String screenType,
        String screenQuality,
        Boolean isSmartTv,
        Boolean hasWifi,
        Boolean hasVoiceControl,
        Boolean hasHdr,
        Boolean hasBluetooth,
        Boolean hasAmbiLight,
        RemoteResponseDto remoteController
) {
}
