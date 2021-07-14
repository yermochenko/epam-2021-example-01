package com.epam.console.controller;

import java.util.ArrayList;
import java.util.List;

import com.epam.domain.FoodType;
import com.epam.domain.TransportType;
import com.epam.domain.Voucher;
import com.epam.domain.VoucherType;

public class Test {
    public static void main(String[] args) {
        VoucherType relaxationVoucherType = new VoucherType(1L, "отдых");
        VoucherType excursionVoucherType = new VoucherType(2L, "экскурсия");
        VoucherType healingVoucherType = new VoucherType(3L, "оздоровление");
        VoucherType shoppingVoucherType = new VoucherType(4L, "шоппинг");
        VoucherType cruiseVoucherType = new VoucherType(5L, "круиз");

        TransportType airplanTransportType = new TransportType(1L, "самолёт", 10L);
        TransportType trainTransportType = new TransportType(2L, "поезд", 15L);
        TransportType busTransportType = new TransportType(3L, "автобус", 20L);
        TransportType shipTransportType = new TransportType(4L, "корабль", 12L);

        FoodType roFoodType = new FoodType(1L, "без питания", 0L);
        FoodType bbFoodType = new FoodType(2L, "завтрак", 1500L);
        FoodType hbFoodType = new FoodType(3L, "завтрак + ужин", 2500L);
        FoodType fbFoodType = new FoodType(4L, "завтрак + обед + ужин", 3500L);
        FoodType aiFoodType = new FoodType(5L, "всё включено", 5000L);

        List<Voucher> vouchers = new ArrayList<>();
        Voucher voucher = null;

        voucher = new Voucher();
        voucher.setId(1L);
        voucher.setCountry("Египет");
        voucher.setType(relaxationVoucherType);
        voucher.setTransport(airplanTransportType);
        voucher.setDistance(3_100.0);
        voucher.setFood(aiFoodType);
        voucher.setDays(10);
        voucher.setCostPerDay(710L);
        voucher.setHot(true);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(2L);
        voucher.setCountry("Крым");
        voucher.setType(relaxationVoucherType);
        voucher.setTransport(trainTransportType);
        voucher.setDistance(1_550.0);
        voucher.setFood(roFoodType);
        voucher.setDays(15);
        voucher.setCostPerDay(2115L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(3L);
        voucher.setCountry("Германия");
        voucher.setType(excursionVoucherType);
        voucher.setTransport(busTransportType);
        voucher.setDistance(1_400.0);
        voucher.setFood(bbFoodType);
        voucher.setDays(5);
        voucher.setCostPerDay(12700L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(4L);
        voucher.setCountry("Германия");
        voucher.setType(shoppingVoucherType);
        voucher.setTransport(trainTransportType);
        voucher.setDistance(1_400.0);
        voucher.setFood(hbFoodType);
        voucher.setDays(3);
        voucher.setCostPerDay(19500L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(5L);
        voucher.setCountry("Израиль");
        voucher.setType(shoppingVoucherType);
        voucher.setTransport(airplanTransportType);
        voucher.setDistance(2_800.0);
        voucher.setFood(bbFoodType);
        voucher.setDays(3);
        voucher.setCostPerDay(15500L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(6L);
        voucher.setCountry("Израиль");
        voucher.setType(healingVoucherType);
        voucher.setTransport(shipTransportType);
        voucher.setDistance(3_800.0);
        voucher.setFood(fbFoodType);
        voucher.setDays(21);
        voucher.setCostPerDay(6550L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(7L);
        voucher.setCountry("Бразилия");
        voucher.setType(cruiseVoucherType);
        voucher.setTransport(shipTransportType);
        voucher.setDistance(10_000.0);
        voucher.setFood(aiFoodType);
        voucher.setDays(30);
        voucher.setCostPerDay(42800L);
        voucher.setHot(true);
        vouchers.add(voucher);
    }
}
