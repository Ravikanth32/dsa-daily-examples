package com.patternhub.javacourse.corebasics.datatypes;

import java.util.Arrays;

/**
 * @author ravikant_kondepati
 */
public class ArraysExample {
    public static void main(String[] args) {
        // How declare an array and initialize
        int[] nos = new int[10];
        /*
        int[] nos Declare --> new int[10] initializing with 10 means required 10 blocks for integer values
        index start with 0
        default values:
        int --> 0
        float -> 0.0
        String --> null
        */
        /*
        Operations: Add value && Access value from array
         */
        nos[0] = 10;
        nos[9] = 20;
        System.out.println(nos); // print memory location
        System.out.println(Arrays.toString(nos)); // Arrays utility class print items in [] format
        /*
        Access value from array
        Notes:
        length will give size of array in this case it is 10 but is available up to 9
         */
        for (int i = 0; i < nos.length; i++) {
            System.out.print(nos[i]+" ");
        }

    }
}
