package com.itweixiang.dataStructure.linear.array;

/**
 * @Author lwx
 * @Date 2019-12-10
 * <p>
 * 稀疏数组
 * <p>
 * 对数据进行压缩。以二维数组为例。
 * <p>
 * 1、遍历二维数组，得到有效数据（行、列、数据量）
 * 2、根据有效数据创建稀疏数组
 * 3、将二维数组的数据存入稀疏数组
 */
public class SparseArrayDemo {


    /**
     * 根据二维数组创建稀疏数组
     *
     * @param qrArray
     * @return
     */
    public int[][] createSparseArray(int[][] qrArray) {
        //获取行列有效数据量
        int row = qrArray.length;//获取行
        int col = 0;
        int sum = 0;
        for (int[] ints : qrArray) {
            if (col == 0) {
                col = ints.length;//获取列
            }
            for (int anInt : ints) {
                //获取有效数据量
                if (anInt != 0) {
                    sum++;
                }
            }
        }
        //初始化稀疏数组,row+1，头行存放关键信息
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = row;
        sparseArray[0][1] = col;
        sparseArray[0][2] = sum;

        //重新遍历二维数组，将有效数据写入稀疏数组
        int count = 1;
        for (int i = 0; i < qrArray.length; i++) {
            int[] tempArray = qrArray[i];
            for (int j = 0; j < tempArray.length; j++) {
                if (tempArray[j] != 0) {
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = tempArray[j];
                    count++;
                }
            }
        }

        return sparseArray;
    }

    /**
     * 将稀疏数组转换为二维数组
     *
     * @param sparseArray
     * @return
     */
    public int[][] convertQrArrayBySparseArray(int[][] sparseArray) {
        int row = sparseArray[0][0];
        int col = sparseArray[0][1];
        int[][] qrArray = new int[row][col];
        for (int i = 1; i < sparseArray.length; i++) {
            qrArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        return qrArray;
    }

}
