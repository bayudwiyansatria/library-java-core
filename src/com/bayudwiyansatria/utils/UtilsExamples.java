package com.bayudwiyansatria.utils;

import com.bayudwiyansatria.mat.Array;
import com.bayudwiyansatria.io.Files;

public class UtilsExamples {
    public static void main(String[] args){
        Test_String2categorical_1D();
        Test_String2categorical_2D();
    }

    private static void Test_String2categorical_1D(){
        // Read Data
        String[][] data = new Files().readCSV_String("res/test/transaction");
        String[] dataTest = new String[data.length];

        for(int i=0; i<dataTest.length; i++){
            // Read Index 4 of Data
            dataTest[i]=data[i][4];
        }

        // Parse Data Type
        int[] categoricalData = new Utils().String_to_categorical(dataTest);
        new Array().print(categoricalData);
    }

    private static void Test_String2categorical_2D(){
        // Read Data
        String[][] data = new Files().readCSV_String("res/test/transaction");
        String[][] dataTest = new String[data.length][2];

        for(int i=0; i<dataTest.length; i++){
            // Read Index 4 of Data
            dataTest[i][0] = data[i][4];
            dataTest[i][1] = data[i][1];
        }
        // Parse Data Type
        int[][] categoricalData = new Utils().String_to_categorical(dataTest);
        new Array().print(categoricalData);
    }
}
