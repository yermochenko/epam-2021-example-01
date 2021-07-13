package com.epam.domain;

public class TransportType {
    private Long id;
    private String name;

    public TransportType(Long id, String name) {
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
