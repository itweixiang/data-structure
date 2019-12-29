package com.itweixiang.dataStructure.linear.stack;

import org.junit.Test;

public class PostfixExpressionCalculatorTest {
    @Test
    public void testCal() {
        PostfixExpressionCalculator calculator = new PostfixExpressionCalculator();
        String expression = "( ( 3 + 5 ) * 2 - 3 ) - 17 + ( ( 3 + 5 ) * 2 - 3 ) - 17";
        System.out.println(calculator.getResult(expression));
    }
}
