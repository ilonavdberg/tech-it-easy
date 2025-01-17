package com.tech_it_easy.TechItEasy.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "ci_modules")
public class CIModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String brand;

    @Column(precision = 8, scale = 2, nullable = false)
    @Check(constraints = "price >= 0.00")
    private BigDecimal price;

    @Column(name = "original_stock", precision = 8, nullable = false)
    @Check(constraints = "original_stock >= 0.00")
    private Integer originalStock;

    @OneToMany (mappedBy = "ciModule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Television> televisions;

    public CIModule() {}

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    public void addTelevision(Television television) {
        televisions.add(television);
    }
}
