package com.company.lesson50;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Refle {


    public static void main(String[] args) {

        try {



//            Class<?> refle = Class.forName("com.company.lesson50.Salam");
            Class<?> refle = Salam.class;
//            Class<Salam> salamClass = Salam.class;
//            Salam salam= new Salam();
//            Class<? extends Salam> aClass = salam.getClass();


            Method hi = refle.getDeclaredMethod("hi", int.class, int.class);
            hi.setAccessible(true);

            Field[] declaredFields = refle.getDeclaredFields();
            declaredFields[0].setAccessible(true);
//            System.out.println(declaredFields[0].get(e));



//            Integer invoke = (Integer) hi.invoke(e, 7, 6);
//            System.out.println(invoke);


//            Arrays.stream(hi.getParameterTypes()).forEach(System.out::println);
//            Arrays.stream(refle.getMethods()).forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

class Salam extends Object {

    private String name="Vahid";


    private int hi(int a, int b) {

        return a + b;
    }

    public void hi() {

        System.out.println("a");
    }


}