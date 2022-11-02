package com.patternhub.basics.java8features.executorserviceexamples;

public class RunThreadExample {
    public static void main(String[] args) {


        for( int i = 0; i < 10; i++) {
            Thread thread1 = new Thread(new MyThread());
            thread1.start();
        }
    }
}
