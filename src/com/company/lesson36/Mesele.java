package com.company.lesson36;

import java.util.Objects;

public class Mesele {

    String a;
    int b;
    public static void main(String[] args) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesele mesele = (Mesele) o;
        return b == mesele.b && Objects.equals(a, mesele.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
