package com.company.lesson5;

public class Looping {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }
    }
}
