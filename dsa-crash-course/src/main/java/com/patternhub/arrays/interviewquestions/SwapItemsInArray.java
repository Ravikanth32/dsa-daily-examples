package com.patternhub.arrays.interviewquestions;

import java.util.Arrays;

/**
 * @author ravikant_kondepati
 */
public class SwapItemsInArray {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        int index1 = 2;
        int index2 = 10;
        swapData(data, index1, index2);
        System.out.println(Arrays.toString(data));
    }

    public static void swapData(int[] data, int index1, int index2) {
        if (index1 >= data.length || index2 >= data.length) {
            return;
        }
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }


}
