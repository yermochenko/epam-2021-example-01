package com.epam.domain;

public class ShoppingVoucher extends BaseTransportAndFixedCostPerDayVoucher {
    private Double cargoWeight;
    private Long cargoCostPerKilogram;

    public ShoppingVoucher() {
        super("шоппинг");
    }

    public Double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Double cargo) {
        this.cargoWeight = cargo;
    }

    public Long getCargoCostPerKilogram() {
        return cargoCostPerKilogram;
    }

    public void setCargoCostPerKilogram(Long cargoCostPerKilogram) {
        this.cargoCostPerKilogram = cargoCostPerKilogram;
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + (long)(cargoWeight * cargoCostPerKilogram);
    }
}
