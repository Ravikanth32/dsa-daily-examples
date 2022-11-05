package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems;

/**
 * @author ravikant_kondepati
 */
public class FindCeilingOfNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 23, 36, 43, 49, 51, 53, 67, 69, 79, 88};
        int target1 = 89; // this case there is no greater than this
        int target2 = 1; // this case there is no smaller than this
        System.out.println("Ceiling  "+findCeilingNumber(numbers, target1));
        System.out.println("Floor "+findFloorNumber(numbers, target2));
    }

    static int findCeilingNumber(int[] numbers, int target) {
        // smallest number >= target
        /*
        start answer end -> if target not found
        while condition breaks start > end : start index is ceiling number
         */
        // what if there is no value >= target
        if(target > numbers[numbers.length-1]) return -1;
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
        return start;
    }

    static int findFloorNumber(int[] numbers, int target) {
        // greatest number grater <= target
        /*
        start answer end -> if target not found
        while condition breaks start > end : end index is floor number
         */
        if(target < numbers[numbers.length-1]) return -1;
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
        return end;
    }


}
