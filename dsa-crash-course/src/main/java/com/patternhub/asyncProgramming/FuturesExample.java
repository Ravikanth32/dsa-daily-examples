package com.patternhub.asyncProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FuturesExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future1 =executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1,2,3);
        });

        Future<List<Integer>> future2 =executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1,2,3);
        });

//        List<Integer> integers = future1.get();
//        System.out.println(integers);

        CompletableFuture<String> completableFuture= new CompletableFuture<String>();
        completableFuture.get();
        completableFuture.complete("return dummy data");
    }

    private static void delay(int min){
        try {
            TimeUnit.MINUTES.sleep(min);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
