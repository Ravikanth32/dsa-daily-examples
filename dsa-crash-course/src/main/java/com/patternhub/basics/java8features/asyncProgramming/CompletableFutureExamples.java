package com.patternhub.basics.java8features.asyncProgramming;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;

public class CompletableFutureExamples {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("I am in:- " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        UserService userService = new UserService();
        MessageService messageService = new MessageService();
        SendNotificationService notificationService = new SendNotificationService();
        Optional<List<User>> allUsers = userService.getAllUsers();
        if (allUsers.isPresent()) {
            for (User u : allUsers.get()) {
                if ("fname1".equals(u.getFirstName())) {
                    CompletableFuture<String> subjectCompletableFuture = CompletableFuture
                            .supplyAsync(() -> messageService.getSubject(u), executorService);
                    CompletableFuture<String> recipientCompletableFuture = CompletableFuture
                            .supplyAsync(() -> messageService.getRecipients(u), executorService);
                    CompletableFuture<String> messageCompletableFuture = subjectCompletableFuture
                            .thenApplyAsync(subject -> messageService.getMessageContent(u, subject), executorService);
                    String message = messageCompletableFuture.join();
                    System.out.println("After Message :- " + Thread.currentThread().getName());
                    if (null != u.getPhone()) {
                        CompletableFuture
                                .runAsync(() -> notificationService.sendOTPToPhone(u.getPhone(), message), executorService);
                    }
                    if (u.getEmail() != null) {
                        recipientCompletableFuture
                                .thenAcceptAsync(email -> notificationService.sendOTPToEmail(email, message));
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();
        executorService.shutdown();
        System.out.println("Total Time taken in Seconds .. " + (endTime - startTime) / 1000);


    }

    public static void delay(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
