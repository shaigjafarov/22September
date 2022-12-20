package com.company.lesson37;

public class Testwe {

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException | ClassCastException |  ArithmeticException sq) {
            sq.printStackTrace();
        } finally {
            System.out.println("Bura isledi");
        }

    }

}
