package com.company.lesson28.lab;

import java.util.Objects;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
//        Cat cat = (Cat) o;
//        return Objects.equals(name, cat.name);
//    }

}

