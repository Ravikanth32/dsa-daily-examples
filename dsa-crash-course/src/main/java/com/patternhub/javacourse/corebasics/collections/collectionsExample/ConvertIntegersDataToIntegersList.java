package com.patternhub.javacourse.corebasics.collections.collectionsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertIntegersDataToIntegersList {
    public static void main(String[] args) {
        int[] integers= {1,2,3,4,5};

//        Method 1

        List<Integer> basicList = new ArrayList<>();

        for (int i = 0; i < integers.length; i++) {
            basicList.add(integers[i]);
        }

        System.out.println(basicList);

//        Method 2 java 8 with Lambda

        List<Integer> streamList= Arrays.stream(integers).boxed().collect(Collectors.toList());
        System.out.println(streamList);

//        Method 3 java 8 with IntStream

        List<Integer> intStreamList= IntStream.of(integers).boxed().collect(Collectors.toList());
        System.out.println(intStreamList);

    }
}
