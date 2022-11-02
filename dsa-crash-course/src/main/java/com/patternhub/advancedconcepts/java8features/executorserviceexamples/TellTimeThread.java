package com.patternhub.advancedconcepts.java8features.executorserviceexamples;

import java.util.Date;

public class TellTimeThread implements Runnable {

    @Override
    public void run() {
        System.out.println(new Date());
    }
}
