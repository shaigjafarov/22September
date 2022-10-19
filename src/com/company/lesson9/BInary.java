package com.company.lesson9;

import java.util.Arrays;

public class BInary {

    public static void main(String[] args) {
        int [] numbers = {3,6,7,1,23,56,43,67,49};
        int position = Arrays.binarySearch(numbers, 24);
        System.out.println(position);
    }
}
