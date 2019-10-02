/*
 * MIT License
 *
 * Copyright (c) 2019 Bayu Dwiyan Satria
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bayudwiyansatria.utils;

import java.util.ArrayList;
import java.util.List;

public class UtilsExamples {
    public static void main(String[] args){
        BuildArgument();
    }

    private static void Test_String2categorical_1D(){
        // Read Data
        String[][] data = new com.bayudwiyansatria.io.IO().readCSV_String("src/main/resources/ruspini");
        String[] dataTest = new String[data.length];

        for(int i=0; i<dataTest.length; i++){
            // Read Index 4 of Data
            dataTest[i]=data[i][3];
        }

        // Parse Data Type
        int[] categoricalData = new Utils().String_to_categorical(dataTest);
        new com.bayudwiyansatria.mat.Mat().print(categoricalData);
    }

    private static void Test_String2categorical_2D(){
        // Read Data
        String[][] data = new com.bayudwiyansatria.io.IO().readCSV_String("src/main/resources/ruspini");
        String[][] dataTest = new String[data.length][2];

        for(int i=0; i<dataTest.length; i++){
            // Read Index 4 of Data
            dataTest[i][0] = data[i][4];
            dataTest[i][1] = data[i][1];
        }
        // Parse Data Type
        int[][] categoricalData = new Utils().String_to_categorical(dataTest);
        new com.bayudwiyansatria.mat.Mat().print(categoricalData);
    }

    private static void Test_String2ArrayList(){
    	// Read Data
        String[][] data = new com.bayudwiyansatria.io.IO().readCSV_String("src/main/resources/ruspini");
        // Parse Data Type
        ArrayList<ArrayList<String>> categoricalData = new Utils().String_to_arraylist(data);
        System.out.println(categoricalData.get(1));
    }

    private static void BuildArgument(){
        String[][] array = { {"com.bayudwiyansatria","core","1.1.7"}, {"com.bayudwiyansatria","ml","1.0"}, {"com.bayudwiyansatria","env-apache-spark","1.0"}, {"com.bayudwiyansatria","env-apache-hadoop","1.0"} };
        String[] array1 = { "com.bayudwiyansatria", "core", "1.1.7" };
        new com.bayudwiyansatria.mat.Mat().print(new Utils().buildDependencyArgument(array,","));

    }
}
