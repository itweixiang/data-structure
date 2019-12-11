package com.itweixiang.dataStructure.linear.queue;

/**
 * @Author lwx
 * @Date 2019-12-11
 * <p>
 * 数组实现
 * <p>
 * 存在问题：当取出数据时，front与rear没有重置，导致队列只能使用一次（加满一次）
 */

public class ArrayQueue {
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

    /**
     * 初始化
     *
     * @param maxSize
     */
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queueData = new int[maxSize];
        front = -1;//指向队列头的前一个位置
        rear = -1;//直接指向队列的尾部
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
        rear++;//尾部后移
        queueData[rear] = data;//添加数据
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
        front++;
        return queueData[front];
    }

    /**
     * 打印所有数据
     */
    public void printAll() {
        if (isEmpty()) {
            System.out.println("队列为空");
        }
        int tempFront = front + 1;
        int tempRear = rear;
        for (int i = tempFront; i <= tempRear; i++) {
            System.out.print(" " + queueData[i]);
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
        return queueData[front + 1];
    }

    /**
     * 判断队列是否满了
     *
     * @return
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return rear == front;
    }

    public void clear() {
        rear = -1;
        front = -1;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(10);
        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);
        arrayQueue.push(4);
        arrayQueue.push(5);
        arrayQueue.printAll();
        System.out.println(arrayQueue.pop());
        arrayQueue.printAll();
        System.out.println(arrayQueue.peek());
    }
}
