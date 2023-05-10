package com.fbs.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineGetter {
    public String readFromLine(int lineId, String filePath){

        String returnString = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            System.out.println(line);
            int i = 0;
            while (reader.ready()) {
                System.out.println(i);
                line = reader.readLine();
                if (i == lineId){
                    returnString = line;
                    System.out.println("if access");
                    break;
                }
                i ++;
                if(i>50){
                    break;
                }
            }

            reader.close();
            return line;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("fdg");
        return returnString;
    }

    public String readFromLine(int lineId, File file){

        String returnString = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            int i = 0;
            while (reader.ready()) {
                line = reader.readLine();
                if (i == lineId){
                    returnString = line;
                    break;
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnString;
    }

}
