package com.patternhub.oopsconcepts.accessModifiersExamples;

public class ClaasA {

    public void m1(){
        System.out.println("m1");
    }

    protected void m2() {
        System.out.println("M2");
    }

    void m3(){
        System.out.println("M3");
    }

    private void m4(){
        System.out.println("m4");
    }

}

class ClassB extends ClaasA{


    @Override
    void m3(){
        System.out.println("m3");
    }

}

class Testing{
    public static void main(String[] args) {
        ClassB claasA= new ClassB();
        claasA.m1();
        claasA.m2();
        claasA.m3();

    }
}
