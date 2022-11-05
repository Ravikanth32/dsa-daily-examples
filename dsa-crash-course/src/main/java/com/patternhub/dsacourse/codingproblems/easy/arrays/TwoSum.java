package com.patternhub.dsacourse.codingproblems.easy.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ravikant_kondepati
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 17};
        int target = 5;
//        System.out.println(isTargetValuePresentInArray1(numbers, target));
//        System.out.println(isTargetValuePresentInArray2(numbers, target));
        System.out.println(isTargetValuePresentInArray3(numbers, target));
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
            for (int j = i + 1; j < numbers.length; j++) {
                if (search == numbers[j]) {
                    values.add(numbers[i]);
                    values.add(numbers[j]);
                }
            }

        }
        return values;
    }

    public static List<Integer> isTargetValuePresentInArray3(int[] numbers, int target) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                list.add(map.get(numbers[i]));
                list.add(i);
            } else {
                map.put(target - numbers[i], i);
            }

        }
        return list;
    }
}
