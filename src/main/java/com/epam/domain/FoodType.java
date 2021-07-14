package com.epam.domain;

public class FoodType {
    private Long id;
    private String name;
    private Long costPerDay;

    public FoodType(Long id, String name, Long costPerDay) {
        this.id = id;
        this.name = name;
        this.costPerDay = costPerDay;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getCostPerDay() {
        return costPerDay;
    }
}
