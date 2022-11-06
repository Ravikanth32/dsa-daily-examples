package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems;

/**
 * @author ravikant_kondepati
 */
public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int target = 3; // find in mountain array
        /*
        Steps:
        1. find peek value
        2. search in left
        3. search in right
         */
        int peekValueIndex = findPeekValue(numbers);
        int start = 0;
        int end = peekValueIndex;
        int firstTry = searchOrderAgnostic(numbers, target, start, end);
        if(firstTry != -1){
        }else {
            start = peekValueIndex;
            end = numbers.length - 1;
            firstTry = searchOrderAgnostic(numbers, target, start, end);
        }
        System.out.println(firstTry);
    }

    static int searchOrderAgnostic(int numbers[], int target, int start, int end) {
        boolean isAsc = checkOrder(numbers);
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == numbers[middle]) {
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

    static boolean checkOrder(int numbers[]) {
        if (numbers[0] < numbers[numbers.length - 1]) {
            return true;
        }
        return false;
    }

    static int findPeekValue(int[] numbers) {
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
