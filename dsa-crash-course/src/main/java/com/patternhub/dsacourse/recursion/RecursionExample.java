package com.patternhub.dsacourse.recursion;

/**
 * @author ravikant_kondepati
 */
public class RecursionExample {
    public static void main(String[] args) {
        print(0);
    }
    public static void print(int n){
        if(n > 5) return;
        System.out.println(n);
        n++;
        print(n);
    }
}
