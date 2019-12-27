package com.itweixiang.dataStructure.linear.linkedList;

import org.junit.Test;

public class CircularLinkedListTest {

    /**
     * 测试添加
     */
    @Test
    public void testAdd() {
        CircularLinkedList linkedList = new CircularLinkedList();
        linkedList.add(CircularLinkedListNode.newInstance(1));
        linkedList.add(CircularLinkedListNode.newInstance(2));
        linkedList.add(CircularLinkedListNode.newInstance(3));
        linkedList.add(CircularLinkedListNode.newInstance(4));
        linkedList.add(CircularLinkedListNode.newInstance(5));
        linkedList.add(CircularLinkedListNode.newInstance(6));
        linkedList.printLinkedList();
    }

    /**
     * 约瑟夫环
     */
    @Test
    public void testJosephRing() {
        CircularLinkedList linkedList = new CircularLinkedList();
        linkedList.add(CircularLinkedListNode.newInstance(1));
        linkedList.add(CircularLinkedListNode.newInstance(2));
        linkedList.add(CircularLinkedListNode.newInstance(3));
        linkedList.add(CircularLinkedListNode.newInstance(4));
        linkedList.add(CircularLinkedListNode.newInstance(5));
        linkedList.add(CircularLinkedListNode.newInstance(6));
        linkedList.josephRing(1, 3);
    }
}
