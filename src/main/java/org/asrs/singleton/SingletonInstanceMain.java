package org.asrs.singleton;

public class SingletonInstanceMain {
    public static void main(String[] args) {
        System.out.println(SingletonInstance.getInstance("Hi"));
        System.out.println(SingletonInstance.getInstance("Hello"));
    }
}
