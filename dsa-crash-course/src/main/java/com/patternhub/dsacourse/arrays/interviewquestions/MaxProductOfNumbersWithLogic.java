package com.patternhub.dsacourse.arrays.interviewquestions;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author ravikant_kondepati
 */
public class MaxProductOfNumbersWithLogic {
    public static void main(String[] args) {
        int[] numbers = {-4,2,4,2};
        System.out.println("Product of 2 " + calculateMaxProductOf2(numbers));
        System.out.println("Product of 3 "+calculateMaxProductOf3(numbers));
    }

    public static int calculateMaxProductOf2(int[] numbers) {
        int len = numbers.length;
        if(len < 2){
            return -1;
        }
        Arrays.sort(numbers);
        int max = Math.max((numbers[0] * numbers[1]), (numbers[len - 1] * numbers[len - 2]));
        return max;
    }

    public static int calculateMaxProductOf3(int[] numbers) {
        int len = numbers.length;
        if(len < 3){
            return -1;
        }
        Arrays.sort(numbers);
        int max = Math.max((numbers[0] * numbers[1] * numbers[2]), (numbers[len - 1] * numbers[len - 2] * numbers[len-3]));
        return max;
    }


}

