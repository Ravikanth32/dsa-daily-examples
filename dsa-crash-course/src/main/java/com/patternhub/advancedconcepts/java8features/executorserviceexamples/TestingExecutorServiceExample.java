package com.patternhub.advancedconcepts.java8features.executorserviceexamples;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestingExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        ExecutorService singleExecutorService = Executors.newSingleThreadExecutor();
//        ExecutorService cachedExecutorService = Executors.newCachedThreadPool();
//        for( int i = 1; i <= 100000; i++) {
//            executorService.execute(new MyThread(i));
//        }
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        scheduledExecutorService.schedule(new TellTimeThread(),10, SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new TellTimeThread(),10,1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new TellTimeThread(),10,1, TimeUnit.SECONDS);

        executorService.submit((Callable<Void>) () -> null);
    }
}
