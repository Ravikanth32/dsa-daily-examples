package com.patternhub.dsacourse.arrays.searching.binarysearch;

/**
 * @author ravikant_kondepati
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 19, 24, 30, 40, 63, 73, 84, 85}; // Increasing order
//        Arrays.sort(numbers); // it will sort the array first to increasing order
        System.out.println(binarySearchAsc(numbers, 83));
        int[] numbers1 = {85, 74, 63, 52, 41, 30, 29, 11, 4}; // Decreasing Order
        System.out.println(binarySearchDesc(numbers1, 83));

        // predefined methods
        // System.out.println(Arrays.binarySearch(numbers,83));
    }

    static int binarySearchAsc(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target > numbers[middle]) {
                start = middle + 1;
            } else if (target < numbers[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    static int binarySearchDesc(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target > numbers[middle]) {
                end = middle - 1;
            } else if (target < numbers[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
