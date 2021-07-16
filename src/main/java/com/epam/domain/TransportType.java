package com.epam.domain;

public class TransportType {
    private Long id;
    private String name;
    private Long costPerKilometer;

    public TransportType(Long id, String name, Long costPerKilometer) {
        this.id = id;
        this.name = name;
        this.costPerKilometer = costPerKilometer;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getCostPerKilometer() {
        return costPerKilometer;
    }

    @Override
    public String toString() {
        return "TransportType {id = " + id + ", name = " + name + ", costPerKilometer = " + costPerKilometer + "}";
    }
}
