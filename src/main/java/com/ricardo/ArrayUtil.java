package com.ricardo;

import java.util.Arrays;

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

    /**
     * 判断数组是否有序（从小到大）
     *
     * @param array 数组 不能为null
     * @return true 有序 | false 无序
     */
    static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println(Arrays.toString(array));
                return false;
            }
        }
        return true;
    }
}
