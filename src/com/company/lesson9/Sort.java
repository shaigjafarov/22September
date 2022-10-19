package com.company.lesson9;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[][] numbers = {{2, 8, 5},{3,4},{6}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");

            }
            System.out.println();


        }


//        System.out.println(Arrays.binarySearch(numbers, 5));
    }
}
