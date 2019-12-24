package com.itweixiang.dataStructure.linear.linkedList;

import java.util.Stack;

/**
 * 单向链表
 */
public class SingleLinkedList {
    /**
     * 头节点，一般不用于数据操作
     */
    SingleLinkedListNode head = new SingleLinkedListNode(-1);

    public static SingleLinkedList newInstance() {
        return new SingleLinkedList();
    }

    /**
     * 直接添加
     *
     * @param add
     */
    public void add(SingleLinkedListNode add) {
        SingleLinkedListNode temp = head;
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
    public void addByOrder(SingleLinkedListNode sort) {
        SingleLinkedListNode temp = head.next;
        SingleLinkedListNode pre = head;
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
        SingleLinkedListNode temp = head.next;
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
    public void delete(SingleLinkedListNode delete) {
        SingleLinkedListNode temp = head.next;
        SingleLinkedListNode pre = head;
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
        SingleLinkedListNode temp = head.next;
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
    public SingleLinkedListNode findBackwordKNode(int k) {
        int count = size() - k;
        SingleLinkedListNode temp = head.next;
        for (int i = 0; i < count; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 链表反转
     */
    public void reverseLinkedList() {
        SingleLinkedListNode temp = head.next;
        SingleLinkedListNode reverseHead = SingleLinkedListNode.newInstance(-1);
        while (temp != null) {
            SingleLinkedListNode next = temp.next;
            SingleLinkedListNode reverseNext = reverseHead.next;
            reverseHead.next = temp;
            reverseHead.next.next = reverseNext;
            temp = next;
        }
        this.head = reverseHead;
    }

    /**
     * 倒序打印链表
     *
     * 1、反转链表，然后打印，（破坏链表结构）
     * 2、使用栈存储，然后弹出
     */
    public void printLinkedListFromTail() {
        SingleLinkedListNode temp = head.next;
        Stack<SingleLinkedListNode> stack = new Stack();
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().data);
        }
    }
}
