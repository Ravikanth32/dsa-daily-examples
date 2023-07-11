package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems.rotation;

/**
 * @author ravikant_kondepati
 */
public class FindPivotInRotatedSortedArray {
    public static void main(String[] args) {
        int[] numbers = {4,5,6,1,2,3};
        System.out.println(findPivot(numbers));
    }
    static int findPivot(int[] numbers){
        int start =0;
        int end = numbers.length-1;
        while (start<=end){
            int middle = start+(end-start)/2;
            if(middle < end && numbers[middle] >= numbers[middle+1]){
                return middle;
            }
            if(middle > start && numbers[middle] <= numbers[middle-1]){
                return middle-1;
            }
            if(numbers[middle] <= numbers[start]){
                end = middle-1;
            }else{
                start = middle+1;
            }
        }
        return -1;
    }
}
