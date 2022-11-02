package com.patternhub.advancedconcepts.oopsconcepts.inheritanceExamples;

public class FinalKeyWordExample {

    public static void main(String[] args) {
        CasioCalculator1 casioCalculator = new CasioCalculator1();
        int result = casioCalculator.add(20,30);
        casioCalculator.display(result);

    }
}
class Calculator1{
    int i = 10;
    final public int add(int a,int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }




}


class CasioCalculator1 extends Calculator1{
    int cost;
    String color;
    int i = 20;

    public void display(int result){
        System.out.println(result);
    }

//    @Override
//    public int add(int a,int b){
//        System.out.println("I am in child add method "+ i);
//        return a+b;
//    }


}
