package org.asrs;

import java.util.Comparator;

public class ComparatorForEmployeeAddress implements Comparator<EmployeeObjectOnBuilderPattern> {
    @Override
    public int compare(EmployeeObjectOnBuilderPattern o1, EmployeeObjectOnBuilderPattern o2) {
        return CharSequence.compare(o1.getAddress(),o2.getAddress());

    }
}
