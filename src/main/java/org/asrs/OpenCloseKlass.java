package org.asrs;

import java.security.InvalidParameterException;

public class OpenCloseKlass {

    public static void main(String[] args) {
        CalculateOperationI addition = new Addition(2, 3);
        Calculator.calculate(addition);
    }

}


interface CalculateOperationI {
    int perform();
}

class Addition implements CalculateOperationI {

    int x;
    int y;
    int result;

    Addition(int x, int y) {
        this.x = x;
        this.y =y;
    }

    @Override
    public int perform() {
        return x + y;
    }
}

class Subtraction implements CalculateOperationI {

    int x;
    int y;
    int result;
    Subtraction(int x, int y) {
        this.x = x;
        this.y =y;
    }
    @Override
    public int perform() {
        return x - y;
    }
}

class Calculator {
    public static int calculate(CalculateOperationI calculateOperationI) {
        if (calculateOperationI == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        return calculateOperationI.perform();
    }
}