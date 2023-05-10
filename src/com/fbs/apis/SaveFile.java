package com.fbs.apis;

import java.io.File;

public class SaveFile {

    private static File file;
    private static String filePath;

    public File getFile() {
        return file;
    }

    public String getFilePath() {
        return filePath;
    }



    public SaveFile(File file){
        this.file = file;
        this.filePath = file.getAbsolutePath();
    }

    public SaveFile(String filePath){
        file = new File(filePath);
        this.filePath = filePath;
    }



}
