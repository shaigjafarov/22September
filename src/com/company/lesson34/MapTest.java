package com.company.lesson34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
//        Map<A, Integer> map= new TreeMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(3, 5);
        map1.put(4, 7);
        map1.put(5, 2);
        map1.put(1, 1);
        map1.put(2, 3);

        Set<Integer> keyS = map1.keySet();
        for (Integer a : keyS) {
//            System.out.println("key: "+a+"  value: "+map1.get(a));
        }
        Set<Entry<Integer, Integer>> entries = map1.entrySet();

        for (Entry entry : entries) {
//            System.out.println("key: "+entry.getKey()+"  value: "+entry.getValue());
        }
        for (Integer a:map1.values()
             ) {
            System.out.println(a);

        }
        map1.containsValue(2);

        Iterator<Entry<Integer, Integer>> iterator = map1.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Integer, Integer> keyValue = iterator.next();
            System.out.println("key: " + keyValue.getKey() + "  value: " + keyValue.getValue());
        }
//        Iterator<> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//       map1.
    }





//        System.out.println(map1);
//        A a= new A("a");
//        A a1= new A("a1");
//
//        map.put(a, 1);
//        map.put(a1, 2);
//        map.put(null, 2);
//        System.out.println(map);
}


class A {
    String asd;

    public A(String asd) {
        this.asd = asd;
    }

    @Override
    public String toString() {
        return "A{" +
                "asd='" + asd + '\'' +
                '}';
    }
}

