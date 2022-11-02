package com.patternhub.basics.collections.collectionsExamples;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;
    private double salary;
    private long phoneNum;

    public static String companyName;

    public Employee(int id, String name, double salary, long phoneNum) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneNum=" + phoneNum +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        Employee e = (Employee) o;
////        return this.name.compareTo(e.name);
//        return (int) (this.salary-e.salary);
//    }
}
