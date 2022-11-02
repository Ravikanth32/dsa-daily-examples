package com.patternhub.codingproblems.easy.patternquestions;

public class PatternQuestionExamples {
    public static void main(String[] args) {
//        printSolidRectangle(5,5);
//        printHollowRectangle(5, 5);
//        printHalfPyramid(5, 5);
//        printInvertedHalfPyramid(5, 5);
//        printInvertedHalfPyramid180Degrees(5, 5);

//        invertedHalfPyramidWithNumbers(5);
//        printFloydTriangle(5);
        zeroOneTriangle(5);
    }

    static void printSolidRectangle(int n, int m) {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
    static void printHollowRectangle(int n, int m) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
    static void printHalfPyramid(int n, int m) {

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void printInvertedHalfPyramid(int n, int m) {

        /*
        * * * * *
        * * * *
        * * *
        * *
        *
        */

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j=j-i) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void printInvertedHalfPyramid180Degrees(int n, int m) {
        /*
             *
           * *
         * * *
       * * * *
     * * * * *
     */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void invertedHalfPyramidWithNumbers(int n){

        for (int i = 1; i<= n;i++){
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j);

            }
            System.out.println();

        }


    }
    static void printFloydTriangle(int n){
        int number=1;
        for(int i = 1 ; i <= n ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();

        }

    }

    static void zeroOneTriangle(int n){

        for(int i = 1 ; i <= n ; i++){
            for (int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }

            }
            System.out.println();

        }

    }

}
