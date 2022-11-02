package com.patternhub.codingproblems.binary;

/**
 * @author ravikant_kondepati
 */
public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        int value = 26;
        System.out.println(convert(value));
    }
    public static String convert(int value){
        StringBuffer buffer = new StringBuffer();
        while(value > 0) {
            int reminder = value % 2;
            value = value / 2;
            buffer.append(reminder);
        }

        return buffer.reverse().toString();
    }
}
