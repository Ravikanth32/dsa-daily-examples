package com.patternhub.codingproblems.easy.binary.addition;

/**
 * @author ravikant_kondepati
 */
public class AddTwoBinaryValuesWithJava {
    public static void main(String[] args) {
        String b1 = "1001";
        String b2 = "0110";
        Integer result = Integer.parseInt(b1,2)+ Integer.parseInt(b2, 2);
        System.out.println(Integer.toBinaryString(result));
    }

}
