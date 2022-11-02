package com.patternhub.advancedconcepts.asyncProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CompletableFuturesExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        runAsyncExample();
        supplyAsyncExample();

    }

    static void runAsyncExample() throws ExecutionException, InterruptedException {

        CompletableFuture<Void> runAsyncWithoutExecutor = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName());
//            delay(1);
            IntStream.of(1,2,3)
                    .forEach(System.out::print);
            System.out.println();
        });
        runAsyncWithoutExecutor.get();

        ExecutorService executor = Executors.newFixedThreadPool(10);

        CompletableFuture<Void> runAsyncWithExecutor = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName());
//            delay(1);
            IntStream.of(1,2,3)
                    .forEach(System.out::print);
            System.out.println();
        },executor);
//        runAsyncWithExecutor.get();
//        runAsyncWithExecutor.toCompletableFuture();

    }

    static void supplyAsyncExample() throws ExecutionException, InterruptedException {

        CompletableFuture<List<Integer>> supplyAsync = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return Arrays.asList(1, 2, 3, 4,5,678,234);
        });
        CompletableFuture<List<Integer>> listCompletableFuture = supplyAsync.thenApplyAsync(x -> {
            return x.stream().sorted().collect(Collectors.toList());
        });
        List<Integer> integers = listCompletableFuture.get();
        System.out.println(integers);

        ExecutorService executor = Executors.newCachedThreadPool();

        CompletableFuture<List<Integer>> supplyAsyncWithExecutor = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return Arrays.asList(13, 23, 34, 41);
            },executor);


//        supplyAsync.thenApplyAsync(list -> list.stream().sorted()
//                .collect(Collectors.toList()))
//                .thenAccept(list -> {
//                            list.forEach(System.out::println);
//        });


        // Combine all running futures

//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(supplyAsync, supplyAsyncWithExecutor);
//        System.out.println(voidCompletableFuture.get());

        Stream.of(supplyAsync,supplyAsyncWithExecutor)
                .map(CompletableFuture::join)
                .flatMap(List::stream)
                .forEach(x -> System.out.println(x));


        //thenCompose()

        CompletableFuture<Boolean> booleanCompletableFuture = produceNames().thenCompose(names -> isNameExists(names));
        System.out.println(booleanCompletableFuture.get());


        //thenApplyAsync()

        CompletableFuture<CompletableFuture<Boolean>> completableFutureCompletableFuture = produceNames().thenApplyAsync(names -> isNameExists(names));
        System.out.println(completableFutureCompletableFuture.get().get());


        // thenCombine()


        CompletableFuture<List<String>> allNames = produceNames().thenCombine((produceMoreNames()), (names, moreNames) -> {
//            return Stream.of(names,moreNames).flatMap(List::stream).collect(Collectors.toList());
//            names.addAll(moreNames);
            return Stream.concat(names.stream(),moreNames.stream()).collect(Collectors.toList());
        });


        CompletableFuture<String> completableFuture = allNames.thenApplyAsync(names -> {
            return String.join(",", names);
        });

        completableFuture.thenAccept(System.out::println);

        //allOf
        List<String> webPageLinks = Arrays.asList("page1","Page2");

        List<CompletableFuture<String>> pageFutures = webPageLinks.stream()
                .map(CompletableFuturesExample::downloadWebPage)
                .collect(Collectors.toList());

        CompletableFuture<Void> futures = CompletableFuture.allOf(pageFutures.toArray(new CompletableFuture[pageFutures.size()]));

        CompletableFuture<List<String>> allPageContent = futures.thenApply(
                (future) -> pageFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList()));

        allPageContent.thenAccept(pageContents -> {
            pageContents.forEach(System.out::println);
        });

    }

   public static CompletableFuture<String> downloadWebPage(String pageLink) {
        return CompletableFuture.supplyAsync(() -> {
            // Code to download and return the web page's content
            return pageLink.concat(" Completed");
        });
    }


    public static CompletableFuture<List<String>> produceNames(){
        return CompletableFuture.supplyAsync(()-> {
           return Arrays.asList("ravi","ramu","paul","sam");
        });
    }

    public static CompletableFuture<List<String>> produceMoreNames(){
        return CompletableFuture.supplyAsync(()-> {
            return Arrays.asList("ravi","ramu","paul","sam");
        });
    }

    public static CompletableFuture<Boolean> isNameExists(List<String> names){
        return CompletableFuture.supplyAsync(() ->{
            return names.contains("ravi");
        });
    }

    static void delay(int min){
        try {
            TimeUnit.MINUTES.sleep(min);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
