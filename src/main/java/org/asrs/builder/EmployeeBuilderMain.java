package org.asrs.builder;
import org.asrs.builder.Employee.EmployeeBuilder;

public class EmployeeBuilderMain {

    public static void main(String[] args) {

        EmployeeBuilder employeeBuilder = Employee.builder(1,"","",2,3)
                .manager("Abc")
                .sex("M")
                .reporting(null);

        Employee employeeObj = employeeBuilder.build();
        System.out.println(employeeObj.hashCode());
        System.out.println(employeeBuilder.build().hashCode());
    }
}
