package com.company.lesson34;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestMaind {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        String result = "";
        for (Entry<Integer, String> entry : map.entrySet()) {
            while (num >= entry.getKey()) {
                result =result+ entry.getValue();
                num =num- entry.getKey();
            }
        }
        System.out.println(result);    }
}
