package com.itweixiang.dataStructure.linkedList;

/**
 * 单向链表
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = LinkedList.newInstance();
        Node deleteNode = Node.newInstance(4);
        linkedList.add(Node.newInstance(1));
        linkedList.add(Node.newInstance(2));
        linkedList.add(deleteNode);
        linkedList.add(Node.newInstance(3));
        linkedList.add(Node.newInstance(5));
        linkedList.add(Node.newInstance(6));
        linkedList.printLinkedList();
        linkedList.delete(deleteNode);
        linkedList.printLinkedList();


    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public static Node newInstance(int data) {
        return new Node(data);
    }
}

class LinkedList {

    Node head;

    public static LinkedList newInstance() {
        return new LinkedList();
    }

    public void add(Node add) {
        if (add == null) return;
        if (head == null) {
            head = add;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = add;
    }


    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public void delete(Node delete) {
        if (delete == head) {
            head = null;
            return;
        }
        Node temp = head;
        Node pre = null;
        while (temp != delete) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
    }

}