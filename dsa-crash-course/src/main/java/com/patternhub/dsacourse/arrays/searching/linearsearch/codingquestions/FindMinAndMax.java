package com.patternhub.dsacourse.arrays.searching.linearsearch.codingquestions;

/**
 * @author ravikant_kondepati
 */
public class FindMinAndMax {
    public static void main(String[] args) {
        int[] numbers = {-3, 5, 8, 93, 34, -5, 9};
//        System.out.println(findMin(numbers));
        findBothMinAndMax(numbers);
    }

    static int findMin(int[] numbers) {
        if (numbers.length == 0) return Integer.MIN_VALUE;
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    static void findBothMinAndMax(int[] numbers) {
        if (numbers.length == 0) return;
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(min + " --> " + max);
    }
}
