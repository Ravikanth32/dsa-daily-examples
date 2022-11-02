package com.patternhub.javacourse.advancedconcepts.reactiveprogramming;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        var stocks = Arrays.asList("ITC", "facebook");
        Observable<StockInfo> feed = StockServer.getFeed(stocks);
        System.out.println("Got Observable ......");
        feed.filter(stockInfo -> stockInfo.getValue() > 100)
                .subscribe(System.out::println,
                        error -> System.out.println("ERROR: " + error),
                        () -> System.out.println("DONE "));
    }
}
