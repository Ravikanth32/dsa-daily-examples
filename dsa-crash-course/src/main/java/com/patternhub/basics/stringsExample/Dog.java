package com.patternhub.basics.stringsExample;


import com.patternhub.basics.inheritanceExamples.Animal;

public class Dog extends Animal {
    @Override
    public void move() throws NullPointerException {
        System.out.println();
    }

    public void sleep(){
        System.out.println("Sleeping");

    }

    public static void main(String[] args) {
        Dog s = new Dog();
        s.sleep();
    }
}
