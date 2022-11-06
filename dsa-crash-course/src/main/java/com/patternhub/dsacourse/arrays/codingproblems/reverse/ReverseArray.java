package com.patternhub.dsacourse.arrays.codingproblems.reverse;

import java.util.Arrays;

/**
 * @author ravikant_kondepati
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        int[] newArray = normalReverseWithExtraVariable(data);
        System.out.println(Arrays.toString(newArray));
        reverseWithoutExtraVariable(data);
        System.out.println(Arrays.toString(data));
    }

    private static int[] normalReverseWithExtraVariable(int[] data) {
        int[] newArray = new int[data.length];
        int temp = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            newArray[temp] = data[i];
            temp++;
        }
        return newArray;
    }

    private static void reverseWithoutExtraVariable(int[] data) {
        // This is also called as 2 pointer method
        int start = 0;
        int end = data.length - 1;
        while (start < end) {
            swap(data, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
