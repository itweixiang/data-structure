package com.itweixiang.dataStructure.linear.stack;

/**
 * 栈，限制性线性表，数据的添加和删除只能在同一端
 * 进行添加和删除的一端，成为栈顶，相反的一端称为栈底
 * <p>
 * 应用场景，中缀表达式转后缀表达式，二叉树的遍历，深度优先算法
 *
 * @Author lwx
 * @Date 2019-12-27
 */
public class ArrayStack {

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

    public void print() {
        int temp = top;
        while (temp != -1) {
            System.out.println(stack[temp--]);
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
