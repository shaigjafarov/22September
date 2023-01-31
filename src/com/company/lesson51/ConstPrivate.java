package com.company.lesson51;

import com.company.lesson22.abstraction.Car;
import java.lang.reflect.Constructor;

public class ConstPrivate {

    public static void main(String[] args) throws Exception {
        Class<?> clas1 = Cat.class;
        Constructor<?> declaredConstructor = clas1.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Cat salam = (Cat)declaredConstructor.newInstance("Salam");
        System.out.println( salam.getName());





    }


}

class Cat {

    private String name;

    private Cat(String name) {
        this.name = name;
    }
    private Cat(Integer sd) {
//        this.name = name;
    }
    @Deprecated
    public String getName() {
        return name;
    }
}
