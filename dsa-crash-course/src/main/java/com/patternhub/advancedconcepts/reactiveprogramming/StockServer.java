package com.patternhub.advancedconcepts.reactiveprogramming;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;

import java.util.List;

public class StockServer {

    public static Observable<StockInfo> getFeed(List<String> symbols) {
        System.out.println("Created ....");
        return Observable.create(emitter -> emitPrice(emitter, symbols));
    }

    private static void emitPrice(ObservableEmitter<StockInfo> emitter, List<String> symbols) {
        System.out.println("Ready to emit...");
        int count = 0;
        while (count < 5) {
            symbols.stream()
                    .map(StockInfo::fetch)
                    .forEach(emitter::onNext);
            sleep(1000);
            count++;
        }
        emitter.onComplete();
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
