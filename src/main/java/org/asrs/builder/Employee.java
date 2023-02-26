package org.asrs.builder;

import lombok.Data;

import java.util.List;
@Data
//@Data
//@Builder
public class Employee {
    private final Integer id; //mandatory fields
    private final String name; //mandatory fields
    private final String address; //mandatory fields

    private final Integer age; //mandatory fields
    private final Integer phone; //mandatory fields

    private String sex; //optional

    private String manager;

    private List<Employee> reporting;

    private Employee(EmployeeBuilder employeeBuilder) {
        this.age = employeeBuilder.age;
        this.name = employeeBuilder.name;
        this.id = employeeBuilder.id;
        this.phone = employeeBuilder.phone;
        this.address = employeeBuilder.address;
        this.manager = employeeBuilder.manager;
        this.sex = employeeBuilder.sex;
        this.reporting = employeeBuilder.reporting;
    }

    public static EmployeeBuilder builder(int id, String name, String address, int phone, int age) {
        return new EmployeeBuilder(id, name, address, phone, age);
    }

    public Employee(int id, String name, String address, int phone, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }

    static class EmployeeBuilder {

        private final Integer id; //all final fields are mandatory
        private final String name;
        private final String address;
        private final Integer age;
        private final Integer phone;
        private String sex; //optional
        private String manager; //optional
        private List<Employee> reporting; //optional

        EmployeeBuilder(int id, String name, String address, int phone, int age) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.age = age;
            this.phone = phone;

        }

        public EmployeeBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public EmployeeBuilder manager(String manager) {
            this.manager = manager;
            return this;
        }

        public EmployeeBuilder reporting(List<Employee> reporting) {
            this.reporting = reporting;
            return this;
        }

        public Employee build() {
            Employee emp = new Employee(this);
            return emp;
        }
    }

}
