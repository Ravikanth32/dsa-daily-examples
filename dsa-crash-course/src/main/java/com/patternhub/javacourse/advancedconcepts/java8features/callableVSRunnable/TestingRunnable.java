package com.patternhub.javacourse.advancedconcepts.java8features.callableVSRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestingRunnable {

    public static void main(String[] args) {

        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        MyThread testing = new MyThread();
        executorService.submit(testing);
    }
}
