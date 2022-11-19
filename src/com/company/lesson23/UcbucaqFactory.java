package com.company.lesson23;

public class UcbucaqFactory {

    public static void main(String[] args) {
        Triangle triangle = getObj(4, 3, 5);

        System.out.println(triangle);

    }

    public static Triangle getObj(Integer a, Integer b, Integer c) {
        if (a == b && a == c) {
            return new BerabaerTefli(a, b, c);
        } else if (a == b || a == c || b == c) {
            return new BeraberYanli(a, b, c);
        } else if (((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b))) {
            return new Duzbacli(a, b, c);
        }
        return null;

    }
}
