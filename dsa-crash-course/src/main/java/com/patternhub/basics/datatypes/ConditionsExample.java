package com.patternhub.basics.datatypes;

import java.util.Scanner;

public class ConditionsExample {
    public static void main(String[] args) {
//        Provide discount to customer based on purchase amount
//        If Purchase amount more than 10000 give 10% or more than 5000 5%
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter purchase Amount ");
        float purchaseAmount = scanner.nextFloat();
        float discAmount = 0;
        if (purchaseAmount >= 10000) {
            discAmount = purchaseAmount * 10 / 100;
        } else if (purchaseAmount >= 5000) {
            discAmount = purchaseAmount * 5 / 100;
        }
        float totalAmount = purchaseAmount - discAmount;

        System.out.println("Total Amount " + totalAmount);
    }
}
