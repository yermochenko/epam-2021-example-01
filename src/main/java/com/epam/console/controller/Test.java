package com.epam.console.controller;

import java.util.ArrayList;
import java.util.List;

import com.epam.domain.CruiseVoucher;
import com.epam.domain.ExcursionVoucher;
import com.epam.domain.FoodType;
import com.epam.domain.HealingVoucher;
import com.epam.domain.RelaxationVoucher;
import com.epam.domain.ShoppingVoucher;
import com.epam.domain.TransportType;
import com.epam.domain.Voucher;

public class Test {
    public static final TransportType airplanTransportType = new TransportType(1L, "самолёт", 10L);
    public static final TransportType trainTransportType = new TransportType(2L, "поезд", 15L);
    public static final TransportType busTransportType = new TransportType(3L, "автобус", 20L);
    public static final TransportType shipTransportType = new TransportType(4L, "корабль", 12L);

    public static final FoodType roFoodType = new FoodType(1L, "без питания", 0L);
    public static final FoodType bbFoodType = new FoodType(2L, "завтрак", 1500L);
    public static final FoodType hbFoodType = new FoodType(3L, "завтрак + ужин", 2500L);
    public static final FoodType fbFoodType = new FoodType(4L, "завтрак + обед + ужин", 3500L);
    public static final FoodType aiFoodType = new FoodType(5L, "всё включено", 5000L);

    public static void main(String[] args) {
        List<Voucher> vouchers = new ArrayList<>();

        RelaxationVoucher voucher1 = new RelaxationVoucher();
        voucher1.setId(1L);
        voucher1.setCountry("Египет");
        voucher1.setTransport(airplanTransportType);
        voucher1.setDistance(3_100.0);
        voucher1.setFood(aiFoodType);
        voucher1.setDays(10);
        voucher1.setCostPerDay(710L);
        voucher1.setHot(true);
        vouchers.add(voucher1);

        RelaxationVoucher voucher2 = new RelaxationVoucher();
        voucher2.setId(2L);
        voucher2.setCountry("Крым");
        voucher2.setTransport(trainTransportType);
        voucher2.setDistance(1_550.0);
        voucher2.setFood(roFoodType);
        voucher2.setDays(15);
        voucher2.setCostPerDay(2115L);
        voucher2.setHot(false);
        vouchers.add(voucher2);

        ExcursionVoucher voucher3 = new ExcursionVoucher();
        voucher3.setId(3L);
        voucher3.setCountry("Германия");
        voucher3.setTransport(busTransportType);
        voucher3.setDistance(1_400.0);
        voucher3.setFood(bbFoodType);
        voucher3.setDays(5);
        voucher3.setCostPerDay(5000L);
        voucher3.setExcursionCost(38500L);
        voucher3.setHot(false);
        vouchers.add(voucher3);

        ShoppingVoucher voucher4 = new ShoppingVoucher();
        voucher4.setId(4L);
        voucher4.setCountry("Германия");
        voucher4.setTransport(trainTransportType);
        voucher4.setDistance(1_400.0);
        voucher4.setFood(hbFoodType);
        voucher4.setDays(3);
        voucher4.setCostPerDay(5000L);
        voucher4.setCargoWeight(20.0);
        voucher4.setCargoCostPerKilogram(2175L);
        voucher4.setHot(false);
        vouchers.add(voucher4);

        ShoppingVoucher voucher5 = new ShoppingVoucher();
        voucher5.setId(5L);
        voucher5.setCountry("Израиль");
        voucher5.setTransport(airplanTransportType);
        voucher5.setDistance(2_800.0);
        voucher5.setFood(bbFoodType);
        voucher5.setDays(3);
        voucher5.setCostPerDay(4000L);
        voucher5.setCargoWeight(15.0);
        voucher5.setCargoCostPerKilogram(2300L);
        voucher5.setHot(false);
        vouchers.add(voucher5);

        HealingVoucher voucher6 = new HealingVoucher();
        voucher6.setId(6L);
        voucher6.setCountry("Израиль");
        voucher6.setDistance(3_800.0);
        voucher6.setFood(fbFoodType);
        voucher6.setDays(21);
        voucher6.setCostPerDay(6550L);
        voucher6.setHot(false);
        vouchers.add(voucher6);

        CruiseVoucher voucher7 = new CruiseVoucher();
        voucher7.setId(7L);
        voucher7.setCountry("Бразилия");
        voucher7.setDistance(10_000.0);
        voucher7.setFood(aiFoodType);
        voucher7.setDays(30);
        voucher7.setCostPerDay(42800L);
        voucher7.setHot(true);
        vouchers.add(voucher7);

        System.out.println(vouchers);
    }
}
