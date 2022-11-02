package com.patternhub.advancedconcepts.oopsconcepts.inheritanceExamples;

public class MethodOverridingRules {

    public static void main(String[] args) {

    }
}

// class Animal{
//    void move() throws Exception {
//        System.out.println();
//    }
//}

/// private < dafault < protected < public

class Dog{

    void move() throws Exception {
        System.out.println("I am in B ");
    }


}