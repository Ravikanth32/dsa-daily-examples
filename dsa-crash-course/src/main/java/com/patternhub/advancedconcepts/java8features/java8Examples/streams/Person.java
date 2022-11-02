package com.patternhub.advancedconcepts.java8features.java8Examples.streams;

import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private Integer age;
    private List<Long> phoneNumbers;

    public Person() {
    }

    public Person(String name, Integer age, List<Long> phoneNumbers) {
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public List<Long> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Long> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "["+this.name +" -- "+ this.age+" ---"+this.phoneNumbers+"]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }


}
