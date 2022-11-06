package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems;

/**
 * @author ravikant_kondepati
 */
public class FindPositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        // We don't know length of the array because it is infinite
        // We have to find start and end index we will box them
        // start with start=0 and end = 1 box is 1 then double it

        int[] numbers = {1, 2, 4, 5, 6, 78, 90,130,140};
        int target = 90; // this case will fail because above number array is fixed but question saying infinite size
        System.out.println(ans(numbers, target));
    }

    static int ans(int[] numbers, int target) {
        int start = 0;
        int end = 1;
        while (target > numbers[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(numbers, target, start, end);
    }

    static int binarySearch(int[] numbers, int target, int start, int end) {
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
}
