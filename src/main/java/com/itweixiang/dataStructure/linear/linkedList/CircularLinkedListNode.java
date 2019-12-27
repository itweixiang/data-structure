package com.itweixiang.dataStructure.linear.linkedList;

public class CircularLinkedListNode {
    CircularLinkedListNode next;
    int data;

    public CircularLinkedListNode(int data) {
        this.data = data;
    }

    public static CircularLinkedListNode newInstance(int data) {
        return new CircularLinkedListNode(data);
    }
}
