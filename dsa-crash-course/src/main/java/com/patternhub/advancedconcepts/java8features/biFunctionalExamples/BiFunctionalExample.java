package com.patternhub.advancedconcepts.java8features.biFunctionalExamples;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class BiFunctionExample implements BiFunction<List<String>,List<String>,List<String>> {

    public static void main(String[] args) {

        BiFunctionExample biFunctionalExample= new BiFunctionExample();
        List<String> apply = biFunctionalExample.apply(Arrays.asList("1", "2", "5","3"), Arrays.asList("4", "6", "7","3"));

        System.out.println(apply);


        BiFunction<List<String>, List<String>, List<String>> biFunction = new BiFunction<List<String>, List<String>, List<String>>() {
            @Override
            public List<String> apply(List<String> l1, List<String> l2) {
                return Stream.of(l1, l2)
                        .flatMap(Collection::stream)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
            }

        };

        BiFunction<List<String>, List<String>, List<String>> listListListBiFunction = biFunction.andThen((list) -> {
            return list.stream().sorted().collect(Collectors.toList());
        });


    }

    @Override
    public List<String> apply(List<String> l1, List<String> l2) {
        return Stream.of(l1,l2)
                .flatMap(Collection::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
