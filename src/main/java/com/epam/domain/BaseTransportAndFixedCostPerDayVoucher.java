package com.epam.domain;

abstract public class BaseTransportAndFixedCostPerDayVoucher extends BaseFixedCostPerDayVoucher {
    private TransportType transport;

    public BaseTransportAndFixedCostPerDayVoucher(String type) {
        super(type);
    }

    @Override
    public final TransportType getTransport() {
        return transport;
    }

    public final void setTransport(TransportType transport) {
        this.transport = transport;
    }
}
