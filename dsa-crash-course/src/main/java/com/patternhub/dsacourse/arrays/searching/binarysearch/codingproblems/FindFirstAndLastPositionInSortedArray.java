package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems;

import java.util.Arrays;

/**
 * @author ravikant_kondepati
 */
public class FindFirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 7, 7, 7, 8, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(findIndex(numbers,target)));
    }
    static int[] findIndex(int[] numbers,int target){
        int start = search(numbers,target,true);
        int end = search(numbers,target,false);
        return new int[]{start,end};
    }
    static int search(int[] numbers,int target, boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = numbers.length-1;
        while (start <= end){
            int middle = start + (end-start)/2;
            if(target > numbers[middle]){
                start = middle + 1;
            }else if(target < numbers[middle]){
                end = middle -1;
            }else{
                ans = middle;
                if(findFirstIndex){
                    end = middle-1;
                }else{
                    start = middle+1;
                }
            }
        }
        return ans;
    }
}
