package com.patternhub.javacourse.advancedconcepts.java8features.asyncProgramming;

import java.util.concurrent.TimeUnit;

public class MessageService {

    public String getSubject(User user){
        System.out.println("GetSubject in:- "+Thread.currentThread().getName());
        String subject = "OTP";
        if(user.getFirstName().contains("1")){
            subject = "OTP Message";
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return subject;

    }

    public String getMessageContent(User user,String subject){
        System.out.println("GetMessageContent in:- "+Thread.currentThread().getName());
        String message="Please do not share your OTP";
        if(user.getFirstName().contains("1") && subject.contains("OTP")){
            message = "OTP Message";
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return message;
    }


    public String getRecipients(User user){
        System.out.println("GetRecipients in:- "+Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user.getEmail();
    }
}
