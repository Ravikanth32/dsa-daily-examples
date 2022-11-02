package com.patternhub.advancedconcepts.reactiveprogramming;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StockInfo {
    private double value;
    private String ticker;

    public static StockInfo fetch(String stock) {
        return new StockInfo(100.00, stock);
    }

}
