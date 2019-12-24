package com.itweixiang.dataStructure.linear.linkedList;

public class DoubleLinkedListNode {
    DoubleLinkedListNode next;
    DoubleLinkedListNode pre;
    int data;

    public DoubleLinkedListNode(int data) {
        this.data = data;
    }

    public static DoubleLinkedListNode newInstance(int data) {
        return new DoubleLinkedListNode(data);
    }
}
