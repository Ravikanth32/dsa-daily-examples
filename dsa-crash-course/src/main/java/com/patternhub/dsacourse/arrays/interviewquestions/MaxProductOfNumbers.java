package com.patternhub.dsacourse.arrays.interviewquestions;

/**
 * @author ravikant_kondepati
 */
public class MaxProductOfNumbers {
    public static void main(String[] args) {
        int[] numbers = {4,2};
        System.out.println("Product of 2 " + calculateMaxProductOf2(numbers));
        System.out.println("Product of 3 "+calculateMaxProductOf3(numbers));
    }

    public static int calculateMaxProductOf2(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int maxCal = numbers[i] * numbers[j];
                if (maxCal > max) {
                    max = maxCal;
                }
            }
        }
        return max;
    }

    public static int calculateMaxProductOf3(int[] numbers) {
        if(numbers.length < 3){
            return -1;
        }
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    int maxCal = numbers[i] * numbers[j] * numbers[k];
                    if (maxCal > max) {
                        max = maxCal;
                    }
                }
            }
        }
        return max;
    }


}

