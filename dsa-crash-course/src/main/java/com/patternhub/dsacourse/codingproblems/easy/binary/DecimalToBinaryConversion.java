package com.patternhub.dsacourse.codingproblems.easy.binary;

/**
 * @author ravikant_kondepati
 */
public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        int value = 26;
        System.out.println(convert(value));
    }
    public static String convert(int value){
        /*
        26/2 --> number= 13 reminder = 0
        13/2 --> number = 6 reminder = 1
        6/2 --> number = 3 reminder = 0
        3/2 -> number= 1 reminder = 1
        1/2 -> number = 0 reminder = 1
        o/p --> 11010
         */
        StringBuffer buffer = new StringBuffer();
        while(value > 0) {
            int reminder = value % 2;
            value = value / 2;
            buffer.append(reminder);
        }

        return buffer.reverse().toString();
    }
}
