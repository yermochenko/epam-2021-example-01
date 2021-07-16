package com.epam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Xyz {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        /*Abc abc = new Abc(12, 34);
        System.out.println(abc.sum(56));*/
        Class<?> c = Class.forName("com.epam.Abc");
        Constructor<?> cn = c.getConstructor(Integer.class, Integer.class);
        Object obj = cn.newInstance(12, 13);
        Field f = c.getDeclaredField("b");
        f.setAccessible(true);
        Integer i = 34;
        f.set(obj, i);
        f.setAccessible(false);
        Method m = c.getMethod("sum", Integer.class);
        Object res = m.invoke(obj, 56);
        System.out.println(res);
        System.out.println(obj instanceof Object);
    }

}
