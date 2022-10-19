package com.company.lesson11;

public class OdurBudurWhile {


    public static void main(String[] args) {
        String[] arr = {"Sahil", "Ferid", "Kenan", "Resad", "Cingiz"};
        int iterasiya = 4, nullCount = 0;

        int i = 0, j = 1;
        while (true) {
            if (i == arr.length) {
                i = 0;
            }
            if (arr[i] == null) {
                while (arr[i] == null) {
                    i++;
                    if (i == arr.length) {
                        i = 0;
                    }
                }
            }
            if (j != 0 && j % iterasiya == 0) {
                arr[i] = null;
                nullCount++;
                if (nullCount == arr.length - 1)
                    break;
            }
            i++;
            j++;
        }

        for (String ad : arr) {
            if (ad != null)
                System.out.println(ad);
        }


    }
}
