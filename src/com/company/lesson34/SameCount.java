package com.company.lesson34;



import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SameCount {

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        List<String> lazimsiz = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " ");
        for (int i = 0; i < str.length(); i++) {
            String tempLetter = str.charAt(i) + "";
            if (!lazimsiz.contains(tempLetter)) {
                if (map.containsKey(tempLetter)) {
                    Integer count=map.get(tempLetter) + 1;
                    map.put(tempLetter,count);
                } else {
                    map.put(tempLetter, 1);
                }
            }

        }
        System.out.println(map);


    }
}
