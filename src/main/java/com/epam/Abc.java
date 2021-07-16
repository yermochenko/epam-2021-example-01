package com.epam;

public class Abc {
    private Integer a;
    private Integer b;
    public static Integer c;

    public Abc(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer sum(Integer c) {
        return a + b + c;
    }

    public static void test() {
    }
}
