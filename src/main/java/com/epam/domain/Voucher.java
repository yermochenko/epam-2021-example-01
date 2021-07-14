package com.epam.domain;

public class Voucher {
    private Long id;
    private String country;
    private VoucherType type;
    private TransportType transport;
    private Double distance;
    private FoodType food;
    private Integer days;
    private Long costPerDay;
    private Boolean hot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public VoucherType getType() {
        return type;
    }

    public void setType(VoucherType type) {
        this.type = type;
    }

    public TransportType getTransport() {
        return transport;
    }

    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public FoodType getFood() {
        return food;
    }

    public void setFood(FoodType food) {
        this.food = food;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Long getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Long costPerDay) {
        this.costPerDay = costPerDay;
    }

    public Boolean getHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public Long getPrice() {
        Long price = days * costPerDay;
        price += (long)(distance * transport.getCostPerKilometer());
        if(food != null) {
            price += days * food.getCostPerDay();
        }
        if(hot) {
            price = (long)(price * 0.9);
        }
        return price;
    }
}
