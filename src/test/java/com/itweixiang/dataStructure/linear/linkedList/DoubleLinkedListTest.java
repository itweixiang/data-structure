package com.itweixiang.dataStructure.linear.linkedList;

import org.junit.Test;

public class DoubleLinkedListTest {
    /**
     * 测试在链表头部添加
     */
    @Test
    public void testAddInHead() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addInHead(DoubleLinkedListNode.newInstance(1));
        linkedList.addInHead(DoubleLinkedListNode.newInstance(2));
        linkedList.addInHead(DoubleLinkedListNode.newInstance(3));
        linkedList.addInHead(DoubleLinkedListNode.newInstance(4));
        linkedList.addInHead(DoubleLinkedListNode.newInstance(5));
        linkedList.addInHead(DoubleLinkedListNode.newInstance(6));
        linkedList.printFromHead();
    }
    /**
     * 测试在链表尾部添加
     */
    @Test
    public void testAddInTail() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addInTail(DoubleLinkedListNode.newInstance(1));
        linkedList.addInTail(DoubleLinkedListNode.newInstance(2));
        linkedList.addInTail(DoubleLinkedListNode.newInstance(3));
        linkedList.addInTail(DoubleLinkedListNode.newInstance(4));
        linkedList.addInTail(DoubleLinkedListNode.newInstance(5));
        linkedList.addInTail(DoubleLinkedListNode.newInstance(6));
        linkedList.printFromTail();
    }

    /**
     * 测试删除节点
     */
    @Test
    public void testDelete() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        DoubleLinkedListNode delete = DoubleLinkedListNode.newInstance(3);
        linkedList.addInTail(DoubleLinkedListNode.newInstance(1));
        linkedList.addInTail(DoubleLinkedListNode.newInstance(2));
        linkedList.addInTail(delete);
        linkedList.addInTail(DoubleLinkedListNode.newInstance(4));
        linkedList.addInTail(DoubleLinkedListNode.newInstance(5));
        linkedList.addInTail(DoubleLinkedListNode.newInstance(6));
        linkedList.delete(delete);
        linkedList.printFromHead();

    }
}
