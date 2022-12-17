package org.asrs;

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
        List<EmployeeObjectOnBuilderPattern> employeeObjectOnBuilderPatternList = new ArrayList<>();
        buildEmployeeList(employeeObjectOnBuilderPatternList);
        //Collections.sort(employeeList);
        //employeeList.sort(Comparator.naturalOrder());
        Comparator comparatorForEmployeeAddress = new ComparatorForEmployeeAddress();
        employeeObjectOnBuilderPatternList.sort(comparatorForEmployeeAddress);
        employeeObjectOnBuilderPatternList.forEach(System.out::println);
        System.out.println("\n");
        Comparator comparatorForEmployeeAge = new ComparatorForEmployeeAge();
        employeeObjectOnBuilderPatternList.sort(comparatorForEmployeeAge);
        employeeObjectOnBuilderPatternList.forEach(System.out::println);
        System.out.println("\n");

        EmployeeObjectOnBuilderPattern.EmployeeBuilder ex = EmployeeObjectOnBuilderPattern.builder(1, "MAna", "Bang", 234, 35)
                .sex("M");
        EmployeeObjectOnBuilderPattern employeeObjectOnBuilderPattern = ex.build();
        System.out.println(employeeObjectOnBuilderPattern);

        //Comparator<Employee> CompByName= Comparator.comparing(Employee::getName);
        //Comparator<Employee> CompByAge= Comparator.comparing(Employee::getAge);

        //Comparator<Employee> CompByAge= (Employee e1, Employee e2 ) -> Integer.compare(e1.getAge(),e2.getAge());

        //employeeList.sort(CompByName);
        //employeeList.sort(CompByAge);

        employeeObjectOnBuilderPatternList.forEach(System.out::println);

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

    private static void buildEmployeeList(List<EmployeeObjectOnBuilderPattern> employeeObjectOnBuilderPatternList) {

        employeeObjectOnBuilderPatternList.add(new EmployeeObjectOnBuilderPattern(1, "MAnazir", "Banglore", 917899, 39));
        employeeObjectOnBuilderPatternList.add(new EmployeeObjectOnBuilderPattern(3, "Raf", "US", 17199, 33));
        employeeObjectOnBuilderPatternList.add(new EmployeeObjectOnBuilderPattern(4, "Shifa", "Canada", 337899, 7));
        employeeObjectOnBuilderPatternList.add(new EmployeeObjectOnBuilderPattern(5, "Rida", "Austr", 437899, 5));
    }
}
