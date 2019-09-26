package com.bayudwiyansatria.utils;

import java.io.ObjectInputStream;
import java.util.*;

public class Utils {
    public void warning(String error_message) {
        new com.bayudwiyansatria.mat.Mat().print(error_message);
        System.exit(1);
    }

    String buildArgument(String[] Array, String Splitter){
        String argument = Array[0];
        for(int i=1; i<Array.length; i++){
            argument = argument+""+Splitter+""+Array[i];
        }
        return argument;
    }

    public int[] getUnique(int[] data) {
        SortedSet set = new TreeSet();
        int[] dataLabel = new int[data.length];
        for(int i = 0; i < data.length; ++i) {
            set.add(new Integer(data[i]));
        }
        Iterator element = set.iterator();
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
        SortedSet set = new TreeSet();
        String[] dataLabel = new String[data.length];
        for(int i = 0; i < data.length; ++i) {
            set.add(new String(data[i]));
        }
        Iterator element = set.iterator();
        int i;
        for(i = 0; element.hasNext(); ++i) {
            dataLabel[i] = (String)element.next();
        }
        String[] newData = new String[i];
        System.arraycopy(dataLabel, 0, newData, 0, i);
        return newData;
    }

    private int[] getFind(int[] data, int val) {
        int find = 0;
        int[] result = new int[0];

        for(int i = 0; i < data.length; ++i) {
            if (data[i] == val) {
                if (find == 0) {
                    ++find;
                    result = new int[find];
                    result[0] = i;
                } else {
                    int[] tmp = result;
                    ++find;
                    result = new int[find];
                    System.arraycopy(tmp, 0, result, 0, find - 1);
                    result[find - 1] = i;
                }
            }
        }

        return result;
    }

    public int[] getFind(int[] data, String opr, int val) {
        boolean bol = true;
        int find = 0;
        int[] result = new int[0];
        boolean ok = false;
        for(int i = 0; i < data.length; ++i) {
            ok = false;
            byte var11 = -1;
            switch(opr.hashCode()) {
                case 0:
                    if (opr.equals("<")) {
                        var11 = 1;
                    }
                    break;
                case 1:
                    if (opr.equals("=")) {
                        var11 = 0;
                    }
                    break;
                case 2:
                    if (opr.equals(">")) {
                        var11 = 3;
                    }
                    break;
                case 3:
                    if (opr.equals("!=")) {
                        var11 = 5;
                    }
                    break;
                case 4:
                    if (opr.equals("<=")) {
                        var11 = 2;
                    }
                    break;
                case 5:
                    if (opr.equals(">=")) {
                        var11 = 4;
                    }
            }

            switch(var11) {
                case 0:
                    if (data[i] == val) {
                        ok = true;
                    }
                    break;
                case 1:
                    if (data[i] < val) {
                        ok = true;
                    }
                    break;
                case 2:
                    if (data[i] <= val) {
                        ok = true;
                    }
                    break;
                case 3:
                    if (data[i] > val) {
                        ok = true;
                    }
                    break;
                case 4:
                    if (data[i] >= val) {
                        ok = true;
                    }
                    break;
                case 5:
                    if (data[i] != val) {
                        ok = true;
                    }
            }
            if (ok) {
                if (find == 0) {
                    ++find;
                    result = new int[find];
                    result[0] = i;
                } else {
                    int[] tmp = result;
                    ++find;
                    result = new int[find];
                    System.arraycopy(tmp, 0, result, 0, find - 1);
                    result[find - 1] = i;
                }
            }
        }
        return result;
    }

    public int[] getFind(double[] data, String opr, double val) {
        boolean bol = true;
        int find = 0;
        int[] result = new int[0];
        boolean ok;

        for(int i = 0; i < data.length; ++i) {
            ok = false;
            byte bytes = -1;
            switch(opr.hashCode()) {
                case 0:
                    if (opr.equals("<")) {
                        bytes = 1;
                    }
                    break;
                case 1:
                    if (opr.equals("=")) {
                        bytes = 0;
                    }
                    break;
                case 2:
                    if (opr.equals(">")) {
                        bytes = 3;
                    }
                    break;
                case 3:
                    if (opr.equals("!=")) {
                        bytes = 5;
                    }
                    break;
                case 4:
                    if (opr.equals("<=")) {
                        bytes = 2;
                    }
                    break;
                case 5:
                    if (opr.equals(">=")) {
                        bytes = 4;
                    }
            }

            switch(bytes) {
                case 0:
                    if (data[i] == val) {
                        ok = true;
                    }
                    break;
                case 1:
                    if (data[i] < val) {
                        ok = true;
                    }
                    break;
                case 2:
                    if (data[i] <= val) {
                        ok = true;
                    }
                    break;
                case 3:
                    if (data[i] > val) {
                        ok = true;
                    }
                    break;
                case 4:
                    if (data[i] >= val) {
                        ok = true;
                    }
                    break;
                case 5:
                    if (data[i] != val) {
                        ok = true;
                    }
            }

            if (ok) {
                if (find == 0) {
                    ++find;
                    result = new int[find];
                    result[0] = i;
                } else {
                    int[] tmp = result;
                    ++find;
                    result = new int[find];
                    System.arraycopy(tmp, 0, result, 0, find - 1);
                    result[find - 1] = i;
                }
            }
        }
        return result;
    }

    /* =========================================== Parse DataType Start ============================================= */

    public double[] int_to_double(int[] data) {
        double[] newData = new double[data.length];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = (double)data[i];
        }
        return newData;
    }

    public double[][] int_to_double(int[][] data) {
        double[][] newData = new double[data.length][data[0].length];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[0].length; ++j) {
                newData[i][j] = (double)data[i][j];
            }
        }
        return newData;
    }

    public int[] double_to_int(double[] data) {
        int[] newData = new int[data.length];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = (int)data[i];
        }
        return newData;
    }

    public int[][] double_to_int(double[][] data) {
        int _dimensi = data[0].length;
        int[][] newData = new int[data.length][_dimensi];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < _dimensi; ++j) {
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

    public List String_to_List(String[] data){
        List newData = null;
        return newData;

    }

    public List String_to_List(String[][] data){
        List newData = null;
        return newData;
    }

    /* =========================================== Parse DataType End ============================================= */
}
