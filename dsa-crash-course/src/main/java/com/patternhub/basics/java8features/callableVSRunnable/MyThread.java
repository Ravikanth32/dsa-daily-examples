package com.patternhub.basics.java8features.callableVSRunnable;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
