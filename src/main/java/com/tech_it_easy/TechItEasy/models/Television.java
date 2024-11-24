package com.tech_it_easy.TechItEasy.models;


public class Television {
    public Integer id;
    public String name;

    public Television(Integer id, String name) {
        // In the future let Postgres generate the Id automatically
        this.id = id;
        this.name = name;
    }
}
