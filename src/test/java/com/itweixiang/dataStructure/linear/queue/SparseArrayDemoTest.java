package com.itweixiang.dataStructure.linear.queue;

import com.itweixiang.dataStructure.linear.array.SparseArrayDemo;
import org.junit.Test;

public class SparseArrayDemoTest {
    @Test
    public void test(){
        SparseArrayDemo sparseArrayDemo = new SparseArrayDemo();
        //原始二维数组
        int[][] qrArray = new int[9][9];
        qrArray[1][3] = 1;
        qrArray[2][2] = 2;
        qrArray[3][1] = 1;
        qrArray[4][1] = 1;


        System.out.println("======================遍历二维数组=====================");
        for (int[] ints : qrArray) {
            for (int anInt : ints) {
                System.out.print("[" + anInt + "] ");
            }
            System.out.println();
        }

        System.out.println("======================遍历稀疏数组=====================");
        int[][] sparseArray = sparseArrayDemo.createSparseArray(qrArray);
        for (int i = 0; i < sparseArray.length; i++) {
            int[] tempArray = sparseArray[i];
            for (int j = 0; j < tempArray.length; j++) {
                System.out.print("[" + tempArray[j] + "] ");
            }
            System.out.println();
        }

        System.out.println("======================遍历二维数组=====================");
        int[][] convertArray = sparseArrayDemo.convertQrArrayBySparseArray(sparseArray);
        for (int[] ints : convertArray) {
            for (int anInt : ints) {
                System.out.print("[" + anInt + "] ");
            }
            System.out.println();
        }
    }
}
