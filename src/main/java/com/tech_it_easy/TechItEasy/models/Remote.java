package com.tech_it_easy.TechItEasy.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "remote_controllers")
public class Remote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String compatibleWith;

    @Column(nullable = false)
    private String batteryType;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String brand;

    @Column(precision = 8, scale = 2, nullable = false)
    @Check(constraints = "price >= 0.00")
    private Double price;

    @Column(precision = 8, nullable = false)
    @Check(constraints = "originalStock >= 0.00")
    private Integer originalStock;

    public Remote() {}

    //Getters and setters

    public Long getId() {
        return id;
    }

    public String getCompatibleWith() {
        return compatibleWith;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setCompatibleWith(String compatibleWith) {
        this.compatibleWith = compatibleWith;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }
}
