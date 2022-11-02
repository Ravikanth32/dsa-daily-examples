package com.patternhub.javacourse.advancedconcepts.java8features.executorserviceexamples;

public class MyThread implements Runnable {

    int i;

    public MyThread() {
    }

    public MyThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int j = 1; j<= i; j++){
            sum += j;
        }
        System.out.println(" Sum up to "+i +" is "+sum);
    }
}
