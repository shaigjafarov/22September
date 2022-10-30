package com.company.lesson11;

public class OdurBudurFor {


    public static void main(String[] args) {
        String[] arr = {"Sahil", "Ferid", "Kenan", "Resad", "Cingiz"};
        int iterasiya = 6, nullCount = 0;
        for (int i = 0, j = 1; ; i++) {
            //array bir cevre kimi islemesi ucun arrayin sonuncu elementiden sonrda indexi birinci yere cekirik
            if (i == arr.length) {
                i = 0;
            }
            //Oyundan cixan adamlari(null deyerleri) saymamaq ucun uzerinden atlayiriq
            if (arr[i] == null) {
                continue;
            }
            //iterasiya saydigimiz adamlarin sayina beraber olanda hemin adami oyunnan cixaririq(null edirik)
            if (j != 0 && j % iterasiya == 0) {
                arr[i] = null;
                nullCount++;
                if (nullCount == arr.length - 1)
                    break;
            }
            j++;
        }

        for (String ad : arr) {
            if (ad != null)
                System.out.println(ad);
        }
    }
}
