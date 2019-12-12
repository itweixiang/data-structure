package com.itweixiang.dataStructure.linear.queue;

import org.junit.Test;

public class CircularArrayQueueTest {
    @Test
    public void test1(){
        CircularArrayQueue arrayQueue = new CircularArrayQueue(10);
        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);
        arrayQueue.push(4);
        arrayQueue.push(5);
        arrayQueue.push(5);
        arrayQueue.push(5);
        arrayQueue.push(5);
        arrayQueue.push(5);
        arrayQueue.push(5);
        arrayQueue.push(5);
        arrayQueue.push(5);
        arrayQueue.printAll();
        System.out.println(arrayQueue.pop());
        arrayQueue.printAll();
        arrayQueue.push(1);
        arrayQueue.printAll();
        System.out.println(arrayQueue.peek());
    }
}
