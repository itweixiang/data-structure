package com.itweixiang.dataStructure.linear.linkedList;

/**
 * 双向链表
 */
public class DoubleLinkedList {

    DoubleLinkedListNode head = new DoubleLinkedListNode(-1);
    DoubleLinkedListNode tail = new DoubleLinkedListNode(-1);

    public DoubleLinkedList() {
        head.next = tail;
        tail.pre = head;
    }

    /**
     * 添加到头部
     *
     * @param node
     */
    public void addInHead(DoubleLinkedListNode node) {
        DoubleLinkedListNode next = head.next;
        next.pre = node;//原有节点头部指向新节点
        node.next = next;//新节点尾部指向原有节点
        node.pre = head;//新节点头部指向头节点
        head.next = node;//头节点尾部指向新节点
    }

    /**
     * 添加到尾部
     *
     * @param node
     */
    public void addInTail(DoubleLinkedListNode node) {
        DoubleLinkedListNode pre = tail.pre;
        pre.next = node;//原有节点尾部指向新节点
        node.pre = pre;//新节点头部指向原有节点
        node.next = tail;//新节点尾部指向尾节点
        tail.pre = node;//尾节点头部指向新节点
    }

    public void delete(DoubleLinkedListNode delete) {
        DoubleLinkedListNode temp = head.next;
        while (temp != null && temp != tail) {
            if (temp == delete) {
                break;
            }
            temp = temp.next;
        }
        DoubleLinkedListNode next = temp.next;
        DoubleLinkedListNode pre = temp.pre;
        pre.next = next;
        next.pre = pre;
    }

    /**
     * 从头部开始打印
     */
    public void printFromHead() {
        DoubleLinkedListNode temp = head.next;
        while (temp != null && temp != tail) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * 从尾部开始打印
     */
    public void printFromTail() {
        DoubleLinkedListNode temp = tail.pre;
        while (temp != null && temp != head) {
            System.out.println(temp.data);
            temp = temp.pre;
        }
    }
}
