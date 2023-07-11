package com.patternhub.dsacourse.arrays.sorting.types.bubblesort;

import java.util.Arrays;

/**
 * @author ravikant_kondepati
 */
public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {19, 23, 4, 202};
        bubbleSortAscending(arr);
        System.out.println(Arrays.toString(arr));
        bubbleSortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortAscending(int[] arr) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }

    static void bubbleSortDescending(int[] arr) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }
}
