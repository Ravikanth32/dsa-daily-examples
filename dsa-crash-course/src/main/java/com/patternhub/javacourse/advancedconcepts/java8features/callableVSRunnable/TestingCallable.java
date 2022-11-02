package com.patternhub.javacourse.advancedconcepts.java8features.callableVSRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
//        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        List<MyTask> tasks = new ArrayList();
//        tasks.add(new MyTask());
//        Future<Integer> integers = threadPoolExecutor.invokeAll(tasks);

        List<Future<Integer>> futures = new ArrayList();
        for (int i = 0; i <100; i++){
            Future<Integer> future = executorService.submit(new MyTask());
            futures.add(future);
        }


        for(Future<Integer> future : futures){
//            System.out.println(future.get(2,TimeUnit.SECONDS));
            System.out.println(future.get());
        }
        executorService.shutdownNow();
    }
}
