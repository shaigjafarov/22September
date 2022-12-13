package com.company.lesson31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);

        set.add(null);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        System.out.println(set);

        Telebe t1 = new Telebe("Samir");
        Telebe t2 = new Telebe("Xeyal");
        Telebe t3 = new Telebe("Resad");
        Telebe t4 = new Telebe("Sahil");


        ArrayList<Telebe> telebeList= new ArrayList<>();
        telebeList.add(t1);
        telebeList.add(t2);
        telebeList.add(t3);
        telebeList.add(t4);


        LinkedHashSet<Telebe> telebeLinkedHashSet= new LinkedHashSet<>(telebeList);



        System.out.println(telebeLinkedHashSet);
        TreeSet<Telebe> treeSet= new TreeSet<>(telebeLinkedHashSet);
        System.out.println(treeSet);
    }




}
