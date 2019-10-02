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

import javax.lang.model.element.Element;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Utils {
    public void warning(String error_message) {
        new com.bayudwiyansatria.mat.Mat().print(error_message);
        System.exit(1);
    }

    public String buildArgument(String[] array, String splitter){
        String argument = array[0];
        for(int i=1; i<array.length; i++){
            argument = argument+""+splitter+""+array[i];
        }
        return argument;
    }

    public String buildDependencyArgument(String[][] dependency, String splitter){
        String argument = "";
        for(int i=0; i<dependency.length; i++){
            argument = argument+""+splitter+""+buildArgument(dependency[i],":");
        }
        return argument.substring(1);
    }

    public int[] getUnique(int[] data) {
        SortedSet<Integer> set = new TreeSet<>();
        int[] dataLabel = new int[data.length];
        for(int i = 0; i < data.length; ++i) {
            set.add(new Integer(data[i]));
        }
        Iterator<?> element = set.iterator();
        int i;
        for(i = 0; element.hasNext(); ++i) {
            Integer _tmp = (Integer)element.next();
            dataLabel[i] = _tmp;
        }
        int[] newData = new int[i];
        System.arraycopy(dataLabel, 0, newData, 0, i);
        return newData;
    }

    public String[] getUnique(String[] data) {
        SortedSet<String> set = new TreeSet<>();
        String[] dataLabel = new String[data.length];
        for(int i = 0; i < data.length; ++i) {
            set.add(new String(data[i]));
        }
        Iterator<?> element = set.iterator();
        int i;
        for(i = 0; element.hasNext(); ++i) {
            dataLabel[i] = (String)element.next();
        }
        String[] newData = new String[i];
        System.arraycopy(dataLabel, 0, newData, 0, i);
        return newData;
    }

    public int[] getFind(int[] data, String opr, int val) {
        int find = 0;
        int[] output = new int[0];
        boolean ok;

        for(int i = 0; i < data.length; ++i) {
            ok = false;
            byte bytes = -1;
            switch(opr.hashCode()) {
                case 60: if (opr.equals("<")) { bytes = 1; }
                case 61: if (opr.equals("=")) { bytes = 0; }
                case 62: if (opr.equals(">")) { bytes = 3; }
                case 1084: if (opr.equals("!=")) { bytes = 5; }
                case 1921: if (opr.equals("<=")) { bytes = 2; }
                case 1983: if (opr.equals(">=")) { bytes = 4; }
            }

            switch(bytes) {
                case 0: if (data[i] == val) { ok = true; }
                case 1: if (data[i] < val) { ok = true; }
                case 2: if (data[i] <= val) { ok = true; }
                case 3: if (data[i] > val) { ok = true; }
                case 4: if (data[i] >= val) { ok = true; }
                case 5: if (data[i] != val) { ok = true; }
            }

            if (ok) {
                if (find == 0) {
                    ++find;
                    output = new int[find];
                    output[0] = i;
                } else {
                    int[] tmp = output;
                    ++find;
                    output = new int[find];
                    System.arraycopy(tmp, 0, output, 0, find - 1);
                    output[find - 1] = i;
                }
            }
        }

        return output;
    }

    public int[] getFind(double[] data, String opr, double val) {
        int find = 0;
        int[] output = new int[0];
        boolean ok;

        for(int i = 0; i < data.length; ++i) {
            ok = false;
            byte bytes = -1;
            switch(opr.hashCode()) {
                case 60: if (opr.equals("<")) { bytes = 1; }
                case 61: if (opr.equals("=")) { bytes = 0; }
                case 62: if (opr.equals(">")) { bytes = 3; }
                case 1084: if (opr.equals("!=")) { bytes = 5; }
                case 1921: if (opr.equals("<=")) { bytes = 2; }
                case 1983: if (opr.equals(">=")) { bytes = 4; }
            }

            switch(bytes) {
                case 0: if (data[i] == val) { ok = true; }
                case 1: if (data[i] < val) { ok = true; }
                case 2: if (data[i] <= val) { ok = true; }
                case 3: if (data[i] > val) { ok = true; }
                case 4: if (data[i] >= val) { ok = true; }
                case 5: if (data[i] != val) { ok = true; }
            }

            if (ok) {
                if (find == 0) {
                    ++find;
                    output = new int[find];
                    output[0] = i;
                } else {
                    int[] tmp = output;
                    ++find;
                    output = new int[find];
                    System.arraycopy(tmp, 0, output, 0, find - 1);
                    output[find - 1] = i;
                }
            }
        }

        return output;
    }

    /* =========================================== Parse DataType Start ============================================= */

    public double[] int_to_double(int[] data) {
        double[] newData = new double[data.length];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = data[i];
        }
        return newData;
    }

    public double[][] int_to_double(int[][] data) {
        double[][] newData = new double[data.length][data[0].length];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[0].length; ++j) {
                newData[i][j] = data[i][j];
            }
        }
        return newData;
    }

    public List<Integer> int_to_list(int[][] data){
    	List<Integer> list = null;
    	for(int i=0; i<data.length; i++){
            for(int j = 0; j < data[0].length; ++j) {
	            list.add(data[i][j]);
            }
	    }
        return list;
    }

    public ArrayList<Integer> int_to_arraylist(int[][] data){
    	ArrayList<Integer> list = null;
    	for (int i=0; i<data.length; i++){
    		for(int j = 0; j < data[0].length; ++j) {
	            list.add(data[i][j]);
            }
	    }
    	return list;
    }

    public int[] double_to_int(double[] data) {
        int[] newData = new int[data.length];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = (int)data[i];
        }
        return newData;
    }

    public int[][] double_to_int(double[][] data) {
        int dimention = data[0].length;
        int[][] newData = new int[data.length][dimention];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < dimention; ++j) {
                newData[i][j] = (int)data[i][j];
            }
        }
        return newData;
    }

    public int[] String_to_int(String[] data) {
        int[] newData = new int[data.length];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = Integer.parseInt(data[i]);
        }
        return newData;
    }

    public int[][] String_to_int(String[][] data) {
        int[][] newData = new int[data.length][data[0].length];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[0].length; ++j) {
                newData[i][j] = Integer.parseInt(data[i][j]);
            }
        }
        return newData;
    }

    public double[] String_to_double(String[] data) {
        double[] newData = new double[data.length];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = Double.parseDouble(data[i]);
        }
        return newData;
    }

    public double[][] String_to_double(String[][] data) {
        double[][] newData = new double[data.length][data[0].length];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[0].length; ++j) {
                newData[i][j] = Double.parseDouble(data[i][j]);
            }
        }
        return newData;
    }

    public int[] String_to_categorical(String[] data){
        int[] newData = new int[data.length];
        String[] unique = getUnique(data);

        String[][] parsedData = new String[2][unique.length];
        for(int i =0; i<unique.length; i++){
            parsedData[0][i] = String.valueOf(i);
            parsedData[1][i] = unique[i];
        }

        for(int i=0; i<data.length; i++){
            for(int j=0; j<parsedData[1].length; j++){
                if(data[i].equals(parsedData[1][j])){
                    newData[i] = Integer.parseInt(parsedData[0][j]);
                }
            }
        }
        return newData;
    }

    public int[][] String_to_categorical(String[][] data){
        String[][] transposeData = new com.bayudwiyansatria.mat.Mat().transposeMatrix(data);
        int[][] newData = new int[transposeData.length][transposeData[0].length];
        for(int i=0; i< transposeData.length; i++){
            newData[i] = String_to_categorical(transposeData[i]);
        }
        return newData;
    }

    public List<String> String_to_list(String[][] data){
    	List<String> list = null;
    	for(int i=0; i<data.length; i++){
            for(int j = 0; j < data[0].length; ++j) {
	            list.add(data[i][j]);
            }
	    }
        return list;
    }

    public ArrayList<ArrayList<String>> String_to_arraylist(String[][] data){
    	ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(data.length);
    	for (int i=0; i<data.length; i++){
    	    ArrayList<String> sublist = new ArrayList<String>();
    		for(int j=0; i<data[0].length; i++){
    		    sublist.add(data[i][j]);
		    }
    	    list.add(sublist);
	    }
    	return list;
    }

    public List<ArrayList> Bytes_to_arraylist(ObjectInputStream data){
        List<ArrayList>newData = null;
        try {
            Object obj = data.readObject();
            while(obj != null){
                newData.add((ArrayList) newData);
            }
        } catch (Exception except){
            warning(except.toString());
        }
        return newData;
    }


    public String[][] List_to_String(ArrayList<String[]> data){
        String[][] newData  = new String[data.size()][data.get(0).length];
        for(int i=0; i<data.size();i++){
            for(int j=0; j<data.get(0).length; j++){
                newData[i][j] = data.get(i)[j];
            }
        }
        return newData;
    }

    /* =========================================== Parse DataType End ============================================= */
}
