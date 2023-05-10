package com.fbs.util;

public class SaveVar {

    private static String name;
    private static String value;

    public SaveVar(){}

    public SaveVar(String name, String value){
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
