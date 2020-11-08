package com.ricardo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static com.ricardo.ArrayUtil.isSorted;

/**
 * @author Ricardo
 * @date 2020/11/5
 */
public class SortUtilTest {

    private int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

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

    @Test
    public void testMergeSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        SortUtil.mergeSort(temp);
        Assert.assertTrue(isSorted(temp));
    }

    @Test
    public void testQuickSort() {
        int[] temp = Arrays.copyOf(array, array.length);
        SortUtil.quickSort(temp);
        Assert.assertTrue(isSorted(temp));
    }
}
