package com.fbs.util;

public class SaveVar {

    private static String name;
    private static String value;

    public void setName(String name) {
        SaveVar.name = name;
    }

    public void setValue(String value) {
        SaveVar.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
