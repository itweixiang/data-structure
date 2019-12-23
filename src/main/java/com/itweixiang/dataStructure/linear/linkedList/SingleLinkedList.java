package com.itweixiang.dataStructure.linear.linkedList;

/**
 * 单向链表
 */
public class SingleLinkedList {
    /**
     * 头节点，一般不用于数据操作
     */
    Node head = new Node(-1);

    public static SingleLinkedList newInstance() {
        return new SingleLinkedList();
    }

    /**
     * 直接添加
     *
     * @param add
     */
    public void add(Node add) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = add;
    }

    /**
     * 添加时进行排序
     *
     * @param sort
     */
    public void addByOrder(Node sort) {
        Node temp = head.next;
        Node pre = head;
        while (temp != null) {
            if (temp.data > sort.data) {
                break;
            }
            pre = temp;
            temp = temp.next;
        }
        pre.next = sort;
        sort.next = temp;
    }


    public void printLinkedList() {
        Node temp = head.next;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    /**
     * 删除
     *
     * @param delete
     */
    public void delete(Node delete) {
        Node temp = head.next;
        Node pre = head;
        while (temp != delete) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
    }

    /**
     * 得到元素个数
     *
     * @return
     */
    public int size() {
        Node temp = head.next;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /**
     * 寻找倒数第K个节点
     *
     * @param k
     * @return
     */
    public Node findBackwordKNode(int k) {
        int count = size() - k;
        Node temp = head.next;
        for (int i = 0; i < count; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
