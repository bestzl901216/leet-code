package com.ricardo;

/**
 * @author Ricardo
 * @date 2020/5/30
 */
class ArrayUtil {
    /**
     * 交换数组指定索引上的值
     *
     * @param array 数组
     * @param i     索引
     * @param j     索引
     */
    static void exchange(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
