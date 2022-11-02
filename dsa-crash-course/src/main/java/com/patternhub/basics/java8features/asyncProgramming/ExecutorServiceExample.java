package com.patternhub.basics.java8features.asyncProgramming;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
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
                    Future<String> subjectFuture = executorService.submit(() -> messageService.getSubject(u));
                    Future<String> recipientFuture = executorService.submit(() -> messageService.getRecipients(u));
                    String subject = subjectFuture.get();
                    String email = recipientFuture.get();
                    Future<String> messageFuture = executorService.submit(() -> messageService.getMessageContent(u, subject));
                    String message = messageFuture.get();
                    System.out.println("After Message :- " + Thread.currentThread().getName());
                    if (null != u.getPhone()) {
                        executorService.execute(() -> notificationService.sendOTPToPhone(u.getPhone(), message));
                    }
                    if (u.getEmail() != null) {
                        executorService.execute(() -> notificationService.sendOTPToEmail(email, message));
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time taken in Seconds .. " + (endTime - startTime) / 1000);
        executorService.shutdown();
    }
}
