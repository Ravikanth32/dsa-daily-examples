package com.patternhub.codingproblems.easy.numberprogram;

public class NumberProgramExamples {
    public static void main(String[] args) {
//        printDigits();
//        printPalindrome();
//        printSpyNumber();
//        printSpecialNumber();
//        printHarshadNumber();
//        printDuckNumber();
//        printNeonNumber();
//        printAutomorphicNumber();
        printKMNumber();
    }

    static void printDigits() {
        int n = 123;
        int m = n;
        while (n != 0) {
            int d = n % 10;
            System.out.println(d);
            n = n / 10;
        }

    }

    static void printPalindrome() {
        int n = 121;
        int m = n;
        int temp = 0;
        while (n != 0) {
            int d = n % 10;
            temp = temp * 10 + d;
            n = n / 10;
        }
        if (temp == m)
            System.out.println(m + " is a palindrome Number");
        else
            System.out.println(m + " is not a palindrome Number");

    }

    static void printSpyNumber() {
        int n = 123; // sum of the digits of number equal to product of digits of number
        int m = n;
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int d = n % 10;
            sum = sum + d;
            product = product * d;
            n = n / 10;
        }
        if (sum == product)
            System.out.println(m + " is a spy Number");
        else
            System.out.println(m + " is not a spy Number");

    }

    static void printSpecialNumber() {
        int n = 59; // sum of the digits of number and product of digits of number sum is equal to Number
        int m = n;
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int d = n % 10;
            sum = sum + d;
            product = product * d;
            n = n / 10;
        }
        int total = sum + product;
        if (total == m)
            System.out.println(m + " is a Special Number");
        else
            System.out.println(m + " is not a Special Number");

    }

    static void printHarshadNumber() {
        int n = 156; // sum of the digits should divisible by number
        int m = n;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        if (m % sum == 0)
            System.out.println(m + " is a Niven Number");
        else
            System.out.println(m + " is not a Niven Number");

    }

    static void printDuckNumber() {
        int n = 106; // number should contain at least one zero
        int m = n;
        boolean flag = false;
        while (n != 0) {
            int d = n % 10;
            if (d == 0) {
                flag = true;
                break;
            }
            n = n / 10;
        }
        if (flag) {
            System.out.println(m + " is a Duck Number");
        } else
            System.out.println(m + " is not a Duck Number");

    }

    static void printNeonNumber() {
        int n = 1; // 0, 1, 9 [square of number digits sum equal to number(9) 9*9=81 -> 8+1 = 9]
        int square = n * n;
        int sum = 0;
        while (square != 0) {
            int d = square % 10;
            sum = sum + d;
            square = square / 10;
        }
        if (n == sum)
            System.out.println(n + " is a Neon Number");
        else
            System.out.println(n + " is not a Neon Number");

    }

    static void printAutomorphicNumber() {
        int n = 25; // 25 * 25 =  625 [25 is in 625]
        int m = n;
        boolean flag = true;
        int square = n * n;
        while (n != 0) {
            int d = n % 10;
            int d1 = square % 10;
            if (d != d1)
                flag = false;
            n = n / 10;
            square = square / 10;
        }
        if (flag)
            System.out.println(m + " is a Automorphic Number");
        else
            System.out.println(m + " is not a Automorphic Number");

    }

    static void printKMNumber() {
        int n = 145; // 25 * 25 =  625 [25 is in 625]
        int m = n;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (sum == m)
            System.out.println(m + " is a KM Number");
        else
            System.out.println(m + " is not a KM Number");

    }


}
