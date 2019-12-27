package com.itweixiang.dataStructure.linear.linkedList;

public class CircularLinkedList {
    CircularLinkedListNode head;


    public void add(CircularLinkedListNode add) {
        if (head == null) {
            head = add;
        } else {
            CircularLinkedListNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = add;
        }
        add.next = head;
    }

    public void printLinkedList() {
        CircularLinkedListNode temp = head;
        while (temp.next != head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    /**
     * 约瑟夫环，在temp == temp.next，时结束循环
     * @param start
     * @param k
     */
    public void josephRing(int start, int k) {
        CircularLinkedListNode temp = head;
        for (int i = 0; i < start; i++) {
            temp = temp.next;
        }
        while (temp != temp.next) {
            CircularLinkedListNode pre = temp;
            for (int i = k; i > 1; i--) {
                pre = temp;
                temp = temp.next;
            }
            System.out.println(temp.data);
            pre.next = temp.next;
        }
    }

}
