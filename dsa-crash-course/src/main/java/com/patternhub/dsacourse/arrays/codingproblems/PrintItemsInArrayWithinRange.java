package com.patternhub.dsacourse.arrays.codingproblems;

/**
 * @author ravikant_kondepati
 */
public class PrintItemsInArrayWithinRange {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        printDataWithRange(data, 1, 3);
    }

    public static void printDataWithRange(int[] data, int start, int end) {
        int length = data.length - 1;
        if (start > length || end > length) {
            return;
        }
        for (int i = start; i <= end; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void printData(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
