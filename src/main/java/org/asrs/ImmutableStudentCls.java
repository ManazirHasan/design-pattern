package org.asrs;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableStudentCls {

    //only getters method;
    private final String name;
    private final int regNo;

    private final List<String> list;

    public ImmutableStudentCls(String name, int regNo, List<String> list){
        this.name=name;
        this.regNo=regNo;
        //List list = new ArrayList();
        //don't jsut assign the refrences , itterate and assign in it.
        this.list = list; // not recommendation
    }

    //only getter methods and no setter method

    String getName(){
        return this.name;
    }
    int getRegNo(){
       return this.regNo;

    }



}
