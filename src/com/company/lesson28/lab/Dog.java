package com.company.lesson28.lab;

import java.util.Objects;

public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog cat = (Dog) o;
        return Objects.equals(name, cat.name);
    }

}
