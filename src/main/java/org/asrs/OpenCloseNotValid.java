package org.asrs;

import lombok.Builder;
import lombok.Data;
import lombok.extern.java.Log;

import java.security.InvalidParameterException;

public class OpenCloseNotValid {

    public static void main(String[] args) {
        System.out.println("--------Open close NotValidISSUE---------");
    }

}

class Calculator2 {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        if (operation instanceof Addition2) {
            Addition2 addition = (Addition2) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction2) {
            Subtraction2 subtraction = (Subtraction2) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }
}

interface CalculatorOperation {}
@Data
class Addition2 implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    public Addition2(double left, double right) {
        this.left = left;
        this.right = right;
    }

    // getters and setters

}

@Data
class Subtraction2 implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    public Subtraction2(double left, double right) {
        this.left = left;
        this.right = right;
    }

    // getters and setters
}
