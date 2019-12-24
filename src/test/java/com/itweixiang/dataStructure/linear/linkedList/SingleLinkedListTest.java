package com.itweixiang.dataStructure.linear.linkedList;

import org.junit.Test;

public class SingleLinkedListTest {
    /**
     * 测试插入和删除
     */
    @Test
    public void testAdd() {
        SingleLinkedList linkedList = SingleLinkedList.newInstance();
        SingleLinkedListNode deleteNode = SingleLinkedListNode.newInstance(4);
        linkedList.add(SingleLinkedListNode.newInstance(1));
        linkedList.add(SingleLinkedListNode.newInstance(2));
        linkedList.add(deleteNode);
        linkedList.add(SingleLinkedListNode.newInstance(3));
        linkedList.add(SingleLinkedListNode.newInstance(5));
        linkedList.add(SingleLinkedListNode.newInstance(6));
        linkedList.printLinkedList();
        linkedList.delete(deleteNode);
        linkedList.printLinkedList();
    }

    /**
     * 测试插入时排序
     */
    @Test
    public void testAddByOrder() {
        SingleLinkedList linkedList = SingleLinkedList.newInstance();
        linkedList.addByOrder(SingleLinkedListNode.newInstance(3));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(-3));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(1));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(6));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(2));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(5));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(0));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(4));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(7));
        linkedList.printLinkedList();
    }

    /**
     * 测试获得链表元素个数
     */
    @Test
    public void testSize() {
        SingleLinkedList linkedList = SingleLinkedList.newInstance();
        linkedList.addByOrder(SingleLinkedListNode.newInstance(3));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(-3));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(1));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(6));
        System.out.println("size : " + linkedList.size());
    }

    /**
     * 寻找倒数第K个节点
     */
    @Test
    public void testFindBackwordKNode() {
        SingleLinkedList linkedList = SingleLinkedList.newInstance();
        linkedList.addByOrder(SingleLinkedListNode.newInstance(3));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(-3));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(1));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(6));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(2));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(5));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(0));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(4));
        linkedList.addByOrder(SingleLinkedListNode.newInstance(7));
        linkedList.printLinkedList();
        System.out.println("K : " + 4 + " is : " + linkedList.findBackwordKNode(4).data);
    }

    /**
     * 链表反转
     */
    @Test
    public void testReverseLinkedList(){
        SingleLinkedList linkedList = SingleLinkedList.newInstance();
        linkedList.add(SingleLinkedListNode.newInstance(1));
        linkedList.add(SingleLinkedListNode.newInstance(2));
        linkedList.add(SingleLinkedListNode.newInstance(4));
        linkedList.add(SingleLinkedListNode.newInstance(3));
        linkedList.add(SingleLinkedListNode.newInstance(5));
        linkedList.add(SingleLinkedListNode.newInstance(6));
        linkedList.reverseLinkedList();
        linkedList.printLinkedList();
    }
    @Test
    public void testPrintLinkedListFromTail(){
        SingleLinkedList linkedList = SingleLinkedList.newInstance();
        linkedList.add(SingleLinkedListNode.newInstance(1));
        linkedList.add(SingleLinkedListNode.newInstance(2));
        linkedList.add(SingleLinkedListNode.newInstance(4));
        linkedList.add(SingleLinkedListNode.newInstance(3));
        linkedList.add(SingleLinkedListNode.newInstance(5));
        linkedList.add(SingleLinkedListNode.newInstance(6));
        linkedList.printLinkedListFromTail();
    }
}
