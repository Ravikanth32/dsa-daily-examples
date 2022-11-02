package com.patternhub.basics.java8features.executorserviceexamples;

import java.util.concurrent.*;

public class MyTestingWithThreads {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        System.out.println("Before submitting");
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(10000);
            System.out.println("-----> " + Thread.currentThread().getName());
            //throw new RuntimeException("happing");
            return "something";
        });
//        while (!future.isDone()) {
//            Thread.sleep(1000);
//            System.out.println("Tasking is running ..... " + Thread.currentThread().getName());
//        }
//        try {
//            System.out.println("After submitting " + future.get());
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        executorService.shutdown();
        if (!executorService.awaitTermination(11000, TimeUnit.MILLISECONDS))
            executorService.shutdownNow();

    }
}
