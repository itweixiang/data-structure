package com.itweixiang.dataStructure.linear.stack;

import org.junit.Test;

public class NifixExpressionCalculatorTest {

    @Test
    public void testCal() {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
        NifixExpressionCalculator calculator = new NifixExpressionCalculator("30+4*5-60/30+45-60");
        System.out.println( calculator.getResult());
    }
}
