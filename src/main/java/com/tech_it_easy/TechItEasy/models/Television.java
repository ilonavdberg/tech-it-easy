package com.tech_it_easy.TechItEasy.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name="televisions")
public class Television {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
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


    public Television() {}

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getAvailableSize() {
        return availableSize;
    }

    public Integer getRefreshRate() {
        return refreshRate;
    }

    public String getScreenType() {
        return screenType;
    }

    public String getScreenQuality() {
        return screenQuality;
    }

    public Boolean getIsSmartTv() {
        return isSmartTv;
    }

    public Boolean getHasWifi() {
        return hasWifi;
    }

    public Boolean getHasVoiceControl() {
        return hasVoiceControl;
    }

    public Boolean getHasHdr() {
        return hasHdr;
    }

    public Boolean getHasBluetooth() {
        return hasBluetooth;
    }

    public Boolean getHasAmbiLight() {
        return hasAmbiLight;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public Integer getSold() {
        return sold;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAvailableSize(Double availableSize) {
        this.availableSize = availableSize;
    }

    public void setRefreshRate(Integer refreshRate) {
        this.refreshRate = refreshRate;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public void setScreenQuality(String screenQuality) {
        this.screenQuality = screenQuality;
    }

    public void setIsSmartTv(Boolean smartTv) {
        isSmartTv = smartTv;
    }

    public void setHasWifi(Boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public void setHasVoiceControl(Boolean hasVoiceControl) {
        this.hasVoiceControl = hasVoiceControl;
    }

    public void setHasHdr(Boolean hasHdr) {
        this.hasHdr = hasHdr;
    }

    public void setHasBluetooth(Boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public void setHasAmbiLight(Boolean hasAmbiLight) {
        this.hasAmbiLight = hasAmbiLight;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }
}
