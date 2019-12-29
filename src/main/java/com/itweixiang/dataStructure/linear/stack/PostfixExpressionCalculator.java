package com.itweixiang.dataStructure.linear.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 后缀表达式，逆波兰表达式
 * 1、从左到右扫描
 * 2、遇到数值时压入栈中
 * 3、遇到操作符时，弹出两个数进行计算，然后压入栈中
 * 如，（ 3 + 4 ） * 5 - 6 —> 3 4 + 5 * 6 -
 */
public class PostfixExpressionCalculator {

    public int getResult(String expression) {
        return analyzeExpression(getPostfixExpression(expression));
    }

    /**
     * 根据中缀表达式得到后缀表达式
     * 1、初始化一个符栈和一个数栈，从左到右遍历中缀表达式
     * 2、遇到数值时，压入数栈
     * 3、遇到操作符号时，比较栈顶的符号的优先级
     * 1）、若符栈为空，或者栈顶元素为“（”,直接入符栈
     * 2）、若符号的优先级比栈顶符号的优先级高，直接入符栈
     * 3）、否则，将栈顶的运算符弹出，并压入数栈,，并再次与符栈的栈顶元素进行比较
     * 4、如果遇到“）”时，则依次弹出符栈的运算符，压入数栈中，直到遇到“（”
     * 5、将符栈剩余的元素弹出压入数栈
     * 6、数栈的逆序即为后缀表达式
     *
     * @param expression
     * @return
     */
    private List<String> getPostfixExpression(String expression) {
        //将中缀表达式解析为后缀表达式
        Stack<String> stack = new Stack();//符栈
        List<String> list = new ArrayList<String>();//“符栈”,符栈无弹出，所以使用list也没事

        String[] strings = expression.split(" ");
        for (String string : strings) {
            if (string.matches("\\d+")) {
                list.add(string);//遇到数值时，压入数栈
            } else if (stack.isEmpty() || stack.peek().equals("(") || getPriority(stack.peek().charAt(0)) < getPriority(string.charAt(0))) {
                //若符栈为空，或者栈顶元素为“（”,直接入符栈
                //若符号的优先级比栈顶符号的优先级高，直接入符栈
                stack.push(string);
            } else if (string.equals(")")) {
                //如果遇到“）”时，则依次弹出符栈的运算符，压入数栈中，直到遇到“（”
                while (!stack.peek().equals("(")) {
                    list.add(stack.pop());
                }
                stack.pop();//弹出（
            } else {
                list.add(stack.pop());
                while (!stack.isEmpty() && getPriority(stack.peek().charAt(0)) < getPriority(string.charAt(0))) {
                    list.add(stack.pop());
                }
                stack.push(string);
            }
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    /**
     * 具体的计算方法
     *
     * @param list 含有中缀表达式的list
     * @return
     */
    private int analyzeExpression(List<String> list) {
        // 直接使用api提供的栈结构
        Stack<String> stack = new Stack<String>();
        for (String str : list) {
            if (str.matches("\\d+")) {//匹配多位数
                stack.push(str);
            } else {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(cal(num1, num2, str.charAt(0))));
            }
        }
        return Integer.parseInt(stack.peek());
    }

    /**
     * 计算值
     *
     * @param num1
     * @param num2
     * @param oper 操作符
     * @return
     */
    private int cal(int num1, int num2, char oper) {
        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':
                return num2 - num1;
            case '*':
                return num1 * num2;
            case '/':
                return num2 / num1;
            default:
                return 0;
        }
    }

    /**
     * 得到操作符的优先级
     *
     * @param oper
     * @return
     */
    public int getPriority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;//目前只有/+-*
        }
    }
}
