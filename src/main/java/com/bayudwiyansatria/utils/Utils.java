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
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bayudwiyansatria.utils;

import java.util.*;

public class Utils {
    public void warning(String error_message) {
        new com.bayudwiyansatria.mat.Mat().print(error_message);
        System.exit(1);
    }

    public String buildArgument( String[] array, String splitter){
        StringBuilder argument = new StringBuilder ( array[ 0 ] );
        for(int i=1; i<array.length; i++){
            argument.append ( splitter ).append ( array[ i ] );
        }
        return argument.toString ( );
    }

    public String buildDependencyArgument(String[][] dependency, String splitter){
        StringBuilder argument = new StringBuilder ( );
        for ( String[] strings : dependency ) {
            argument.append ( splitter ).append ( buildArgument ( strings , ":" ) );
        }
        return argument.substring(1);
    }

    public int[] getUnique(int[] data) {
        SortedSet<Integer> set = new TreeSet<>();
        int[] dataLabel = new int[data.length];
        for ( int datum : data ) {
            set.add ( datum );
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

    public String[] getUnique ( String[] data ) {
        String[] dataLabel = new String[data.length];
        SortedSet < String > set = new TreeSet <> ( Arrays.asList ( data ) );
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

        for(int i = 0; i < data.length; ++i){
            ok = false;
            byte bytes = -1;
            switch(opr.hashCode()) {
                case 60: if ("<".equals(opr)) { bytes = 1; } break;
                case 61: if ("=".equals(opr)) { bytes = 0; } break;
                case 62: if (">".equals(opr)) { bytes = 3; } break;
                case 1084: if ("!=".equals(opr)) { bytes = 5; } break;
                case 1921: if ("<=".equals(opr)) { bytes = 2;  } break;
                case 1983: if (">=".equals(opr)) { bytes = 4; }
            }

            switch(bytes) {
                case 0: if (data[i] == val) { ok = true;  } break;
                case 1: if (data[i] < val) { ok = true;  } break;
                case 2: if (data[i] <= val) { ok = true;  } break;
                case 3: if (data[i] > val) { ok = true;  } break;
                case 4: if (data[i] >= val) { ok = true;  } break;
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
                case 60: if ("<".equals(opr)) { bytes = 1; } break;
                case 61: if ("=".equals(opr)) { bytes = 0;} break;
                case 62: if (">".equals(opr)) { bytes = 3;} break;
                case 1084: if ("!=".equals(opr)) { bytes = 5; } break;
                case 1921: if ("<=".equals(opr)) { bytes = 2;} break;
                case 1983: if (">=".equals(opr)) { bytes = 4; }
            }

            switch(bytes) {
                case 0: if (data[i] == val) { ok = true; } break;
                case 1: if (data[i] < val) { ok = true; } break;
                case 2: if (data[i] <= val) { ok = true; } break;
                case 3: if (data[i] > val) { ok = true; } break;
                case 4: if (data[i] >= val) { ok = true; } break;
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

    public int[] double_to_int(double[] data) {
        int[] newData = new int[data.length];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = (int)data[i];
        }
        return newData;
    }

    public int[][] double_to_int(double[][] data) {
        int dimension = data[0].length;
        int[][] newData = new int[data.length][dimension];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < dimension; ++j) {
                newData[i][j] = (int)data[i][j];
            }
        }
        return newData;
    }

    public int[] string_to_int(String[] data) {
        int[] newData = new int[data.length];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = Integer.parseInt(data[i]);
        }
        return newData;
    }

    public int[][] string_to_int(String[][] data) {
        int[][] newData = new int[data.length][data[0].length];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[0].length; ++j) {
                newData[i][j] = Integer.parseInt(data[i][j]);
            }
        }
        return newData;
    }

    public double[] string_to_double(String[] data) {
        double[] newData = new double[data.length];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = Double.parseDouble(data[i]);
        }
        return newData;
    }

    public double[][] string_to_double(String[][] data) {
        double[][] newData = new double[data.length][data[0].length];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[0].length; ++j) {
                newData[i][j] = Double.parseDouble(data[i][j]);
            }
        }
        return newData;
    }

    public int[] string_to_categorical(String[] data){
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

    public int[][] string_to_categorical(String[][] data){
        String[][] transposeData = new com.bayudwiyansatria.mat.Mat().transposeMatrix(data);
        int[][] newData = new int[transposeData.length][transposeData[0].length];
        for(int i=0; i< transposeData.length; i++){
            newData[i] = string_to_categorical(transposeData[i]);
        }
        return newData;
    }
    
    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for ( byte aByte : bytes ) {
            int intVal = aByte & 0xff;
            if ( intVal < 0x10 ) sb.append ( "0" );
            sb.append ( Integer.toHexString ( intVal ).toUpperCase ( ) );
        }
        return sb.toString();
    }
    
    public String[][] list_to_String(ArrayList<String[]> data){
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