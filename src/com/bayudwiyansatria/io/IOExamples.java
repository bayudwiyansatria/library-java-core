package com.bayudwiyansatria.io;

public class IOExamples {
    private static Files files = new Files();
    private static Array array = new Array();

    public static void main(String[] args){

        readCSV("/media/DEVOPS/applications/Research/Automatic-Clustering-Parallel-Library/res/ruspini");
    }

    public static void readFiles(String path){

    }

    public static void readCSV(String FileName){
        array.print(files.readCSV_String(FileName));
        System.out.println("Hello");

    }
}
