package com.patternhub.codingproblems.easy.numberpatternquestions;

public class NumberPatternQuestionExamples {

    public static void main(String[] args) {
//        printIncreasingTriangle();
//        printDecreasingTriangle();
//        printHillTriangle();
//        printNumberPattern();
//        printHillTriangle2();
        printFloydTriangle();
    }

    static void printIncreasingTriangle() {
        int n = 5;
        int counter = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(counter + " ");
            }
            System.out.println();
            counter++;
        }

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(counter + " ");
            }
            System.out.println();
            counter++;
        }
    }

    static void printDecreasingTriangle() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            int counter = 1;
            for (int j = i; j <= n; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }

    static void printHillTriangle() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int counter = 1;
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }

    }

    static void printNumberPattern() {
        int n = 5;

//        for (int i = 1; i <= n ; i++){
//            for(int j =1,counter= 5; j <= i; j++,counter--){
//                System.out.print(counter+" ");
//            }
//            System.out.println();
//        }


        for (int i = 1, k = n; i <= n; i++, k--) {
            int counter = k;
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(counter-- + " ");
            }
            System.out.println();
        }

    }

    static void printHillTriangle2() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int counter = 1;
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(counter++ + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(counter-- + " ");
            }
            System.out.println();
        }

    }

    static void printFloydTriangle() {
        int n = 5;
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            //int k = counter;
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
//            counter++;
        }

    }

}
