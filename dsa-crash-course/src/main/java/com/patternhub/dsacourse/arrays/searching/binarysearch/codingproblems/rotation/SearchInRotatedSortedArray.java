package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems.rotation;

/**
 * @author ravikant_kondepati
 */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 1, 2, 3};
        int target = 20;
        System.out.println(search(numbers, target));
    }

    static int search(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (numbers[middle] == target) return middle;
            if (numbers[start] <= numbers[middle]) {
                if (target >= numbers[start] && target <= numbers[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target >= numbers[middle] && target <= numbers[end]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}
