package com.patternhub.basics.java8features.asyncProgramming;

import java.util.concurrent.TimeUnit;

public class SendNotificationService {
    public void sendOTPToPhone(Long phone,String message){
        System.out.println("Sending OTPTOPhone I am in:- "+ Thread.currentThread().getName());
        System.out.println("Text Message Sending Started ......");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Text Message Sent Successfully ......");
    }

    public void sendOTPToEmail(String email,String message){
        System.out.println("Sending OTPTOEmail am in:- "+ Thread.currentThread().getName());
        System.out.println("Email Message Sending Started ......");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Email Message Sent Successfully ......");
    }
}
