package com.company.lesson32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class SetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode temp = new ListNode(0);
        int i1 = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        temp.next = head;
        for (int i = 0; i < i1 - 1; i++) {
            head.next = new ListNode(sc.nextInt());
            head = head.next;
        }

        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


        linkedList.get(2);

        ArrayList<Integer> integerArrayList= new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        integerArrayList.get(2);


//
//        ListNode listNode6 = new ListNode(6);
//        ListNode listNode5 = new ListNode(5, listNode6);
//        ListNode listNode4 = new ListNode(4, listNode5);
//        ListNode listNode3 = new ListNode(3, listNode4);
//        ListNode listNode2 = new ListNode(5, listNode3);
//        ListNode listNode1 = new ListNode(2, listNode2);
//        System.out.println();

        System.out.println("silmek ucun olan");
        System.out.println(removeElements(temp.next, sc.nextInt()));
    }

    //1 2 5 3 4 5 6
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        head = temp;
        while (head.next != null) {
//            if (head.next.val == val) {
//                head.next = head.next.next;
//            } else {
//                head = head.next;
//            }
        }
        return temp.next;

    }

}
