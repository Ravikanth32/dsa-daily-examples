package com.patternhub.dsacourse.arrays.searching.binarysearch;

/**
 * @author ravikant_kondepati
 */
public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 5, 19, 24, 30, 40, 63, 73, 84, 85}; // Increasing Order
        int[] numbers = {85,74,63, 52,41,30,29,11,4}; // Decreasing Order
        System.out.println(search(numbers, 63));
    }

    static int search(int[] numbers, int target) {
        if (numbers.length == 0) return -1;
        boolean isAsc = checkOrder(numbers);
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (numbers[middle] == target) {
                return middle;
            }
            if (isAsc) {
                if (target > numbers[middle]) {
                    start = middle + 1;
                } else if (target < numbers[middle]) {
                    end = middle - 1;
                }
            } else {
                if (target > numbers[middle]) {
                    end = middle - 1;
                } else if (target < numbers[middle]) {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }

    static boolean checkOrder(int[] numbers) {
        return numbers[0] < numbers[numbers.length - 1];
    }
}
