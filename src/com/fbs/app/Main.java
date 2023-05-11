package com.fbs.app;

import java.io.File;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) {
        SaveFileHandler saveFileHandler = new SaveFileHandler(new File("/home/vitaliy/test.txt"), '\"', '\"', '=', 1);
        System.out.println(saveFileHandler.getSaveVar().getName());
        System.out.println(saveFileHandler.getSaveVar().getValue());
    }
}