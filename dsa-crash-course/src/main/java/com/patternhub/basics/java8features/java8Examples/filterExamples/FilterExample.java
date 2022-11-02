package com.patternhub.basics.java8features.java8Examples.filterExamples;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {

//        Stream<Integer> list = Stream.of(1,2,3,3,6);
//
//        long count = list.filter(x -> x > 5).count();
//        System.out.println(count);

        List<String> names = Arrays.asList("ravi","manohar","sai");

//        List<Integer> collect = names.stream().map(name -> name.length()).collect(Collectors.toList());
//        System.out.println(collect.toString());
//
//        Integer count = collect.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(count);

        Integer count = names.stream().map(String::length).mapToInt(Integer::intValue).sum();
        System.out.println(count);

    }
}
