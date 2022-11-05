package com.patternhub.dsacourse.arrays.searching.linearsearch.seach2darray;

import java.util.Arrays;

/**
 * @author ravikant_kondepati
 */
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3,55},
                {4,14,5,65,78},
                {34,494,49,38,60}
        };
        System.out.println(Arrays.toString(search(numbers,60)));
    }
    public static int[] search(int[][] numbers, int target){
        if (numbers.length == 0) return new int[]{-1,-1};
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if(numbers[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
