package com.epam.domain;

abstract public class BaseFixedCostPerDayVoucher extends Voucher {
    private Long costPerDay;

    public BaseFixedCostPerDayVoucher(String type) {
        super(type);
    }

    @Override
    public final Long getCostPerDay() {
        return costPerDay;
    }

    public final void setCostPerDay(Long costPerDay) {
        this.costPerDay = costPerDay;
    }
}
