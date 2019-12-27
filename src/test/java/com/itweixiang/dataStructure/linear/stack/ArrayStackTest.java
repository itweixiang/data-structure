package com.itweixiang.dataStructure.linear.stack;

import org.junit.Test;

/**
 * @Author lwx
 * @Date 2019-12-27
 */
public class ArrayStackTest {

    @Test
    public void testPushAndPop(){
        ArrayStack stack = new ArrayStack(20);
        stack.push(1);
        stack.push(6);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();

        stack.pop();
        stack.pop();
        stack.print();
    }
}
