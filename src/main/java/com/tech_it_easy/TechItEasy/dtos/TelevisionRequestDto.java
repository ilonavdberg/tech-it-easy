package com.tech_it_easy.TechItEasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class TelevisionRequestDto {
    @NotBlank
    public String type;
    @NotBlank
    public String brand;
    @NotBlank
    public String name;
    @PositiveOrZero
    public Double price;
    @PositiveOrZero
    public Double availableSize;
    @PositiveOrZero
    public Integer refreshRate;
    @NotBlank
    public String screenType;
    @NotBlank
    public String screenQuality;
    @NotNull
    public Boolean isSmartTv;
    @NotNull
    public Boolean hasWifi;
    @NotNull
    public Boolean hasVoiceControl;
    @NotNull
    public Boolean hasHdr;
    @NotNull
    public Boolean hasBluetooth;
    @NotNull
    public Boolean hasAmbiLight;
    @PositiveOrZero
    public Integer originalStock;
    @PositiveOrZero
    public Integer sold;

    //Getters
    public @NotBlank String getType() {
        return type;
    }

    public @NotBlank String getBrand() {
        return brand;
    }

    public @NotBlank String getName() {
        return name;
    }

    public @PositiveOrZero Double getPrice() {
        return price;
    }

    public @PositiveOrZero Double getAvailableSize() {
        return availableSize;
    }

    public @PositiveOrZero Integer getRefreshRate() {
        return refreshRate;
    }

    public @NotBlank String getScreenType() {
        return screenType;
    }

    public @NotBlank String getScreenQuality() {
        return screenQuality;
    }

    public @NotNull Boolean getIsSmartTv() {
        return isSmartTv;
    }

    public @NotNull Boolean getHasWifi() {
        return hasWifi;
    }

    public @NotNull Boolean getHasVoiceControl() {
        return hasVoiceControl;
    }

    public @NotNull Boolean getHasHdr() {
        return hasHdr;
    }

    public @NotNull Boolean getHasBluetooth() {
        return hasBluetooth;
    }

    public @NotNull Boolean getHasAmbiLight() {
        return hasAmbiLight;
    }

    public @PositiveOrZero Integer getOriginalStock() {
        return originalStock;
    }

    public @PositiveOrZero Integer getSold() {
        return sold;
    }
}
