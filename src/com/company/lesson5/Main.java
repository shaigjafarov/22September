package com.company.lesson5;

public class Main {
    public static void main(String[] args) {
        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken *= 2;
        ticketsSold += (long)1;

        System.out.println(ticketsSold);
//        ticketsSold = ticketsSold+ (long)1;

    }

}
