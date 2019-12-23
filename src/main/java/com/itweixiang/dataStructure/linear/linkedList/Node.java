package com.itweixiang.dataStructure.linear.linkedList;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public static Node newInstance(int data) {
        return new Node(data);
    }
}
