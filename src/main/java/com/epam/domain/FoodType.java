package com.epam.domain;

public class FoodType {
    private Long id;
    private String name;

    public FoodType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
