package com.company.lesson32;

public class ListNode <T>{
    public T val;
    public ListNode<T> next;

    ListNode(T val) {
        this.val = val;
    }

    ListNode(T val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
