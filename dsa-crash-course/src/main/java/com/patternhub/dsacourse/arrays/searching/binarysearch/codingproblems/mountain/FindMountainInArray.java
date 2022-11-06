package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems.mountain;

/**
 * @author ravikant_kondepati
 */
public class FindMountainInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 4, 3, 2, 1}; // mountain/bi-tonic  array
        // we have to find the target
        System.out.println(numbers[findPeekInArray(numbers)]);
    }

    static int findPeekInArray(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (numbers[middle] > numbers[middle + 1]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }
}
