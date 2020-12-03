package com.ricardo;

/**
 * @author Ricardo
 * @date 2020/12/3
 */
public class RaidQuestion {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = func(array, left, right);
        quickSort(array, left, mid - 1);
        quickSort(array, mid + 1, right);
    }

    private static int func(int[] array, int left, int right) {
        int v = array[left];
        int p1 = left;
        int p2 = right + 1;
        while (true) {
            while (array[++p1] < v) {
                if (p1 >= right) {
                    break;
                }
            }
            while (array[--p2] > v) {
                if (p2 <= left) {
                    break;
                }
            }
            if (p1 >= p2) {
                break;
            }
            ArrayUtil.exchange(array, p1, p2);
        }
        ArrayUtil.exchange(array, left, p2);
        return p2;
    }
}
