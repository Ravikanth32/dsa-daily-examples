package com.patternhub.javacourse.advancedconcepts.java8features.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/ravikant_kondepati/Documents/Learning/java/java-coding-problems/src/main/resources/names.txt");
        try {
//            List<String> lines = Files.readAllLines(path);
//            List<String> setOfWords = new ArrayList<>();
//            for (String line: lines) {
//                String[] words = line.split(" ");
////                System.out.println(Arrays.stream(words).findFirst().get());
//                Arrays.stream(words).forEach(word -> {
//                    setOfWords.add(word);
//                });
//            }
            Files.lines(path)
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByKey().reversed())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new))
                    .forEach((map, value) -> System.out.println(map + " --> " + value));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
