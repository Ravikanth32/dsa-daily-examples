package com.patternhub.javacourse.advancedconcepts.oopsconcepts.accessModifiersExamples2;

public class User {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Example{
    public static void main(String[] args) {
        User u= new User();
        u.setName("Sandeep");
        u.setAge(27);

        System.out.println(u);
    }
}
