package com.company.lesson8;

public class Srt {

    public static void main(String[] args) {
        int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8,-3};
        int temp, t = array.length;

        while (t > 0) {


            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            t--;
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
