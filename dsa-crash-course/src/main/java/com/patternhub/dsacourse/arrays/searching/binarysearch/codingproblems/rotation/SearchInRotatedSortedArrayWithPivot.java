package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems.rotation;

/**
 * @author ravikant_kondepati
 */
public class SearchInRotatedSortedArrayWithPivot {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 1, 2, 3};
        int target = 4;
        System.out.println(search(numbers, target));
    }

    static int search(int[] numbers, int target) {
        int pivotIndex = findPivot(numbers);
        if (pivotIndex == -1) {
            return binarySearchOrderAgnostic(numbers, target, 0, numbers.length - 1);
        }
        if (numbers[pivotIndex] == target) {
            return pivotIndex;
        } else {
            int firstTry = binarySearchOrderAgnostic(numbers, target, 0, pivotIndex);
            if (firstTry == -1) {
                return binarySearchOrderAgnostic(numbers, target, pivotIndex+1, numbers.length - 1);
            }
            return firstTry;
        }
    }

    static int binarySearchOrderAgnostic(int[] numbers, int target, int start, int end) {
        if (numbers.length == 0) return -1;
        boolean isAsc = checkOrder(numbers,start,end);
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == numbers[middle]) return middle;
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

    static int findPivot(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (middle < end && numbers[middle] >= numbers[middle + 1]) {
                return middle;
            }
            if (middle > start && numbers[middle] <= numbers[middle - 1]) {
                return middle - 1;
            }
            if (numbers[middle] <= numbers[start]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    static boolean checkOrder(int[] numbers,int start,int end) {
        return numbers[start] < numbers[end];
    }
}
