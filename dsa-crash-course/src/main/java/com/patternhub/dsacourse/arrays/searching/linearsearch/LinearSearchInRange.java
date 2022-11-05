package com.patternhub.dsacourse.arrays.searching.linearsearch;

import java.util.Scanner;

/**
 * @author ravikant_kondepati
 */
public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] data = {20, 39, 72, 41, 2, 4};
        int target = 4;
        int index = linearSearch(data, target, 1, 6);
        System.out.println("found at index " + index);
    }

    public static int linearSearch(int[] data, int target, int startIndex, int endIndex) {
        if (data.length == 0) return -1;
        if (startIndex >= data.length || endIndex >= data.length) return -1;
        for (int index = startIndex; index <= endIndex; index++) {
            if (data[index] == target) {
                return index;
            }
        }
        return -1;
    }

}
