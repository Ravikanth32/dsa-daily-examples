package com.patternhub.advancedconcepts.java8features.optional;


import lombok.Builder;
import lombok.Data;

import java.util.List;

public class OptionalExample {

    public static void main(String[] args) {

    }
    public static List<Employee> loadEmployees(List<Employee> employees){

        return null;
    }

}

@Data
@Builder
class Employee {
    Long id;
    String name;
}
