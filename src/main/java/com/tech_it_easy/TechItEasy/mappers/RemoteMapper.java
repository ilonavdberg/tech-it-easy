package com.tech_it_easy.TechItEasy.mappers;

import com.tech_it_easy.TechItEasy.dtos.RemoteRequestDto;
import com.tech_it_easy.TechItEasy.dtos.RemoteResponseDto;
import com.tech_it_easy.TechItEasy.models.Remote;

import java.util.List;

public class RemoteMapper {
    public static RemoteResponseDto toRemoteDto(Remote remote) {
        return new RemoteResponseDto(
                remote.getId(),
                remote.getCompatibleWith(),
                remote.getBatteryType(),
                remote.getName(),
                remote.getBrand(),
                remote.getPrice()
        );
    }

    public static List<RemoteResponseDto> toRemoteDtoList(List<Remote> remotes) {
        return remotes.stream().map(RemoteMapper::toRemoteDto).toList();
    }

    public static Remote toRemote(RemoteRequestDto request) {
        Remote remote = new Remote();

        remote.setCompatibleWith(request.getCompatibleWith());
        remote.setBatteryType(request.getBatteryType());
        remote.setName(request.getName());
        remote.setBrand(request.getBrand());
        remote.setPrice(request.getPrice());
        remote.setOriginalStock(request.getOriginalStock());

        return remote;
    }
}
