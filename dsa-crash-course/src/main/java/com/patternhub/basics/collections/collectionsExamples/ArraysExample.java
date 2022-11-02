package com.patternhub.basics.collections.collectionsExamples;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExample {


    public static void main(String[] args) {

//        int[] array= new int[10];
//
////        array[0] = 1;
////        array[1] = 2;
//
//        for (int j = 0; j <= array.length-1; j++) {
//
//            array[j] = j+1;
//
//        }
//
//
//        for (int a : array) {
//            System.out.println(a);
//
//        }
//
//
//        String[] names = {"ravi","sandeep","ram","venkat"};
//
//        int count =0;
//
//        for (String name :names){
//            if(name.startsWith("r")){
//                count++;
//            }
//        }
//
//        System.out.println("total names starts with R "+ count);

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


        Employee[] employees= new Employee[10];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;
        employees[5] = e6;
        employees[6] = e7;
        employees[7] = e8;
        employees[8] = e9;
        employees[9] = e10;
//
//        int count=0;
//        for (Employee e: employees){
//           if(e.getSalary()>50000){
//               count++;
//           }
//        }
//        System.out.println("Employees with > 50k "+ count);

       Comparator<Employee> employeeComparator= new Comparator<Employee>() {
           @Override
           public int compare(Employee o1, Employee o2) {
               return (int) (o1.getSalary()-o2.getSalary());
           }
       };

        Arrays.sort(employees,employeeComparator);

        for(Employee e: employees){
            System.out.println(e);
        }

//
//        int[] numbers= {1,5,7,4,9,20,703,5,10};
//
//        Arrays.sort(numbers);
//
//        for(int i: numbers){
//            System.out.println(i);
//        }







//        Employee[] moreThan50KSalaries = new Employee[employees.length];
//        Employee[] lessThan50KSalaries = new Employee[employees.length];
//
//        for (int i=0 ; i<= employees.length-1; i++){
//            Employee e= employees[i];
//           if(e.getSalary() > 50000){
//               moreThan50KSalaries[i] = e;
//           }else{
//               lessThan50KSalaries[i] = e;
//           }
//        }
//
//        for (Employee e: moreThan50KSalaries){
//            System.out.println(e);
//        }
//
//
//        System.out.println("------------->");
//
//        for (Employee e: lessThan50KSalaries){
//            System.out.println(e);
//        }





//        for (int i = 0; i < employees.length-1; i++) {
//
//            employees[i] = e1;
//
//        }








    }
}
