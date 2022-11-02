package com.patternhub.arrays.searching.linearsearch;

import java.util.Scanner;

/**
 * @author ravikant_kondepati
 */
public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Search value: ");
        int[] data = { 20, 39, 72, 41, 2, 4};
        int target = sc.nextInt();
        int index = linearSearch(data, target);
        System.out.println("found at index "+index);

        boolean itemFound = targetItemFound(data, target);
        System.out.println("is target item found "+itemFound);
    }
    public static boolean targetItemFound(int[] data, int target){
        for(int item: data){
            if(item == target){
                return true;
            }
        }
        return false;
    }
    public static int linearSearch(int[] data, int target){
        if(data.length == 0){
            return -1;
        }
        for (int index = 0; index < data.length; index++) {
            if(data[index] == target){
                return index;
            }
        }
        return -1;
    }

}
