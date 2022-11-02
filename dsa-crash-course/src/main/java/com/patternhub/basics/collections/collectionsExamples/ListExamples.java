package com.patternhub.basics.collections.collectionsExamples;

import java.util.ArrayList;

public class ListExamples {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(100);

        list.add(10);
        list.add("ravi");
        list.add("ssnaeeep");
        list.add("rakey");

        int count=0;
        for (Object i : list){

            String s = String.valueOf(i);
            if(s.startsWith("r")){
                count++;
            }
        }

        System.out.println(count);


        ///Generics


        ArrayList<String> names= new ArrayList<>();
        names.add("ravi");
        names.add("ravi");
        names.add("ravi");
        names.add("ravi");
        names.add("ravi");


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


        ArrayList<Employee> moreThan50K = new ArrayList<>();
        ArrayList<Employee> lessThan50K = new ArrayList<>();

        for (Employee e: employees){

            if(e.getSalary()> 50000){
                moreThan50K.add(e);
            }else{
                lessThan50K.add(e);
            }

        }

        System.out.println(moreThan50K.size());
        System.out.println(lessThan50K.size());





    }
}
