package org.asrs;

import org.asrs.builder.Employee;

import java.util.Comparator;

public class ComparatorForEmployeeAddress implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return CharSequence.compare(o1.getAddress(),o2.getAddress());

    }
}
