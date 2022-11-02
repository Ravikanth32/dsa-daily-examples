package com.patternhub.advancedconcepts.oopsconcepts.accessModifiersExamples2;

import com.patternhub.basics.accessModifiersExamples.ClaasA;

public class ClassC extends ClaasA {


    private void m4(){
        System.out.println("m3");
    }

    public static void main(String[] args) {
        ClassC c= new ClassC();
        c.m1();
        c.m2();
    }


}

