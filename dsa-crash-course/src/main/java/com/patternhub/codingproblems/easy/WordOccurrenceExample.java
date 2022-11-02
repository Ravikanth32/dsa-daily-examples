package com.patternhub.codingproblems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurrenceExample {

    public static void main(String[] args) {
        String sentence = "Ram went to home and completed Ram home work";
        List<String> words = Arrays.asList(sentence.split(" "));
//        Map<String, Long> wordsOccurrence = findWordOccurrence(words);
        Map<String, Long> wordsOccurrence = findWordOccurrenceInOldFashion(words);
        wordsOccurrence.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static Map<String, Long> findWordOccurrence(List<String> words) {
        return words.stream().
                collect(Collectors.groupingBy(word -> word, Collectors.counting()));


    }

    private static Map<String, Long> findWordOccurrenceInOldFashion(List<String> words) {
        Map<String, Long> wordsOccurrence = new HashMap<>();
        for (String word : words) {
            if (wordsOccurrence.containsKey(word)) {
                wordsOccurrence.put(word, wordsOccurrence.get(word) + 1);
            } else {
                wordsOccurrence.put(word, 1L);
            }
        }
        return wordsOccurrence;
    }
}
