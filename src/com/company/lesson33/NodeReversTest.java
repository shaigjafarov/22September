package com.company.lesson33;

import java.util.LinkedList;
import java.util.Scanner;

public class NodeReversTest {

    public static void main(String[] args) {

//        LinkedList
        Scanner sc = new Scanner(System.in);
        ListNode temp = new ListNode(0);
        int i1 = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        temp.next = head;
        for (int i = 0; i < i1 - 1; i++) {
            head.next = new ListNode(sc.nextInt());
            head = head.next;
        }
        System.out.println(reverse(temp));

    }


    public static ListNode reverse(ListNode head) {
        ListNode temp = head.next;
        head.next=null;
        while(temp!=null){
            ListNode t = temp.next;
            temp.next = head;
            head = temp;
            temp = t;
        }
        return head;
    }
}
