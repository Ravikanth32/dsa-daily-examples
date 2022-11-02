package com.patternhub.basics.statickeyword;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class StaticKeyWordExample {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam",29);
        System.out.println(sam.getAge());
        System.out.println(sam.companyName);

        Employee ravi = new Employee("Ravi",29,"Infy");
        System.out.println(ravi.getAge());
        System.out.println(ravi.companyName);
    }
}

@Data
@Getter
@Setter
class Employee{

    {
        System.out.println("I am in initialize block");
    }
    static{
        companyName = "Wipro";
    }
    static{
//        parentCompanyName = "parent - "+ companyName;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employee(String name, int age,String companyName) {
        this.name = name;
        this.age = age;
        this.companyName = companyName;
    }

    String name;
    int age;
    static String companyName = "xyz";
    static String parentCompanyName;

}
