package com.patternhub.dsacourse.codingproblems.easy.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ravikant_kondepati
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 17};
        int target = 10;
        System.out.println(isTargetValuePresentInArray1(numbers, target));
        System.out.println(isTargetValuePresentInArray2(numbers, target));
    }

    public static List<Integer> isTargetValuePresentInArray1(int[] numbers, int target) {
        /*
            bootstrap approach
            Time: O(n2)
            space: O(1)
         */
        List<Integer> indexValues = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    indexValues.add(numbers[i]);
                    indexValues.add(numbers[j]);
                }
            }
        }
        return indexValues;
    }

    public static List<Integer> isTargetValuePresentInArray2(int[] numbers, int target) {
        /*
            Best approach
            Time: O(n log n)
            space: O(1)
         */
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int search = target - numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if(search == numbers[j]){
                    values.add(numbers[i]);
                    values.add(numbers[j]);
                }
            }

        }
        return values;
    }


}
