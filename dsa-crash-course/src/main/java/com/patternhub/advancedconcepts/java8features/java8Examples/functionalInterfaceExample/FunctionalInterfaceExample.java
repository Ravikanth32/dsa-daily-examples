package com.patternhub.advancedconcepts.java8features.java8Examples.functionalInterfaceExample;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        Runnable run = () -> System.out.println("Hello");
        Thread thread = new Thread(run);
        thread.run();

    }
}
