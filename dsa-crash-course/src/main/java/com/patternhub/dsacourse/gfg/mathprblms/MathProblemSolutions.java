package com.patternhub.dsacourse.gfg.mathprblms;

/**
 * @author ravikant_kondepati
 */
public class MathProblemSolutions {
    public static void main(String[] args) {
        int number = 221;
//        System.out.println(countDigits(number));
//        System.out.println(sumDigits(number));
//        System.out.println(isPalindrome(number));
        System.out.println(findFactorial(number));
    }

    static int countDigits(int number) {
        number = checkConvertFromNegativeToPositiveNum(number);
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    static int sumDigits(int number) {
        number = checkConvertFromNegativeToPositiveNum(number);
        int sum = 0;
        while (number > 0) {
            int reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        return sum;
    }

    static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;
        int reminder;
        while (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        if (reverse == temp) {
            return true;
        }
        return false;
    }

    static long findFactorial(int number){
         long fact= 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    private static int checkConvertFromNegativeToPositiveNum(int number) {
        if (number < 0) {
            number = number * -1;
        }
        return number;
    }
}
