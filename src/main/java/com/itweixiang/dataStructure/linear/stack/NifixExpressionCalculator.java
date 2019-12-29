package com.itweixiang.dataStructure.linear.stack;

/**
 * 中缀表达式实现计算器
 * 1、遍历表达式
 * 2、如果是数字，直接入数栈
 * 3、如果是符号，并且符栈为空，直接入符栈
 * 4、如果是符号，并且符栈不为空，判断当前符号与符栈栈顶符号的优先级
 * 小于或等于，从数栈中pop出两个数，并且从符栈中pop出符号，进行运算，将得到的结果，压入数栈，将当前操作符入符栈
 * 大于，将操作符入符栈
 * 5、当表达式遍历完成后，从数栈和符栈中pop出对应的数和符号进行运算
 * 6、最后数栈中只有一个结果值
 */
public class NifixExpressionCalculator {

    /**
     * 数栈
     */
    private ArrayStack numStack = new ArrayStack(20);
    /**
     * 符号栈
     */
    private ArrayStack operStack = new ArrayStack(20);

    /**
     * 表达式
     */
    private String expression;


    public int getResult() {
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        String keepNum = "";
        while (true) {
            ch = expression.substring(index, index + 1).charAt(0);
            if (isOper(ch)) {
                if (operStack.isEmpty()) {
                    operStack.push(ch);
                } else {
                    if (getPriority(ch) > getPriority(operStack.peek())) {
                        operStack.push(ch);
                    } else {
                        oper = operStack.pop();
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        res = cal(num1, num2, oper);
                        numStack.push(res);
                        operStack.push(ch);
                    }
                }
            } else {
//                numStack.push(ch - 48);//ch为符号数，需要减去码表48，得到数值
                keepNum += ch;
                if (index + 1 == expression.length() || isOper(expression.charAt(index + 1))) {
                    numStack.push(Integer.parseInt(keepNum));
                    keepNum = "";
                }
            }
            index++;
            if (index == expression.length()) {
                while (!operStack.isEmpty()) {
                    num1 = numStack.pop();
                    num2 = numStack.pop();
                    oper = operStack.pop();
                    res = cal(num1, num2, oper);
                    numStack.push(res);
                }
                break;
            }
        }
        return numStack.peek();
    }


    public NifixExpressionCalculator(String expression) {
        this.expression = expression;
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

    /**
     * 是否是一个操作符
     *
     * @param data
     * @return
     */
    public boolean isOper(char data) {
        return data == '+' || data == '-' || data == '*' || data == '/';
    }

    /**
     * 具体计算
     *
     * @param num1
     * @param num2
     * @param oper 操作符
     * @return
     */
    public int cal(int num1, int num2, int oper) {
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


    class ArrayStack {

        /**
         * 数据
         */
        private int[] stack;
        /**
         * 栈顶
         */
        private int top = -1;

        /**
         * 栈的大小
         */
        private int size;

        public ArrayStack(int size) {
            this.size = size;
            this.stack = new int[size];
        }

        /**
         * 栈已经满了
         *
         * @return
         */
        public boolean isFull() {
            return top == size - 1;
        }

        /**
         * 栈是否为空
         *
         * @return
         */
        public boolean isEmpty() {
            return top == -1;
        }

        /**
         * 进栈
         *
         * @param data
         */
        public void push(int data) {
            if (!isFull()) {
                stack[++top] = data;
            }
        }

        /**
         * 出栈
         *
         * @return
         */
        public int pop() {
            if (!isEmpty()) {
                return stack[top--];
            } else {
                return -1;
            }
        }

        /**
         * 查看栈顶元素，但不弹出
         *
         * @return
         */
        public int peek() {
            if (!isEmpty()) {
                return stack[top];
            } else {
                return -1;
            }
        }

    }

}
