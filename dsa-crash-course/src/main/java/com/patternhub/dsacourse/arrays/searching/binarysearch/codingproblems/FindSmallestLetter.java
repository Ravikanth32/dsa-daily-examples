package com.patternhub.dsacourse.arrays.searching.binarysearch.codingproblems;

/**
 * @author ravikant_kondepati
 */
public class FindSmallestLetter {
    public static void main(String[] args) {
        char[] characters = {'a','c','h','m','p'};
        char target = 'h';
        System.out.println(findSmallestLetter(characters,target));
    }
    static char findSmallestLetter(char[] characters,char target){
        //if(target > characters[characters.length-1]) return -1;
        int start = 0;
        int end = characters.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target > characters[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return characters[start % characters.length];
    }

}
