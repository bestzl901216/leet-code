package com.ricardo;

/**
 * int数组排序工具
 *
 * @author Ricardo
 * @date 2020/11/5
 */
class SortUtil {

    /**
     * 冒泡排序
     *
     * <p>最佳情况：T(n) = O(n) 最差情况：T(n) = O(n2)</p>
     *
     * @param array 待排序数字数组 不能为null
     */
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayUtil.exchange(array, j, j + 1);
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * <p>这种排序算法有两个非常明显的特点</p>
     * <li>1.运行时间和输入无关。</li>
     * 为了找出最小的元素而扫描一遍数组并不能为下一遍扫描提供什么信息。这种性质在某些情况下是缺点，因为使用选择排序的人可能会惊讶地发现，
     * 一个已经有序的数组或是主键全部相等的数组和一个元素随机排列的数组所用的排序时间竟然一样长！我们将会看到，其他算法会更善于利用输入的初始状态。
     * <li>2.数据移动是最少的。</li>
     * <p>每次交换都会改变两个数组元素的值，因此选择排序用了N次交换——交换次数和数组的大小是线性关系。
     * 我们将研究的其他任何算法都不具备这个特征（大部分的增长数量级都是线性对数或是平方级别）</p>
     *
     * @param array 待排序数字数组 不能为null
     */
    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            ArrayUtil.exchange(array, i, minIndex);
        }
    }

    /**
     * 插入排序
     *
     * <p>最佳情况：T(n) = O(n) 最差情况：T(n) = O(n2)</p>
     * <p>插入排序所需的时间取决于输入中元素的初始顺序</p>
     *
     * @param array 待排序数字数组 不能为null
     */
    static void insertionSort(int[] array) {
        int minLength = 2;
        if (array.length < minLength) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                ArrayUtil.exchange(array, j, j - 1);
            }
        }
    }

    /**
     * 希尔排序
     * 适用于大型数组，性能与递增序列的步长选择有关
     *
     *
     *
     *
     *
     * @param array 待排序数字数组 不能为null
     */
    static void shellSort(int[] array) {
        int length = array.length;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                int curIndex = i;
                int preIndex = i - gap;


                while (preIndex >= 0 && array[preIndex] > array[curIndex]) {
                    ArrayUtil.exchange(array, preIndex, curIndex);
                    preIndex -= gap;
                    curIndex -= gap;
                }
            }
            gap /= 2;
        }
    }
}
