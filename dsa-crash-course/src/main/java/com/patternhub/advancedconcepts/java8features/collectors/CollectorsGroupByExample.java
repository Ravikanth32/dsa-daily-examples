package com.patternhub.advancedconcepts.java8features.collectors;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupByExample {
    public static void main(String[] args) {

//        Find how many employees are there in each Department
        List<Employee> employees = new ArrayList<>();
        Department cse = Department.builder().name("CSE").id(1L).build();
        Department ece = Department.builder().name("ECE").id(2L).build();
        Department dummy = Department.builder().name(null).id(2L).build();
        employees.add(Employee.builder().name("ravi").department(cse).id(1L).build());
        employees.add(Employee.builder().name("sam").department(cse).id(2L).build());
        employees.add(Employee.builder().name("raj").department(ece).id(3L).build());
        employees.add(Employee.builder().name("ram").department(ece).id(4L).build());
        employees.add(Employee.builder().name("ram").department(ece).id(5L).build());
        employees.add(Employee.builder().name("sam").department(dummy).id(6L).build());

        Map<String, Long> numberOfEmployeesByDepartment =
                employees.stream().collect(
                        Collectors.groupingBy(
                                emp -> emp.getDepartment().getName() != null ? emp.getDepartment().getName() : "", Collectors.counting()
                        )
                );
        System.out.println(numberOfEmployeesByDepartment);


        Map<String, Map<String, Long>> groupByDepartmentAndEmployeeName = employees.stream().collect(
                Collectors.groupingBy(
                        emp -> emp.getDepartment().getName() != null ? emp.getDepartment().getName() : "", Collectors.groupingBy(emp -> emp.getName(),Collectors.counting())
                )
        );
        System.out.println(groupByDepartmentAndEmployeeName);
    }

}

@Data
@Builder
class Employee {
    Long id;
    String name;
    Department department;
}

@Data
@Builder
class Department {
    Long id;
    String name;

}