package com.epam.domain;

public class Voucher {
    private Long id;                 // required field
    private String country;          // required field
    private VoucherType type;        // required field
    private TransportType transport; // required field
    private FoodType food;
    private Integer days;            // required field
    private Long price;              // required field
    private Boolean hot;

    public Voucher(Long id, String country, VoucherType type, TransportType transport, FoodType food, Integer days, Long price, Boolean hot) {
        this.id = id;
        this.country = country;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.days = days;
        this.price = price;
        this.hot = hot;
        if(!checkState()) {
            throw new NullPointerException();
        }
    }

    private Voucher() {}

    public Long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public VoucherType getType() {
        return type;
    }

    public TransportType getTransport() {
        return transport;
    }

    public FoodType getFood() {
        return food;
    }

    public Integer getDays() {
        return days;
    }

    public Long getPrice() {
        return price;
    }

    public Boolean getHot() {
        return hot;
    }

    private boolean checkState() {
        return id        != null
            && country   != null
            && type      != null
            && transport != null
            && days      != null
            && price     != null;
    }

    public static class Builder {
        private Voucher voucher;

        public Builder() {
            voucher = new Voucher();
        }

        public Voucher build() {
            if(voucher.checkState()) {
                return voucher;
            } else {
                return null;
            }
        }

        public Builder setId(Long id) {
            voucher.id = id;
            return this;
        }

        public Builder setCountry(String country) {
            voucher.country = country;
            return this;
        }

        public Builder setType(VoucherType type) {
            voucher.type = type;
            return this;
        }

        public Builder setTransport(TransportType transport) {
            voucher.transport = transport;
            return this;
        }

        public Builder setFood(FoodType food) {
            voucher.food = food;
            return this;
        }

        public Builder setDays(Integer days) {
            voucher.days = days;
            return this;
        }

        public Builder setPrice(Long price) {
            voucher.price = price;
            return this;
        }

        public Builder setHot(Boolean hot) {
            voucher.hot = hot;
            return this;
        }
    }
}
