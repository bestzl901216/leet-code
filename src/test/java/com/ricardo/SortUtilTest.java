package com.ricardo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Ricardo
 * @date 2020/11/5
 */
public class SortUtilTest {

    private int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println(Arrays.toString(array));
                return false;
            }
        }
        return true;
    }

    @Test
    public void testBubbleSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        SortUtil.bubbleSort(temp);
        Assert.assertTrue(isSorted(temp));
    }

    @Test
    public void testSelectionSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        SortUtil.selectionSort(temp);
        Assert.assertTrue(isSorted(temp));
    }

    @Test
    public void testInsertionSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        SortUtil.insertionSort(temp);
        Assert.assertTrue(isSorted(temp));
    }

    @Test
    public void testShellSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        SortUtil.shellSort(temp);
        Assert.assertTrue(isSorted(temp));
    }
}
