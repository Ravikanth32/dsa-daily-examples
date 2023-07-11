package com.patternhub.dsacourse.arrays.sorting.types.bubblesort;

import java.util.Arrays;

/**
 * @author ravikant_kondepati
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {1, -13, 23, 493, 45, 3, 22};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    /**
     *
     * @param arr
     */
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxIndex = getMaxValueIndex(arr, 0, end);
            swap(arr, maxIndex, end);
        }
    }

    /**
     *
     * @param arr
     * @param start
     * @param end
     * @return
     */
    static int getMaxValueIndex(int[] arr, int start, int end) {
        int max = 0;
        for (int j = start; j <= end; j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }
        return max;
    }

    /**
     *
     * @param arr
     * @param first
     * @param second
     */
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
