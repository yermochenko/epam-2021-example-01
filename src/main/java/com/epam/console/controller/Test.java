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

        TransportType airplanTransportType = new TransportType(1L, "самолёт");
        TransportType trainTransportType = new TransportType(2L, "поезд");
        TransportType busTransportType = new TransportType(3L, "автобус");
        TransportType shipTransportType = new TransportType(4L, "корабль");

        FoodType roFoodType = new FoodType(1L, "без питания");
        FoodType bbFoodType = new FoodType(2L, "завтрак");
        FoodType hbFoodType = new FoodType(3L, "завтрак + ужин");
        FoodType fbFoodType = new FoodType(4L, "завтрак + обед + ужин");
        FoodType aiFoodType = new FoodType(5L, "всё включено");

        List<Voucher> vouchers = new ArrayList<>();
        Voucher voucher = null;

        voucher = new Voucher();
        voucher.setId(1L);
        voucher.setCountry("Египет");
        voucher.setType(relaxationVoucherType);
        voucher.setTransport(airplanTransportType);
        voucher.setFood(aiFoodType);
        voucher.setDays(10);
        voucher.setPrice(80000L);
        voucher.setHot(true);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(2L);
        voucher.setCountry("Крым");
        voucher.setType(relaxationVoucherType);
        voucher.setTransport(trainTransportType);
        voucher.setFood(roFoodType);
        voucher.setDays(15);
        voucher.setPrice(55000L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(3L);
        voucher.setCountry("Германия");
        voucher.setType(excursionVoucherType);
        voucher.setTransport(busTransportType);
        voucher.setFood(bbFoodType);
        voucher.setDays(5);
        voucher.setPrice(99000L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(4L);
        voucher.setCountry("Германия");
        voucher.setType(shoppingVoucherType);
        voucher.setTransport(trainTransportType);
        voucher.setFood(hbFoodType);
        voucher.setDays(3);
        voucher.setPrice(87000L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(5L);
        voucher.setCountry("Израиль");
        voucher.setType(shoppingVoucherType);
        voucher.setTransport(airplanTransportType);
        voucher.setFood(bbFoodType);
        voucher.setDays(3);
        voucher.setPrice(79000L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(6L);
        voucher.setCountry("Израиль");
        voucher.setType(healingVoucherType);
        voucher.setTransport(shipTransportType);
        voucher.setFood(fbFoodType);
        voucher.setDays(21);
        voucher.setPrice(257000L);
        voucher.setHot(false);
        vouchers.add(voucher);

        voucher = new Voucher();
        voucher.setId(7L);
        voucher.setCountry("Бразилия");
        voucher.setType(cruiseVoucherType);
        voucher.setTransport(shipTransportType);
        voucher.setFood(aiFoodType);
        voucher.setDays(30);
        voucher.setPrice(1399000L);
        voucher.setHot(true);
        vouchers.add(voucher);
    }
}
