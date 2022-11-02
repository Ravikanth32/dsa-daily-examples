package com.patternhub.basics.java8features.asyncProgramming;

import java.util.List;
import java.util.Optional;

public class BlockingExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        UserService userService = new UserService();
        MessageService messageService = new MessageService();
        SendNotificationService notificationService = new SendNotificationService();
        Optional<List<User>> allUsers = userService.getAllUsers();
        if (allUsers.isPresent()){
            for (User u: allUsers.get()) {
                if(u.getFirstName().equals("fname1")) {
                    String subject = messageService.getSubject(u);
                    String email = messageService.getRecipients(u);
                    String message = messageService.getMessageContent(u, subject);
                    System.out.println("After Message :- " + Thread.currentThread().getName());
                    if (null != u.getPhone()) {
                        notificationService.sendOTPToPhone(u.getPhone(), message);
                    }
                    if (u.getEmail() != null) {
                        notificationService.sendOTPToEmail(email, message);
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time taken in Seconds .. "+(endTime-startTime)/1000);
    }

}


