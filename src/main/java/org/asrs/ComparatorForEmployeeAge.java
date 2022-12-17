package org.asrs;

import java.util.Comparator;

public class ComparatorForEmployeeAge implements Comparator<EmployeeObjectOnBuilderPattern> {
    @Override
    public int compare(EmployeeObjectOnBuilderPattern o1, EmployeeObjectOnBuilderPattern o2) {
        return Integer.compare(o1.getAge(),o2.getAge());

    }
}
