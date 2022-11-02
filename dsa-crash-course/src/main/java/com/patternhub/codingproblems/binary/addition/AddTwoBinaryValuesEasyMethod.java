package com.patternhub.codingproblems.binary.addition;

/**
 * @author ravikant_kondepati
 */
public class AddTwoBinaryValuesEasyMethod {
    public static void main(String[] args) {
        String b1 = "1001";
        String b2 = "0110";
        double value1 = binaryToDecimal(b1);
        double value2 = binaryToDecimal(b2);
        double result = value1 + value2;
        Long binaryResult = decimalToBinary((int)result);
        System.out.println(binaryResult.toString());
    }

    public static double binaryToDecimal(String binary){
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

    public static Long decimalToBinary(int value){
        StringBuffer buffer = new StringBuffer();
        while(value > 0) {
            int reminder = value % 2;
            value = value / 2;
            buffer.append(reminder);
        }

        return Long.parseLong(buffer.reverse().toString());
    }
}
