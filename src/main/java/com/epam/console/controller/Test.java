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

        voucher = new Voucher.Builder()
        .setId(1L)
        .setCountry("Египет")
        .setPrice(80000L)
        .setDays(10)
        .setType(relaxationVoucherType)
        .setFood(aiFoodType)
        .setTransport(airplanTransportType)
        .setHot(true)
        .build();
        vouchers.add(voucher);

        voucher = new Voucher.Builder()
        .setId(2L)
        .setCountry("Крым")
        .setDays(15)
        .setType(relaxationVoucherType)
        .setPrice(55000L)
        .setTransport(trainTransportType)
        .build();
        vouchers.add(voucher);

        voucher = new Voucher.Builder()
        .setId(3L)
        .setCountry("Германия")
        .setType(excursionVoucherType)
        .setDays(5)
        .setTransport(busTransportType)
        .setPrice(99000L)
        .setFood(bbFoodType)
        .build();
        vouchers.add(voucher);

        voucher = new Voucher.Builder()
        .setId(4L)
        .setType(shoppingVoucherType)
        .setCountry("Германия")
        .setPrice(87000L)
        .setFood(hbFoodType)
        .setDays(3)
        .setTransport(trainTransportType)
        .build();
        vouchers.add(voucher);

        voucher = new Voucher.Builder()
        .setId(5L)
        .setType(shoppingVoucherType)
        .setCountry("Израиль")
        .setPrice(79000L)
        .setDays(3)
        .setTransport(airplanTransportType)
        .setFood(bbFoodType)
        .build();
        vouchers.add(voucher);

        voucher = new Voucher.Builder()
        .setId(6L)
        .setCountry("Израиль")
        .setType(healingVoucherType)
        .setTransport(shipTransportType)
        .setDays(21)
        .setPrice(257000L)
        .setFood(fbFoodType)
        .build();
        vouchers.add(voucher);

        voucher = new Voucher.Builder()
        .setId(7L)
        .setType(cruiseVoucherType)
        .setTransport(shipTransportType)
        .setFood(aiFoodType)
        .setDays(30)
        .setPrice(1399000L)
        .setCountry("Бразилия")
        .build();
        vouchers.add(voucher);
    }
}
