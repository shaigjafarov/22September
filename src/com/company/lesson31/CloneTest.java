//package com.company.lesson31;
//
//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.List;
//import java.util.Vector;
//
//public class CloneTest {
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//
//        Telebe t1 = new Telebe("Samir");
//        Telebe t2 = new Telebe("Xeyal");
//        Telebe t3 = new Telebe("Resad");
//        Telebe t4 = new Telebe("Sahil");
//
//
//        ArrayList<Telebe> telebeList= new ArrayList<>();
//        telebeList.add(t1);
//        telebeList.add(t2);
//        telebeList.add(t3);
//        telebeList.add(t4);
//
//        ArrayList<Telebe> clone = (ArrayList<Telebe>) telebeList.clone();
//        ArrayList<Telebe> telebes = new ArrayList<>();
//        for (Telebe ds:telebeList) {
//            telebes.add(ds.clone());
//        }
//
//
//
////        telebeList.get(2).ad="Kenan";
//
//        System.out.println(telebeList);
//
//
//        System.out.println(clone);
//
//
//
//
//    }
//}
