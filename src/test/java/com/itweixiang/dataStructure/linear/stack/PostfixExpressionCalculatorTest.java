package com.itweixiang.dataStructure.linear.stack;

import org.junit.Test;

public class PostfixExpressionCalculatorTest {
    @Test
    public void testCal(){
        PostfixExpressionCalculator calculator = new PostfixExpressionCalculator();
//        String expression = "3 4 + 5 * 6 -";
        String expression = "( ( 3 + 5 ) * 2 ) * 2 - 7";
        System.out.println(calculator.getResult(expression));
    }
}
