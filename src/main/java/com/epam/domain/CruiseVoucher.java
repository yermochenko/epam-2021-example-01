package com.epam.domain;

import com.epam.console.controller.Test;

public class CruiseVoucher extends BaseFixedCostPerDayVoucher {
    public CruiseVoucher() {
        super("круиз");
    }

    @Override
    public TransportType getTransport() {
        return Test.shipTransportType;
    }
}
