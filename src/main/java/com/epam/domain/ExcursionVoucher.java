package com.epam.domain;

public class ExcursionVoucher extends BaseTransportAndFixedCostPerDayVoucher {
    private Long excursionCost;

    public ExcursionVoucher() {
        super("экскурсия");
    }

    public Long getExcursionCost() {
        return excursionCost;
    }

    public void setExcursionCost(Long excursionCost) {
        this.excursionCost = excursionCost;
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + excursionCost;
    }
}
