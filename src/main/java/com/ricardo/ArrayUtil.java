package com.ricardo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ricardo
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
    static boolean isSorted(int[] array, int[] source) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i : source) {
            map.merge(i, 1, Integer::sum);
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (map.getOrDefault(array[i], 0) == 0 || array[i] > array[i + 1]) {
                System.out.println(Arrays.toString(array));
                return false;
            }
            map.merge(array[i], 1, Math::subtractExact);
        }
        return true;
    }
}
