package com.patternhub.javacourse.advancedconcepts.java8features.streams;

import java.util.stream.Stream;

public class StreamHelloWorld {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("ravi", "venkat");
        stream.map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
