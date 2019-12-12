package com.itweixiang.dataStructure.linear.queue;

import org.junit.Test;

public class ArrayQueueTest {
    @Test
    public void test() {
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
