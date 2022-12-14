package com.company.lesson33;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> stringMap= new HashMap<>();
        stringMap.put(1, "Sahil");
        stringMap.put(2, "Reshad");


        System.out.println(stringMap);

        Map<String, List<String>> qrupMap= new HashMap<>();

//        qrupMap.put(new Teacher("ad"), List.of("Cingiz", "Sahil", "Ferid"));
//        qrupMap.put(null, List.of("Kenan", "Sahil", "Ferid"));
//
//        qrupMap.putIfAbsent();

        System.out.println(qrupMap);





    }
}
