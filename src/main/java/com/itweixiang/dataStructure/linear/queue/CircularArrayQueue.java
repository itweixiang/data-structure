package com.itweixiang.dataStructure.linear.queue;

import org.junit.Test;

/**
 * @Author lwx
 * @Date 2019-12-11
 * <p>
 * 环形数组实现队列
 * <p>
 * 实现思路：
 * 1、front指向队列的第一个元素，queueData[front]为队列第一个元素，初始值为0
 * 2、rear指向队列的最后一个元素的后一个位置,空出一个位置作为约定，初始值为0
 * 3、当队列满时 ( rear + 1 ) % maxSize == front,？front不在数组的第一个元素时，在front之前的位置可利用（即不为空），此时( rear + 1 ) % maxSize != front
 * 4、当队列空时 rear == front
 * 5、有效的数据范围为[front,rear],有效个数为 (rear + maxSize - front) % maxSize
 */

public class CircularArrayQueue {
    /*
     * 最大容量
     */
    private int maxSize;
    /*
     * 数据实体
     */
    private int[] queueData;
    /*
     * 队列头
     */
    private int front;
    /*
     * 队列尾
     */
    private int rear;


    public CircularArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queueData = new int[maxSize];
    }

    /**
     * 判断队列是否满了
     *
     * @return
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加数据
     *
     * @param data
     */
    public void push(int data) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        //直接将数据加入
        queueData[rear] = data;
        //循环
        rear = (rear + 1) % maxSize;
    }

    /**
     * 出数据
     *
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int temp = front;
        //循环
        front = (front + 1) % maxSize;
        return queueData[temp];
    }

    /**
     * 打印所有数据
     */
    public void printAll() {
        if (isEmpty()) {
            System.out.println("队列为空");
        }
        //从front开始遍历多少个元素
        for (int i = front; i < front + (rear + maxSize - front) % maxSize; i++) {
            System.out.print(queueData[i % maxSize] + " ");
        }
        System.out.println();
    }

    /**
     * 查看队首元素
     *
     * @return
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return queueData[front];
    }




}
