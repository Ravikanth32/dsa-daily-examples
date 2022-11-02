package com.patternhub.advancedconcepts.oopsconcepts.abstraction;

public class Testing extends B {

    public static void main(String[] args) {
        Testing testing = new Testing();
        testing.m5();

//        A a = new A();
//        a.m1();

        B b = new B();
        b.m3();
    }

    public void m5(){
        m4();
//        m2();
        System.out.println("m5");
    }

}


abstract class A{
    public void m1(){
        System.out.println("I am m1");
    }

    public void m2(){
        System.out.println("I am m2");
    }

    abstract public void m6();
    abstract public void m7();

}


class B extends A{
    public void m3(){
        System.out.println("m3");
    }
    public void m4(){
        System.out.println("M4");
    }

     @Override
     public void m6() {

     }

    @Override
    public void m7() {

    }
}

