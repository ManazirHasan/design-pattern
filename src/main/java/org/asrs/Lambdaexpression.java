package org.asrs;

import org.asrs.builder.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Lambdaexpression {

    public static void main(String[] args) {
        System.out.println("Test");
        //lambdaOnStrList();
        lambdaOnEmployeeList();
        //System.out.println(null);
    }

    private static void lambdaOnEmployeeList() {
        List<Employee> EmployeeList = new ArrayList<>();
        buildEmployeeList(EmployeeList);
        //Collections.sort(employeeList);
        //employeeList.sort(Comparator.naturalOrder());
        Comparator comparatorForEmployeeAddress = new ComparatorForEmployeeAddress();
        EmployeeList.sort(comparatorForEmployeeAddress);
        EmployeeList.forEach(System.out::println);
        System.out.println("\n");
        Comparator comparatorForEmployeeAge = new ComparatorForEmployeeAge();
        EmployeeList.sort(comparatorForEmployeeAge);
        EmployeeList.forEach(System.out::println);
        System.out.println("\n");

     /*   Employee.EmployeeBuilder ex = Employee.builder(1, "MAna", "Bang", 234, 35)
                .sex("M");
        Employee Employee = ex.build();
        System.out.println(Employee);*/

        //Comparator<Employee> CompByName= Comparator.comparing(Employee::getName);
        //Comparator<Employee> CompByAge= Comparator.comparing(Employee::getAge);

        //Comparator<Employee> CompByAge= (Employee e1, Employee e2 ) -> Integer.compare(e1.getAge(),e2.getAge());

        //employeeList.sort(CompByName);
        //employeeList.sort(CompByAge);

        EmployeeList.forEach(System.out::println);

    }


    public static void lambdaOnStrList() {
        List<String> listStr = new ArrayList<>();
        extractedList(listStr);
        listStr.stream().forEach(System.out::print);
        System.out.println("\n");

        List<String> listStr2 = listStr.stream().sorted().collect(Collectors.toList());
        //or
        //listStr.sort(Comparator.naturalOrder());
        listStr2.stream().forEach(System.out::print);
        listStr2 = listStr2.stream().filter(x -> !x.contains("Bhoot")).collect(Collectors.toList());
        System.out.println("\n");
        //listStr2.stream().filter().forEach (System.out::print);

    }

    private static void extractedList(List<String> listStr) {
        listStr.add("Sara,");
        listStr.add("Manazir,");
        listStr.add("Shifa,");
        listStr.add("Azra,");
        listStr.add("Azra,");
        listStr.add("Rida,");
        listStr.add("Bhoot,");
        listStr.add("Bhoot,");
    }

    private static void buildEmployeeList(List<Employee> EmployeeList) {

        EmployeeList.add(new Employee(1, "MAnazir", "Banglore", 917899, 39));
        EmployeeList.add(new Employee(3, "Raf", "US", 17199, 33));
        EmployeeList.add(new Employee(4, "Shifa", "Canada", 337899, 7));
        EmployeeList.add(new Employee(5, "Rida", "Austr", 437899, 5));
    }
}
