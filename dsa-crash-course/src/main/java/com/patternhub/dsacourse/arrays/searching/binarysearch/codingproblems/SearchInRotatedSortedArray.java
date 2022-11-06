package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems;

/**
 * @author ravikant_kondepati
 */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 1, 2, 3};
        int target = 6;
        /*
        1) find pivot
        2) search 0 to pivot
        3) pivot to end of array
         */
        System.out.println(search(numbers, target));
    }

    static int search(int[] numbers, int target) {
        int pivot = findPivot(numbers);
        if (pivot != -1) {
            return binarySearch(numbers, target, 0, numbers.length - 1);
        }
        if (numbers[pivot] == target) {
            return pivot;
        }
        return -1;
    }

    static int findPivot(int[] numbers) {
        /*
        find Pivot:{4, 5, 6, 7, 1, 2, 3}
            1. middle > middle +1 ==> return middle
            2. middle < middle -1 ==> return middle
            3. middle <= start ==> return end = middle-1
            4. else start = middle +1;
         */
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (numbers[middle] > numbers[middle + 1]) {
                return middle;
            }
            if (numbers[middle] < numbers[middle - 1]) {
                return middle;
            }
            if (numbers[middle] <= numbers[start]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
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
