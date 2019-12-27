package com.itweixiang.dataStructure.linear.stack;

/**
 * 在链表的头部进行数据添加和操作
 *
 * @Author lwx
 * @Date 2019-12-27
 */
public class LinkedListStack {
    /**
     * top 相当于head，即是栈顶，也是链表的头节点
     */
    private Node top = new Node(-1);

    /**
     * 添加数据
     *
     * @param data
     */
    public void push(int data) {
        Node push = new Node(data);
        push.next = top.next;//将新节点的next指向原数据头
        top.next = push;//将头节点的next指向新的节点
    }

    public int pop() {
        Node pop = top.next;
        top.next = pop.next;//将头节点的next指向弹出节点的next
        return pop.data;
    }

    public void print() {
        Node temp = top.next;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * 节点
     */
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
