package com.epam.domain;

abstract public class Voucher {
    private Long id;
    private String country;
    private String type;
    private Double distance;
    private FoodType food;
    private Integer days;
    private Boolean hot;

    public Voucher(String type) {
        this.type = type;
    }

    public final Long getId() {
        return id;
    }

    public final void setId(Long id) {
        this.id = id;
    }

    public final String getCountry() {
        return country;
    }

    public final void setCountry(String country) {
        this.country = country;
    }

    public final String getType() {
        return type;
    }

    public final Double getDistance() {
        return distance;
    }

    public final void setDistance(Double distance) {
        this.distance = distance;
    }

    public final FoodType getFood() {
        return food;
    }

    public final void setFood(FoodType food) {
        this.food = food;
    }

    public final Integer getDays() {
        return days;
    }

    public final void setDays(Integer days) {
        this.days = days;
    }

    public final Boolean getHot() {
        return hot;
    }

    public final void setHot(Boolean hot) {
        this.hot = hot;
    }

    public abstract TransportType getTransport();

    public abstract Long getCostPerDay();

    public Long getPrice() {
        Long price = days * getCostPerDay();
        TransportType transport = getTransport();
        if(transport != null) {
            price += (long)(distance * getTransport().getCostPerKilometer());
        }
        if(food != null) {
            price += days * food.getCostPerDay();
        }
        if(hot) {
            price = (long)(price * 0.9);
        }
        return price;
    }

    @Override
    public String toString() {
        return "Voucher {\n\tid = " + id
                + ",\n\tcountry = " + country
                + ",\n\ttype = " + type
                + ",\n\tdistance = " + distance
                + ",\n\tfood = " + food
                + ",\n\tdays = " + days
                + ",\n\thot = " + hot
                + ",\n\tgetTransport() = " + getTransport()
                + ",\n\tgetCostPerDay() = " + getCostPerDay()
                + ",\n\tgetPrice() = " + getPrice()
                + "\n}";
    }
}
