package com.tech_it_easy.TechItEasy.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;

@Entity
@Table(name="televisions")
public class Television {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String name;

    @Column(precision = 8, scale = 2, nullable = false)
    @Check(constraints = "price >= 0.00")
    private BigDecimal price;

    @Column(precision = 8, nullable = false)
    private Double availableSize;

    @Column(precision = 4, nullable = false)
    private Integer refreshRate;

    @Column(nullable = false)
    private String screenType;

    @Column(nullable = false)
    private String screenQuality;

    @Column(nullable = false)
    private boolean isSmartTv;

    @Column(nullable = false)
    private boolean hasWifi;

    @Column(nullable = false)
    private boolean hasVoiceControl;

    @Column(nullable = false)
    private boolean hasHdr;

    @Column(nullable = false)
    private boolean hasBluetooth;

    @Column(nullable = false)
    private boolean hasAmbiLight;

    @Column(name = "original_stock", precision = 8, nullable = false)
    @Check(constraints = "original_stock >= 0.00")
    private Integer originalStock;

    @Column(precision = 8, nullable = false)
    @Check(constraints = "sold >= 0.00")
    private Integer sold;

    @OneToOne(optional = true)
    @JoinColumn(name = "remote_controller_id", referencedColumnName = "id")
    private Remote remote;

    public Television() {}

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
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

    public Remote getRemote() {
        return remote;
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

    public void setPrice(BigDecimal price) {
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

    public void setRemote(Remote remote) {
        this.remote = remote;
    }
}
