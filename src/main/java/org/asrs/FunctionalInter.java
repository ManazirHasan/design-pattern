package org.asrs;

import lombok.Builder;

import java.lang.annotation.Annotation;

@FunctionalInterface
public interface FunctionalInter {

    void m();
    //void eq();

}

class Test implements FunctionalInter{


    @Override
    public void m() {
        System.out.println("Testing functional interface");
    }

    public static void main(String[] args) {
        System.out.println("Checking ");
    }
}
