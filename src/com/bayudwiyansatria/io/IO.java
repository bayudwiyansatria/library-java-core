package com.bayudwiyansatria.io;

import java.io.File;

public class IO extends Files {
    public void readDirectory() {
        File folder = new File("lib/");
        File[] listOfFiles = folder.listFiles();
        String[] jars = new String[0];
        if (listOfFiles != null) {
            jars = new String[listOfFiles.length];
        }
        if (listOfFiles != null) {
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    System.out.println("File " + listOfFiles[i].getName());
                    jars[i] = "lib/" + listOfFiles[i].getName();
                } else if (listOfFiles[i].isDirectory()) {
                    System.out.println("Directory " + listOfFiles[i].getName());
                }
            }
        }
    }
}
