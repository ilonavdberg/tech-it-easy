package com.tech_it_easy.TechItEasy.models;

import jakarta.persistence.*;

@Entity
@Table(name = "wall_brackets")
public class WallBracket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String size;
    private Boolean adjustable;
    private String name;
    private Double price;
    private Integer originalStock;

    public WallBracket() {}

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public Boolean getAdjustable() {
        return adjustable;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAdjustable(Boolean adjustable) {
        this.adjustable = adjustable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }
}
