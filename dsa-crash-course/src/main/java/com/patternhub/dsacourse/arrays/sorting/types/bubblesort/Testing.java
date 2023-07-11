package com.patternhub.dsacourse.arrays.sorting.types.bubblesort;

import java.util.Arrays;

/**
 * @author ravikant_kondepati
 */
public class Testing {
    public static void main(String[] args) {
        int[] numbers = {2,3,41,23,34,5,2,435};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    static void sort(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j >= 0; j--) {
                if(numbers[j] > numbers[j]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                }
            }
        }
    }
}
