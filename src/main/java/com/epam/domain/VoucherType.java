package com.epam.domain;

public class VoucherType {
    private Long id;
    private String name;

    public VoucherType(Long id, String name) {
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
