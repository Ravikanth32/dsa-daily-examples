package com.patternhub.dsacourse.arrays.codingproblems.reverse;

import java.util.Arrays;

/**
 * @author ravikant_kondepati
 */
public class RotateArrayFromKthIndex {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(Arrays.toString(basicReverse(data, k)));
        System.out.println(Arrays.toString(withLogic(data, k)));
        // O/P 3,4,5,1,2
    }

    static int[] basicReverse(int[] data, int k) {
        int[] newArray = new int[data.length];
        int count = 0;
        for (int index = k-1; index < data.length; index++) {
            newArray[count] = data[index];
            count++;
        }
        for (int index = 0; index < k-1; index++) {
            newArray[count] = data[index];
            count++;
        }
        return newArray;
    }

    static int[] withLogic(int[] data, int k) {
        /*
        Steps:
        1. reverse whole array
        2. reverse up to k
        3. reverse after k to length -1
         */
        k = k % data.length;
        reverse(data, 0, data.length - 1);
        reverse(data, 0, k - 1);
        reverse(data, k, data.length - 1);
        return data;
    }

    static void reverse(int[] data, int start, int end) {
        while (start < end) {
            int temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            start++;
            end--;
        }
    }
}
