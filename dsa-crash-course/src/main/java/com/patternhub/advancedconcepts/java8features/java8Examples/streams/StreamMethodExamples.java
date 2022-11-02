package com.patternhub.advancedconcepts.java8features.java8Examples.streams;

import com.patternhub.basics.collectionsExamples.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodExamples {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee.companyName= "patternhub";
        Employee e1 = new Employee(1,"Sandeep",20000.40,2345678);
        Employee e2 = new Employee(2,"Ravi",30000.40,2345678);
        Employee e3 = new Employee(3,"venkat",20000.40,2345678);
        Employee e4 = new Employee(4,"sai",25000.40,2345678);
        Employee e5 = new Employee(5,"pal",28000.40,2345678);
        Employee e6 = new Employee(6,"sal",90000.40,2345678);
        Employee e7 = new Employee(7,"dal",20900.40,2345678);
        Employee e8 = new Employee(8,"ram",70000.40,2345678);
        Employee e9 = new Employee(9,"sam",789000.40,2345678);
        Employee e10 = new Employee(10,"veera",875000.40,2345678);


        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);

        List<Employee> collect = employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .collect(Collectors.toList());

//        collect.forEach(System.out::println);

        boolean anyEmployeeNameStartsWithR = employees.stream().noneMatch(employee -> employee.getName().startsWith("s"));
        System.out.println(anyEmployeeNameStartsWithR);
    }


}
