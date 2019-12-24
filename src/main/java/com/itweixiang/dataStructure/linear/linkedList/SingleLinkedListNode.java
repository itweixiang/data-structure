package com.itweixiang.dataStructure.linear.linkedList;

public class SingleLinkedListNode {
    int data;
    SingleLinkedListNode next;

    public SingleLinkedListNode(int data) {
        this.data = data;
    }

    public static SingleLinkedListNode newInstance(int data) {
        return new SingleLinkedListNode(data);
    }
}
