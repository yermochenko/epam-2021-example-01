package com.epam.domain;

public class HealingVoucher extends BaseFixedCostPerDayVoucher {
    public HealingVoucher() {
        super("оздоровление");
    }

    @Override
    public TransportType getTransport() {
        return null;
    }
}
