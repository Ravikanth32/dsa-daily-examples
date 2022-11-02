package com.patternhub.advancedconcepts.oopsconcepts.inheritanceExamples;

public class StaticMethodInheritanceExample {
    public static void main(String[] args) {
        CasioCalculator casioCalculator = new CasioCalculator();
        int result = casioCalculator.add(20,30);
        casioCalculator.display(result);
        int mulResult =CasioCalculator.mul(2,3);
        casioCalculator.display(mulResult);
    }
}


class Calculator{
    int i = 10;
    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

}


class CasioCalculator extends Calculator{
    int cost;
    String color;
    int i = 20;

    public void display(int result){
        System.out.println(result);
    }

    @Override
    public int add(int a,int b){
        System.out.println("I am in child add method "+ super.i);
        return a+b;
    }

//    @Override
    public static int mul(int a, int b){

        System.out.println("I am in child mul method");
        return a*b;
    }

}
