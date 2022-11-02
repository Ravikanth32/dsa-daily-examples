package com.patternhub.codingproblems.easy.binary.addition;

/**
 * @author ravikant_kondepati
 */
public class AddTwoBinaryValuesWithBinaryAddition {
    public static void main(String[] args) {
        String b1 = "1001";
        String b2 = "0111";
        StringBuilder builder = new StringBuilder();

        /*
        1 + 1 -> value = 0 carry = 1
        1 + 0 -> value = 1 carry = 0
         */
        int i = b1.length() - 1;
        int j = b2.length() - 1;
        int sum;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            sum = carry + b1.charAt(i) - '0' + b2.charAt(j) - '0';
            if (sum > 1) {
                carry = 1;
                builder.append(0);
            } else {
                builder.append(sum);
                carry = 0;
            }
            i--;
            j--;
        }
        if (carry > 0) {
            builder.append(carry);
        }
        System.out.println(builder.reverse().toString());
    }

}
