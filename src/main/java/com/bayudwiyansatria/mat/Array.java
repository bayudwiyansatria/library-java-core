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

package com.bayudwiyansatria.mat;

import java.util.*;

public class Array extends Vector {

    /* ======================================= Array Get Dimension Start =============================================*/

    public int[] getRow(int[][] data, int row) {
        int[] rowData = new int[data[0].length];
        try {
            System.arraycopy(data[row], 0, rowData, 0, data[0].length);
        } catch (Exception e) {
            System.out.println("Row is not correct!");
        }
        return rowData;
    }

    public double[] getRow(double[][] data, int row) {
        double[] rowData = new double[data[0].length];
        try {
            System.arraycopy(data[row], 0, rowData, 0, data[0].length);
        } catch (Exception e) {
            System.out.println("Row is not correct!");
        }
        return rowData;
    }

    public int[] getRow(int[] data, int startRow, int endRow) {
        int[] rowData = new int[endRow - startRow + 1];
        try {
            if (endRow + 1 - ~(0 - (int) (1L + (long) startRow)) >= 0)
                System.arraycopy(data, ~(0 - (int) (1L + (long) startRow)), rowData, ~(0 - (int) (1L + (long) startRow)) - startRow, endRow + 1 - ~(0 - (int) (1L + (long) startRow)));
        } catch (Exception e) {
            System.out.println("Row is not correct!");
        }
        return rowData;
    }

    public double[] getRow(double[] data, int startRow, int endRow) {
        double[] rowData = new double[endRow - startRow + 1];
        try {
            if (endRow + 1 - ~(0 - (int) (1L + (long) startRow)) >= 0)
                System.arraycopy(data, ~(0 - (int) (1L + (long) startRow)), rowData, ~(0 - (int) (1L + (long) startRow)) - startRow, endRow + 1 - ~(0 - (int) (1L + (long) startRow)));
        } catch (Exception e) {
            System.out.println("Row is not correct!");
        }
        return rowData;
    }

    public int[][] getRow(int[][] data, int startRow, int endRow) {
        int[][] rowData = new int[endRow - startRow + 1][data[0].length];
        try {
            for(int i = ~(0 - (int)(1L + (long)startRow)); i <= endRow; ++i) {
                System.arraycopy(data[i], 0, rowData[i - startRow], 0, data[0].length);
            }
        } catch (Exception var8) {
            System.out.println("Row is not correct!");
        }
        return rowData;
    }

    public double[][] getRow(double[][] data, int startRow, int endRow) {
        double[][] rowData = new double[endRow - startRow + 1][data[0].length];
        try {
            for(int i = ~(0 - (int)(1L + (long)startRow)); i <= endRow; ++i) {
                for(int j = 0; i < data[0].length; ++i) {
                    rowData[i - startRow][i] = data[i][j];
                }
            }
        } catch (Exception var9) {
            System.out.println("Row is not correct!");
        }
        return rowData;
    }

    public int[] getCol(int[][] data, int col) {
        int[] colData = new int[data.length];
        try {
            for(int i = 0; i < data.length; ++i) {
                colData[i] = data[i][col];
            }
        } catch (Exception e) {
            System.out.println("Column is not correct!");
        }
        return colData;
    }

    public double[] getCol(double[][] data, int col) {
        double[] colData = new double[data.length];
        try {
            for(int i = 0; i < data.length; ++i) {
                colData[i] = data[i][col];
            }
        } catch (Exception e) {
            System.out.println("Column is not correct!");
        }
        return colData;
    }

    public int[] getCol(int[] data, int startColumn, int endColumn) {
        int[] colData = new int[endColumn - startColumn + 1];
        try {
            if (endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)) >= 0)
                System.arraycopy(data, ~(0 - (int) (1L + (long) startColumn)), colData, ~(0 - (int) (1L + (long) startColumn)) - startColumn, endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)));
        } catch (Exception e) {
            System.out.println("Row is not correct!");
        }

        return colData;
    }

    public double[] getCol(double[] data, int startColumn, int endColumn) {
        double[] colData = new double[endColumn - startColumn + 1];

        try {
            if (endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)) >= 0)
                System.arraycopy(data, ~(0 - (int) (1L + (long) startColumn)), colData, ~(0 - (int) (1L + (long) startColumn)) - startColumn, endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)));
        } catch (Exception e) {
            System.out.println("Row is not correct!");
        }
        return colData;
    }

    public int[][] getCol(int[][] data, int startColumn, int endColumn) {
        int[][] colData = new int[data.length][endColumn - startColumn + 1];
        try {
            for(int i = 0; i < data.length; ++i) {
                if (endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)) >= 0)
                    System.arraycopy(data[i], ~(0 - (int) (1L + (long) startColumn)), colData[i], ~(0 - (int) (1L + (long) startColumn)) - startColumn, endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)));
            }
        } catch (Exception var9) {
            System.out.println("Column is not correct!");
        }
        return colData;
    }

    public double[][] getCol(double[][] data, int startColumn, int endColumn) {
        double[][] colData = new double[data.length][endColumn - startColumn + 1];
        try {
            for(int i = 0; i < data.length; ++i) {
                if (endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)) >= 0)
                    System.arraycopy(data[i], ~(0 - (int) (1L + (long) startColumn)), colData[i], ~(0 - (int) (1L + (long) startColumn)) - startColumn, endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)));
            }
        } catch (Exception var9) {
            System.out.println("Column is not correct!");
        }
        return colData;
    }

    public int[][] getRowCol(int[][] data, int startRow, int endRow, int startColumn, int endColumn) {
        int[][] colData = new int[endRow - startRow + 1][endColumn - startColumn + 1];
        try {
            for(int i = ~(0 - (int)(1L + (long)startRow)); i <= endRow; ++i) {
                if (endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)) >= 0)
                    System.arraycopy(data[i], ~(0 - (int) (1L + (long) startColumn)), colData[i - startRow], ~(0 - (int) (1L + (long) startColumn)) - startColumn, endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)));
            }
        } catch (Exception var11) {
            System.out.println("Row is not correct!");
        }
        return colData;
    }

    public double[][] getRowCol(double[][] data, int startRow, int endRow, int startColumn, int endColumn) {
        double[][] colData = new double[endRow - startRow + 1][endColumn - startColumn + 1];
        try {
            for(int i = ~(0 - (int)(1L + (long)startRow)); i <= endRow; ++i) {
                if (endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)) >= 0)
                    System.arraycopy(data[i], ~(0 - (int) (1L + (long) startColumn)), colData[i - startRow], ~(0 - (int) (1L + (long) startColumn)) - startColumn, endColumn + 1 - ~(0 - (int) (1L + (long) startColumn)));
            }
        } catch (Exception var11) {
            System.out.println("Row is not correct!");
        }
        return colData;
    }

    /* ======================================= Array Get Dimension End ===============================================*/

    /* ======================================= Array Sort Start ======================================================*/

    public int[][] sortData(int[] data) {
        return this.sortData(data, "asc");
    }

    public double[][] sortData(double[] data) {
        return this.sortData(data, "asc");
    }

    public int[][] sortData(int[] data, String mode) {
        return new com.bayudwiyansatria.utils.Utils().double_to_int(sortData(new com.bayudwiyansatria.utils.Utils().int_to_double(data)));
    }

    public double[][] sortData(double[] data, String mode) {
        double[][] output = new double[2][data.length];
        String dataSort = mode.toLowerCase();
        double[] ar = this.copyArray(data);
        Arrays.sort(ar);
        Map<Integer, Double> map = new HashMap<>();
        for(int i = 0; i < data.length; ++i) {
            map.put(i, data[i]);
        }
        Map<Integer, Double> sortedMap = sortByComparator(map);
        int p;
        Iterator<?> iterator;
        Map.Entry<?,?> entry;
        if (dataSort.equals("asc")) {
            p = 0;
            for(iterator = sortedMap.entrySet().iterator(); iterator.hasNext(); ++p) {
                entry = (Map.Entry<?,?>)iterator.next();
                output[1][p] = (double)(Integer)entry.getKey();
                output[0][p] = (Double)entry.getValue();
            }
        } else if (dataSort.equals("desc")) {
            p = data.length - 1;
            for(iterator = sortedMap.entrySet().iterator(); iterator.hasNext(); --p) {
                entry = (Map.Entry<?,?>)iterator.next();
                output[1][p] = (double)(Integer)entry.getKey();
                output[0][p] = (Double)entry.getValue();
            }
        } else {
            System.out.println("Mode incorrect");
        }
        return output;
    }

    public static Map<Integer,Double> sortByComparator(Map<Integer, Double> unsortMap) {
        List<Map.Entry<Integer, Double>> list = new LinkedList<Map.Entry<Integer, Double>>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() { public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) { return (o1.getValue()).compareTo(o2.getValue());}});
        Map<Integer, Double> sortedMap = new LinkedHashMap<Integer, Double>();
        for (Map.Entry<Integer, Double> entry : list) { sortedMap.put(entry.getKey(), entry.getValue());}
        return sortedMap;
    }

    /* ======================================= Array Sort End ========================================================*/

    /* ======================================= Array Merger Start ====================================================*/

    public int[] mergeArray(int[] data1, int[] data2) {
        int[] newArray = this.initArray(data1.length + data2.length, 0);

        for(int i = 0; i < data1.length; ++i) {
            newArray[i] = data1[i];
        }

        for(int i = 0; i < data2.length; ++i) {
            newArray[data1.length + i] = data2[i];
        }

        return newArray;
    }

    public double[] mergeArray(double[] data1, double[] data2) {
        double[] newArray = this.initArray(data1.length + data2.length, 0.0);

        for(int i = 0; i < data1.length; ++i) {
            newArray[i] = data1[i];
        }

        for(int i = 0; i < data2.length; ++i) {
            newArray[data1.length + i] = data2[i];
        }

        return newArray;
    }

    public int[][] mergeArrayRow(int[] data1, int[] data2) {
        int[][] newArray = this.initArray(2, data1.length, 0);
        if (data1.length != data2.length) {
            System.out.println("length of both data has to be same!");
        }

        for(int i = 0; i < data1.length; ++i) {
            newArray[0][i] = data1[i];
            newArray[1][i] = data2[i];
        }

        return newArray;
    }

    public double[][] mergeArrayRow(double[] data1, double[] data2) {
        double[][] newArray = this.initArray(2, data1.length, 0.0);
        if (data1.length != data2.length) {
            System.out.println("length of both data has to be same!");
        }

        for(int i = 0; i < data1.length; ++i) {
            newArray[0][i] = data1[i];
            newArray[1][i] = data2[i];
        }

        return newArray;
    }

    public int[][] mergeArrayColumn(int[] data1, int[] data2) {
        int[][] newArray = this.initArray(data1.length, 2, 0);
        if (data1.length != data2.length) {
            System.out.println("length of both data has to be same!");
        }

        for(int i = 0; i < data1.length; ++i) {
            newArray[i][0] = data1[i];
            newArray[i][1] = data2[i];
        }

        return newArray;
    }

    public double[][] mergeArrayColumn(double[] data1, double[] data2) {
        double[][] newArray = this.initArray(data1.length, 2, 0.0);
        if (data1.length != data2.length) {
            System.out.println("length of both data has to be same!");
        }

        for(int i = 0; i < data1.length; ++i) {
            newArray[i][0] = data1[i];
            newArray[i][1] = data2[i];
        }

        return newArray;
    }

    public int[][] mergeArrayRow(int[] data1, int[][] data2) {
        int dimension = data2[0].length;
        int[][] newArray = null;
        if (dimension == data1.length) {
            newArray = this.initArray(data2.length + 1, dimension, 0);

            int i;
            for(i = 0; i < dimension; ++i) {
                newArray[0][i] = data1[i];
            }

            for(int j = 1; j <= data2.length; ++j) {
                for(i = 0; i < dimension; ++i) {
                    newArray[j][i] = data2[j][i];
                }
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return newArray;
    }

    public double[][] mergeArrayRow(double[] data1, double[][] data2) {
        int dimension = data2[0].length;
        double[][] newArray = null;
        if (dimension == data1.length) {
            newArray = this.initArray(data2.length + 1, dimension, 0.0);

            int i;
            for(i = 0; i < dimension; ++i) {
                newArray[0][i] = data1[i];
            }

            for(int j = 1; j <= data2.length; ++j) {
                for(i = 0; i < dimension; ++i) {
                    newArray[j][i] = data2[j][i];
                }
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return newArray;
    }

    public int[][] mergeArrayColumn(int[] data1, int[][] data2) {
        int dimension = data2[0].length;
        int[][] newArray = null;
        if (data1.length == data2.length) {
            newArray = this.initArray(data1.length, dimension + 1, 0);

            for(int i = 0; i < data1.length; ++i) {
                newArray[data2.length][0] = data1[i];

                for(int j = 1; j <= dimension; ++j) {
                    newArray[i][j] = data2[i][j];
                }
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return newArray;
    }

    public double[][] mergeArrayColumn(double[] data1, double[][] data2) {
        int dimension = data2[0].length;
        double[][] newArray = null;
        if (data1.length == data2.length) {
            newArray = this.initArray(data1.length, dimension + 1, 0.0);

            for(int i = 0; i < data1.length; ++i) {
                newArray[data2.length][0] = data1[i];

                for(int j = 1; j <= dimension; ++j) {
                    newArray[i][j] = data2[i][j];
                }
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return newArray;
    }

    public int[][] mergeArrayRow(int[][] data1, int[] data2) {
        int[][] newArray = null;
        if (data1[0].length == data2.length) {
            newArray = this.initArray(data1.length + 1, data1[0].length, 0);

            int i;
            for(int j = 0; j < data1.length; ++j) {
                for(i = 0; i < data1[0].length; ++i) {
                    newArray[j][i] = data1[j][i];
                }
            }

            for(i = 0; i < data1[0].length; ++i) {
                newArray[data1.length][i] = data2[i];
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return newArray;
    }

    public double[][] mergeArrayRow(double[][] data1, double[] data2) {
        double[][] newArray = null;
        if (data1[0].length == data2.length) {
            newArray = this.initArray(data1.length + 1, data1[0].length, 0.0);

            int i;
            for(int j = 0; j < data1.length; ++j) {
                for(i = 0; i < data1[0].length; ++i) {
                    newArray[j][i] = data1[j][i];
                }
            }

            for(i = 0; i < data1[0].length; ++i) {
                newArray[data1.length][i] = data2[i];
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return newArray;
    }

    public int[][] mergeArrayColumn(int[][] data1, int[] data2) {
        int[][] newArray = null;
        if (data1.length == data2.length) {
            newArray = this.initArray(data1.length, data1[0].length + 1, 0);

            for(int i = 0; i < data1.length; ++i) {
                for(int j = 0; j < data1[0].length; ++j) {
                    newArray[i][j] = data1[i][j];
                }

                newArray[data1.length][data1[0].length] = data2[i];
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return newArray;
    }

    public double[][] mergeArrayColumn(double[][] data1, double[] data2) {
        double[][] newArray = null;
        if (data1.length == data2.length) {
            newArray = this.initArray(data1.length, data1[0].length + 1, 0.0);

            for(int i = 0; i < data1.length; ++i) {
                for(int j = 0; j < data1[0].length; ++j) {
                    newArray[i][j] = data1[i][j];
                }

                newArray[i][data1[0].length] = data2[i];
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return newArray;
    }

    public int[][] mergeArrayRow(int[][] data1, int[][] data2) {
        int dimension = data2[0].length;
        int[][] newArray = this.initArray(data1.length + data2.length, data1[0].length, 0);
        if (data1[0].length != dimension) {
            System.out.println("Cols of both data has to be same!");
        }

        for(int i = 0; i < data1[0].length; ++i) {
            int j;
            for(j = 0; j < data1.length; ++j) {
                newArray[j][i] = data1[j][i];
            }

            for(j = 0; j < data2.length; ++j) {
                newArray[data1.length + j][i] = data2[j][i];
            }
        }

        return newArray;
    }

    public double[][] mergeArrayRow(double[][] data1, double[][] data2) {
        double[][] newArray = this.initArray(data1.length + data2.length, data1[0].length, 0.0);
        if (data1[0].length != data1[0].length) {
            System.out.println("Cols of both data has to be same!");
        }
        for(int i = 0; i < data1[0].length; ++i) {
            int j;
            for(j = 0; j < data1.length; ++j) {
                newArray[j][i] = data1[j][i];
            }
            for(j = 0; j < data2.length; ++j) {
                newArray[data1.length + j][i] = data2[j][i];
            }
        }
        return newArray;
    }

    public int[][] mergeArrayColumn(int[][] data1, int[][] data2) {
        int dimension = data2[0].length;
        int[][] newArray = this.initArray(data1.length, data1[0].length + dimension, 0);
        if (data1.length != data2.length) {
            System.out.println("Rows of both data has to be same!");
        }
        for(int i = 0; i < data1.length; ++i) {
            int j;
            for(j = 0; j < data1[0].length; ++j) {
                newArray[i][j] = data1[i][j];
            }
            for(j = 0; j < dimension; ++j) {
                newArray[i][data1[0].length + j] = data2[i][j];
            }
        }

        return newArray;
    }

    public double[][] mergeArrayColumn(double[][] data1, double[][] data2) {
        int dimension = data2[0].length;
        double[][] newArray = this.initArray(data1.length, data1[0].length + dimension, 0.0);
        if (data1.length != data2.length) {
            System.out.println("Rows of both data has to be same!");
        }
        for(int i = 0; i < data1.length; ++i) {
            int j;
            for(j = 0; j < data1[0].length; ++j) {
                newArray[i][j] = data1[i][j];
            }

            for(j = 0; j < dimension; ++j) {
                newArray[i][data1[0].length + j] = data2[i][j];
            }
        }
        return newArray;
    }

    /* ======================================= Array Merger End ======================================================*/

    /* ======================================= Array Copy Start ======================================================*/

    public int[] copyArray(int[] data) {
        int[] newArray = new int[data.length];
        System.arraycopy(data, 0, newArray, 0, data.length);
        return newArray;
    }

    public double[] copyArray(double[] data) {
        double[] newArray = new double[data.length];
        System.arraycopy(data, 0, newArray, 0, data.length);
        return newArray;
    }

    public String[] copyArray(String[] data) {
        String[] newArray = new String[data.length];
        System.arraycopy(data, 0, newArray, 0, data.length);
        return newArray;
    }

    public int[][] copyArray(int[][] data) {
        int[][] newArray = new int[data.length][];

        for(int i = 0; i < data.length; ++i) {
            int dimension = data[i].length;
            newArray[i] = new int[dimension];
            System.arraycopy(data[i], 0, newArray[i], 0, dimension);
        }

        return newArray;
    }

    public double[][] copyArray(double[][] data) {
        double[][] newArray = new double[data.length][];

        for(int i = 0; i < data.length; ++i) {
            int dimension = data[i].length;
            newArray[i] = new double[dimension];
            System.arraycopy(data[i], 0, newArray[i], 0, dimension);
        }

        return newArray;
    }

    public String[][] copyArray(String[][] data) {
        String[][] newArray = new String[data.length][];

        for(int i = 0; i < data.length; ++i) {
            int dimension = data[i].length;
            newArray[i] = new String[dimension];
            System.arraycopy(data[i], 0, newArray[i], 0, dimension);
        }

        return newArray;
    }

    /* ======================================= Array Copy End ========================================================*/

    /* ======================================= Array Init Start ======================================================*/

    public int[] initArray(int length, int init_value) {
        int[] newArray = null;
        if (length > 1) {
            newArray = new int[length];

            for(int i = 0; i < length; ++i) {
                newArray[i] = init_value;
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public double[] initArray(int length, double init_value) {
        double[] newArray = null;
        if (length > 0) {
            newArray = new double[length];

            for(int i = 0; i < length; ++i) {
                newArray[i] = init_value;
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public int[][] initArray(int rows, int cols, int init_value) {
        int[][] newArray = null;
        if (rows > 0 && cols > 0) {
            newArray = new int[rows][cols];

            for(int i = 0; i < rows; ++i) {
                for(int j = 0; j < cols; ++j) {
                    newArray[i][j] = init_value;
                }
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public double[][] initArray(int rows, int cols, double init_value) {
        double[][] newArray = null;
        if (rows > 0 && cols > 0) {
            newArray = new double[rows][cols];

            for(int i = 0; i < rows; ++i) {
                for(int j = 0; j < cols; ++j) {
                    newArray[i][j] = init_value;
                }
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public int[] initArrayRandom(int length, int min, int max) {
        int[] newArray = null;
        if (length > 0) {
            newArray = new int[length];

            for(int i = 0; i < length; ++i) {
                newArray[i] = new com.bayudwiyansatria.math.Math().getRandom(min, max);
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public double[] initArrayRandom(int length, double min, double max) {
        double[] newArray = null;
        if (length > 0) {
            newArray = new double[length];

            for(int i = 0; i < length; ++i) {
                newArray[i] = new com.bayudwiyansatria.math.Math().getRandom(min, max);
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public int[][] initArrayRandom(int rows, int cols, int min, int max) {
        int[][] newArray = null;
        if (rows > 0 && cols > 0) {
            newArray = new int[rows][cols];
            for(int i = 0; i < rows; ++i) {
                for(int j = 0; j < cols; ++j) {
                    newArray[i][j] = new com.bayudwiyansatria.math.Math().getRandom(min, max);
                }
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public double[][] initArrayRandom(int rows, int cols, double min, double max) {
        double[][] newArray = null;
        if (rows > 0 && cols > 0) {
            newArray = new double[rows][cols];

            for(int i = 0; i < rows; ++i) {
                for(int j = 0; j < cols; ++j) {
                    newArray[i][j] = new com.bayudwiyansatria.math.Math().getRandom(min, max);
                }
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public int[][] initArrayUniform(int dimension) {
        int[][] center = new int[][]{{25, 25}, {50, 25}, {75, 25}, {25, 50}, {50, 50}, {75, 50}, {25, 75}, {50, 75}, {75, 75}};
        List<Integer> list_x = new ArrayList<>();
        List<Integer> list_y = new ArrayList<>();

        int j;
        for (int[] ints : center) {
            int r = new com.bayudwiyansatria.math.Math().getRandom(1, 10);
            if (r > 5) {
                int x = ints[0];
                int y = ints[1];

                for (j = 0; j < 20; ++j) {
                    list_x.add(new com.bayudwiyansatria.math.Math().getRandom(x - dimension, x + dimension));
                    list_y.add(new com.bayudwiyansatria.math.Math().getRandom(y - dimension, y + dimension));
                }
            }
        }

        int[][] newArray = new int[list_x.size()][2];

        for(j = 0; j < list_x.size(); ++j) {
            newArray[j][0] = list_x.get(j);
            newArray[j][1] = list_y.get(j);
        }

        return newArray;
    }

    /* ======================================= Array Init End ========================================================*/

    /* ======================================= Array Create Start ====================================================*/

    public int[] makeArray_1D_int(String data) {
        data = data.replace(" ", "");
        String tmp = this.cleanArrIn(data);
        String[] split = tmp.split(",");
        int[] newData = new com.bayudwiyansatria.utils.Utils().string_to_int (split);
        return newData;
    }

    public double[] makeArray_1D_double(String data) {
        data = data.replace(" ", "");
        String tmp = this.cleanArrIn(data);
        String[] split = tmp.split(",");
        double[] newData = new com.bayudwiyansatria.utils.Utils().string_to_double (split);
        return newData;
    }

    public String[] makeArray_1D_String(String data) {
        data = data.replace(" ", "");
        String tmp = this.cleanArrIn(data);
        String[] newData = tmp.split(",");
        return newData;
    }

    public int[][] makeArray_2D_int(String data) {
        data = data.replace(" ", "");
        String tmp = this.cleanArrIn(data);
        String[] split1 = tmp.split(";");
        String[] split2 = split1[0].split(",");
        int[][] newData = new int[split1.length][split2.length];

        for(int i = 0; i < split1.length; ++i) {
            split2 = split1[i].split(",");

            for(int _c2 = 0; _c2 < split2.length; ++_c2) {
                newData[i][_c2] = Integer.parseInt(split2[_c2]);
            }
        }
        return newData;
    }

    public double[][] makeArray_2D_double(String data) {
        data = data.replace(" ", "");
        String tmp = this.cleanArrIn(data);
        String[] split1 = tmp.split(";");
        String[] split2 = split1[0].split(",");
        double[][] newData = new double[split1.length][split2.length];

        for(int i = 0; i < split1.length; ++i) {
            split2 = split1[i].split(",");

            for(int _c2 = 0; _c2 < split2.length; ++_c2) {
                newData[i][_c2] = Double.parseDouble(split2[_c2]);
            }
        }

        return newData;
    }

    public String[][] makeArray_2D_String(String data) {
        data = data.replace(" ", "");
        String tmp = this.cleanArrIn(data);
        String[] split1 = tmp.split(";");
        String[] split2 = split1[0].split(",");
        String[][] newData = new String[split1.length][split2.length];

        for(int i = 0; i < split1.length; ++i) {
            split2 = split1[i].split(",");

            for(int _c2 = 0; _c2 < split2.length; ++_c2) {
                newData[i][_c2] = split2[_c2];
            }
        }

        return newData;
    }

    /* ======================================= Array Create End ======================================================*/

    /* ======================================= Array Remove Start =====================================================*/

    public String cleanArrIn(String data) {
        String newData = data;
        if (newData.charAt(0) != '[' && newData.charAt(newData.length() - 1) != ']') {
            System.out.println("data should be between [ and ]");
        }
        newData = newData.substring(1, newData.length() - 1);
        if (newData.charAt(newData.length() - 1) == ';') {
            newData = newData.substring(0, newData.length() - 1);
        }
        return newData;
    }

    public int[] removeNull(int[] data) {
        int countNulls = 0;
        for (int datum : data) {
            if (Integer.toString(datum) == null) {
                countNulls++;
            }
        }
        int[] newData = new int[data.length - countNulls];
        for (int i = 0, j = 0; i < data.length; i++) {
            if (Integer.toString(data[i]) == null) {
                newData[j] = data[i];
                j++;
            }
        }
        return newData;
    }

    public double[] removeNull(double[] data) {
        int countNulls = 0;
        for (double datum : data) {
            if (Double.toString(datum) == null) {
                countNulls++;
            }
        }
        double[] newData = new double[data.length - countNulls];
        for (int i = 0, j = 0; i < data.length; i++) {
            if (Double.toString(data[i]) == null) {
                newData[j] = data[i];
                j++;
            }
        }
        return newData;
    }

    public String[] removeNull(String[] data) {
        int countNulls = 0;
        for (String datum : data) {
            if (datum == null) {
                countNulls++;
            }
        }
        String[] newData = new String[data.length - countNulls];
        for (int i = 0, j = 0; i < data.length; i++) {
            if (data[i] != null) {
                newData[j] = data[i];
                j++;
            }
        }
        return newData;
    }
    /* ======================================= Array Remove End =====================================================*/

    /* ======================================= Array Reverse Start =====================================================*/
    public int[] arrayReverse(int[] data){
        int[] newArray = new int[data.length];
        int j = data.length;
        for (int datum : data) {
            newArray[j - 1] = datum;
            j = j - 1;
        }
        return newArray;
    }

    public double[] arrayReverse(double[] data){
        double[] newArray = new double[data.length];
        int j = data.length;
        for (double datum : data) {
            newArray[j - 1] = datum;
            j = j - 1;
        }
        return newArray;
    }

    public String[] arrayReverse(String[] data){
        String[] newArray = new String[data.length];
        int j = data.length;
        for (String datum : data) {
            newArray[j - 1] = datum;
            j = j - 1;
        }
        return newArray;
    }

    /* ======================================= Array Reverse End =====================================================*/

    public String[][] removeDuplicate(String[][] data) {
        String[][] newMatrix = new String[data.length][data[0].length];
        int newMatrixRow = 1;
        System.arraycopy(data[0], 0, newMatrix[0], 0, data[0].length);
        for (int j = 1; j < data.length; j++) {
            List<Boolean> list = new ArrayList<>();
            for (int i = 0; newMatrix[i][0] != null; i++) {
                boolean same = true;
                for (int col = 2; col < data[j].length; col++) {
                    if (!newMatrix[i][col].equals(data[j][col])) {
                        same = false;
                        break;
                    }
                }
                list.add(same);
            }
            if (!list.contains(true)) {
                System.arraycopy(data[j], 0, newMatrix[newMatrixRow], 0, data[j].length);
                newMatrixRow++;
            }
        }
        int i;
        for(i = 0; newMatrix[i][0] != null; i++);
        String[][] finalMatrix = new String[i][newMatrix[0].length];
        for (i = 0; i < finalMatrix.length; i++) {
            System.arraycopy(newMatrix[i], 0, finalMatrix[i], 0, finalMatrix[i].length);
        }
        return finalMatrix;
    }

    public double[] push(double[] oldArray, double[] newArray) {
        for (int i = 0; i < oldArray.length - 1; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public int[] push(int[] oldArray, int[] newArray) {
        for (int i = 0; i < oldArray.length - 1; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public String[] push(String[] oldArray, String[] newArray) {
        for (int i = 0; i < oldArray.length - 1; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public double[] arrayPush(double[] oldArray, double valueAdd) {
        double[] newArray = new double[oldArray.length + 1];
        push(oldArray, newArray);
        oldArray[oldArray.length] = valueAdd;
        return newArray;
    }

    public int[] arrayPush(int[] oldArray, int valueAdd) {
        int[] newArray = new int[oldArray.length + 1];
        push(oldArray, newArray);
        oldArray[oldArray.length] = valueAdd;
        return newArray;
    }

    public String[] arrayPush(String[] oldArray, String valueAdd){
        String[] newArray = new String[oldArray.length + 1];
        push(oldArray, newArray);
        oldArray[oldArray.length] = valueAdd;
        return newArray;
    }

    public double[][] removeIndex(String[][] Data) {
        double[][] newData = new double[Data.length][];
        for (int i = 0; i < Data.length; i++) {
            for (int j = 0; j < Data[i].length - 1; j++) {
                newData[i][j] = Double.parseDouble(Data[i][j]);
            }
        }
        return newData;
    }
}
