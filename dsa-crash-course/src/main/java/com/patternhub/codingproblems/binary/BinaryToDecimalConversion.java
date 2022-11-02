package com.patternhub.codingproblems.binary;

/**
 * @author ravikant_kondepati
 */
public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        String binary= "10110";
        System.out.println(convert(binary));
    }
    public static double convert(String binary){
        long num = Long.parseLong(binary);
        long reminder;
        double sum = 0;
        long i = 0;
        while(num > 0) {
            reminder = num % 10;
            num = num / 10;
            sum = sum + (Math.pow(2,i) * reminder);
            i++;
        }
        return sum;
    }


}
