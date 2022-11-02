package com.patternhub.codingproblems.easy;

public class FindPrimeNumber {

    public static void main(String[] args) {

        int total = 0;
        for (int i = 0; i < 100000; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " Is Prime Number ");
                total++;
            }
        }
        System.out.println("Total Prime Numbers b/w 0 to 100 " + total);

    }

    static boolean isPrimeNumber(int num) {

        if (num <= 1) {
            System.out.println("1 is not a prime or not composite number");
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
