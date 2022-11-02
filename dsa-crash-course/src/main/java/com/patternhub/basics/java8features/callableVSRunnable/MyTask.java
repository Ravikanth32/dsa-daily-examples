package com.patternhub.basics.java8features.callableVSRunnable;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return new Random().nextInt(Integer.MAX_VALUE);
    }
}
