package com.patternhub.javacourse.basics.io.ioExamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(args[0] +" " + args[1] + " "+ args[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int a = 0;
        try {
            a = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter always number");
//            a = scanner.nextInt();
        }
        System.out.println("Please enter your second number");
        String b = scanner.nextLine();
        int result = add(a,12);
        System.out.println("Result is "+result);

//        System.out.println("I am ravi");
//        int result = 100/0;
//        System.out.println("I am sandeep");
        
        /*
        
        try{
        
        }catch
        
         */

    }

    public static int add(int a, int b){
        return a+b;
    }
}
