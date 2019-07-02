package com.bayudwiyansatria.io;

import com.bayudwiyansatria.mat.Mat;
import com.bayudwiyansatria.utils.Utils;

import java.util.*;

public class Array {
    static Mat math = new Mat();
    static Utils utils = new Utils();

    /* ======================================= Array View Start ======================================================*/

    public void print(int data) {
        System.out.println(data + "\n");
    }

    public void print(double data) {
        System.out.println(data + "\n");
    }

    public void print(long data) {
        System.out.println(data + "\n");
    }

    public void print(String data) {
        System.out.println(data + "\n");
    }

    public void print(String label, int data) {
        System.out.println(label + " = " + data + "\n");
    }

    public void print(String label, double data) {
        System.out.println(label + " = " + data + "\n");
    }

    public void print(String label, long data) {
        System.out.println(label + " = " + data + "\n");
    }

    public void print(String label, String data) {
        System.out.println(label + " = " + data + "\n");
    }

    public void print(int[] data) {
        this.print("", data);
    }

    public void print(double[] data) {
        this.print("", data);
    }

    public void print(String[] data) {
        this.print("", data);
    }

    public void print(int[][] data) {
        this.print("", data);
    }

    public void print(double[][] data) {
        this.print("", data);
    }

    public void print(String[][] data) {
        this.print("", data);
    }

    public void print(double data, int decimal_fraction) {
        System.out.println(math.getRound(data, decimal_fraction) + "\n");
    }

    public void print(double[] data, int decimal_fraction) {
        this.print("", data, decimal_fraction);
    }

    public void print(double[][] data, int decimal_fraction) {
        this.print("", data, decimal_fraction);
    }

    public void print(String label, double data, int decimal_fraction) {
        System.out.println(label + " = " + math.getRound(data, decimal_fraction) + "\n");
    }

    public void print(String label, int[] data) {
        if (label.length() > 0) {
            System.out.println(label + " =");
        }
        for(int i = 0; i < data.length - 1; ++i) {
            System.out.print(data[i] + "    ");
        }
        if (data.length > 0) {
            System.out.print(data[data.length - 1]);
        }
        System.out.print("\n\n");
    }

    public void print(String label, double[] data) {
        if (label.length() > 0) {
            System.out.println(label + " =");
        }

        for(int i = 0; i < data.length - 1; ++i) {
            System.out.print(data[i] + "    ");
        }

        if (data.length > 0) {
            System.out.print(data[data.length - 1]);
        }

        System.out.print("\n\n");
    }

    public void print(String label, String[] data) {
        if (label.length() > 0) {
            System.out.println(label + " =");
        }
        for(int i = 0; i < data.length - 1; ++i) {
            System.out.print(data[i] + "    ");
        }
        if (data.length > 0) {
            System.out.print(data[data.length - 1]);
        }

        System.out.print("\n\n");
    }

    public void print(String label, int[][] data) {
        if (label.length() > 0) {
            System.out.println(label + " =");
        }

        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[i].length; ++j) {
                System.out.print(data[i][j] + "    ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public void print(String label, double[][] data) {
        if (label.length() > 0) {
            System.out.println(label + " =");
        }

        for(int i = 0; i < data.length; ++i) {

            for(int j = 0; j < data[i].length; ++j) {
                System.out.print(data[i][j] + "    ");
            }

            System.out.print("\n");
        }

        System.out.print("\n");
    }

    public void print(String label, String[][] data) {
        if (label.length() > 0) {
            System.out.println(label + " =");
        }

        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[i].length; ++j) {
                System.out.print(data[i][j] + "    ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }


    public void print(String label, double[] data, int decimal_fraction) {
        if (label.length() > 0) {
            System.out.println(label + " =");
        }
        for(int i = 0; i < data.length - 1; ++i) {
            System.out.print(math.getRound(data[i], decimal_fraction) + "    ");
        }
        if (data.length > 0) {
            System.out.print(math.getRound(data[data.length - 1], decimal_fraction));
        }
        System.out.print("\n\n");
    }

    public void print(String label, double[][] data, int decimal_fraction) {
        if (label.length() > 0) {
            System.out.println(label + " =");
        }

        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[i].length; ++j) {
                System.out.print(math.getRound(data[i][j], decimal_fraction) + "    ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    /* ======================================= Array View End ========================================================*/

    /* ======================================= Array Get Dimension Start =============================================*/

    public int[] getRow(int[][] data, int row) {
        int[] _vv = new int[data[0].length];
        try {
            for(int i = 0; i < data[0].length; ++i) {
                _vv[i] = data[row][i];
            }
        } catch (Exception var6) {
            System.out.println("Row is not correct!");
        }
        return _vv;
    }

    public double[] getRow(double[][] data, int row) {
        double[] _vv = new double[data[0].length];
        try {
            System.arraycopy(data[row], 0, _vv, 0, data[0].length);
        } catch (Exception var6) {
            System.out.println("Row is not correct!");
        }
        return _vv;
    }

    public int[] getRow(int[] data, int startrow, int endrow) {
        int[] _vv = new int[endrow - startrow + 1];
        try {
            for(int i = ~(0 - (int)(1L + (long)startrow)); i <= endrow; ++i) {
                _vv[i - startrow] = data[i];
            }
        } catch (Exception var7) {
            System.out.println("Row is not correct!");
        }
        return _vv;
    }

    public double[] getRow(double[] data, int startrow, int endrow) {
        double[] _vv = new double[endrow - startrow + 1];
        try {
            for(int i = ~(0 - (int)(1L + (long)startrow)); i <= endrow; ++i) {
                _vv[i - startrow] = data[i];
            }
        } catch (Exception var7) {
            System.out.println("Row is not correct!");
        }
        return _vv;
    }

    public int[][] getRow(int[][] data, int startrow, int endrow) {
        int[][] _vv = new int[endrow - startrow + 1][data[0].length];
        try {
            for(int i = ~(0 - (int)(1L + (long)startrow)); i <= endrow; ++i) {
                System.arraycopy(data[i], 0, _vv[i - startrow], 0, data[0].length);
            }
        } catch (Exception var8) {
            System.out.println("Row is not correct!");
        }
        return _vv;
    }

    public double[][] getRow(double[][] data, int startrow, int endrow) {
        double[][] _vv = new double[endrow - startrow + 1][data[0].length];
        try {
            for(int i = ~(0 - (int)(1L + (long)startrow)); i <= endrow; ++i) {
                for(int j = 0; i < data[0].length; ++i) {
                    _vv[i - startrow][i] = data[i][j];
                }
            }
        } catch (Exception var9) {
            System.out.println("Row is not correct!");
        }
        return _vv;
    }

    public int[] getCol(int[][] data, int col) {
        int[] _vv = new int[data.length];
        try {
            for(int i = 0; i < data.length; ++i) {
                _vv[i] = data[i][col];
            }
        } catch (Exception var6) {
            System.out.println("Column is not correct!");
        }
        return _vv;
    }

    public double[] getCol(double[][] data, int col) {
        double[] _vv = new double[data.length];
        try {
            for(int i = 0; i < data.length; ++i) {
                _vv[i] = data[i][col];
            }
        } catch (Exception var6) {
            System.out.println("Column is not correct!");
        }
        return _vv;
    }

    public int[] getCol(int[] data, int startcol, int endcol) {
        int[] _vv = new int[endcol - startcol + 1];
        try {
            for(int i = ~(0 - (int)(1L + (long)startcol)); i <= endcol; ++i) {
                _vv[i - startcol] = data[i];
            }
        } catch (Exception var7) {
            System.out.println("Row is not correct!");
        }

        return _vv;
    }

    public double[] getCol(double[] data, int startcol, int endcol) {
        double[] _vv = new double[endcol - startcol + 1];

        try {
            for(int i = ~(0 - (int)(1L + (long)startcol)); i <= endcol; ++i) {
                _vv[i - startcol] = data[i];
            }
        } catch (Exception var7) {
            System.out.println("Row is not correct!");
        }
        return _vv;
    }

    public int[][] getCol(int[][] data, int startcol, int endcol) {
        int[][] _vv = new int[data.length][endcol - startcol + 1];
        try {
            for(int i = 0; i < data.length; ++i) {
                for(int j = ~(0 - (int)(1L + (long)startcol)); j <= endcol; ++j) {
                    _vv[i][j - startcol] = data[i][j];
                }
            }
        } catch (Exception var9) {
            System.out.println("Column is not correct!");
        }
        return _vv;
    }

    public double[][] getCol(double[][] data, int startcol, int endcol) {
        double[][] _vv = new double[data.length][endcol - startcol + 1];
        try {
            for(int i = 0; i < data.length; ++i) {
                for(int j = ~(0 - (int)(1L + (long)startcol)); j <= endcol; ++j) {
                    _vv[i][j - startcol] = data[i][j];
                }
            }
        } catch (Exception var9) {
            System.out.println("Column is not correct!");
        }
        return _vv;
    }

    public int[][] getRowCol(int[][] data, int startrow, int endrow, int startcol, int endcol) {
        int[][] _vv = new int[endrow - startrow + 1][endcol - startcol + 1];
        try {
            for(int i = ~(0 - (int)(1L + (long)startrow)); i <= endrow; ++i) {
                for(int j = ~(0 - (int)(1L + (long)startcol)); j <= endcol; ++j) {
                    _vv[i - startrow][j - startcol] = data[i][j];
                }
            }
        } catch (Exception var11) {
            System.out.println("Row is not correct!");
        }
        return _vv;
    }

    public double[][] getRowCol(double[][] data, int startrow, int endrow, int startcol, int endcol) {
        double[][] _vv = new double[endrow - startrow + 1][endcol - startcol + 1];
        try {
            for(int i = ~(0 - (int)(1L + (long)startrow)); i <= endrow; ++i) {
                for(int j = ~(0 - (int)(1L + (long)startcol)); j <= endcol; ++j) {
                    _vv[i - startrow][j - startcol] = data[i][j];
                }
            }
        } catch (Exception var11) {
            System.out.println("Row is not correct!");
        }
        return _vv;
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
        int[][] _hasil = new int[2][data.length];
        mode = mode.toLowerCase();
        int[] ar = this.copyArray(data);
        Arrays.sort(ar);
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < data.length; ++i) {
            map.put(i, data[i]);
        }
        Map<String, String> sortedMap = sortByComparator(map);
        int p;
        Iterator var8;
        Map.Entry entry;
        if (mode.equals("asc")) {
            p = 0;
            for(var8 = sortedMap.entrySet().iterator(); var8.hasNext(); ++p) {
                entry = (Map.Entry)var8.next();
                _hasil[1][p] = (Integer)entry.getKey();
                _hasil[0][p] = (Integer)entry.getValue();
            }
        } else if (mode.equals("desc")) {
            p = data.length - 1;

            for(var8 = sortedMap.entrySet().iterator(); var8.hasNext(); --p) {
                entry = (Map.Entry)var8.next();
                _hasil[1][p] = (Integer)entry.getKey();
                _hasil[0][p] = (Integer)entry.getValue();
            }
        } else {
            System.out.println("Mode incorrect");
        }
        return _hasil;
    }

    public double[][] sortData(double[] data, String mode) {
        double[][] _hasil = new double[2][data.length];
        mode = mode.toLowerCase();
        double[] ar = this.copyArray(data);
        Arrays.sort(ar);
        Map<Integer, Double> map = new HashMap();
        for(int i = 0; i < data.length; ++i) {
            map.put(i, data[i]);
        }
        Map<String, String> sortedMap = sortByComparator(map);
        int p;
        Iterator var8;
        Map.Entry entry;
        if (mode.equals("asc")) {
            p = 0;
            for(var8 = sortedMap.entrySet().iterator(); var8.hasNext(); ++p) {
                entry = (Map.Entry)var8.next();
                _hasil[1][p] = (double)(Integer)entry.getKey();
                _hasil[0][p] = (Double)entry.getValue();
            }
        } else if (mode.equals("desc")) {
            p = data.length - 1;
            for(var8 = sortedMap.entrySet().iterator(); var8.hasNext(); --p) {
                entry = (Map.Entry)var8.next();
                _hasil[1][p] = (double)(Integer)entry.getKey();
                _hasil[0][p] = (Double)entry.getValue();
            }
        } else {
            System.out.println("Mode incorrect");
        }
        return _hasil;
    }

    private static Map sortByComparator(Map unsortMap) {
        List list = new LinkedList(unsortMap.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable)((Map.Entry)((Map.Entry)o1)).getValue()).compareTo(((Map.Entry)((Map.Entry)o2)).getValue());
            }
        });
        Map sortedMap = new LinkedHashMap();
        Iterator it = list.iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    /* ======================================= Array Sort End ========================================================*/

    /* ======================================= Array Merger Start ====================================================*/

    public int[] mergeArray(int[] data1, int[] data2) {
        int[] _output = this.initArray(data1.length + data2.length, 0);

        int i;
        for(i = 0; i < data1.length; ++i) {
            _output[i] = data1[i];
        }

        for(i = 0; i < data2.length; ++i) {
            _output[data1.length + i] = data2[i];
        }

        return _output;
    }

    public double[] mergeArray(double[] data1, double[] data2) {
        double[] _output = this.initArray(data1.length + data2.length, 0.0);

        int i;
        for(i = 0; i < data1.length; ++i) {
            _output[i] = data1[i];
        }

        for(i = 0; i < data2.length; ++i) {
            _output[data1.length + i] = data2[i];
        }

        return _output;
    }

    public int[][] mergeArray_row(int[] data1, int[] data2) {
        int[][] _output = this.initArray(2, data1.length, 0);
        if (data1.length != data2.length) {
            System.out.println("length of both data has to be same!");
        }

        for(int i = 0; i < data1.length; ++i) {
            _output[0][i] = data1[i];
            _output[1][i] = data2[i];
        }

        return _output;
    }

    public double[][] mergeArray_row(double[] data1, double[] data2) {
        double[][] _output = this.initArray(2, data1.length, 0.0);
        if (data1.length != data2.length) {
            System.out.println("length of both data has to be same!");
        }

        for(int i = 0; i < data1.length; ++i) {
            _output[0][i] = data1[i];
            _output[1][i] = data2[i];
        }

        return _output;
    }

    public int[][] mergeArray_col(int[] data1, int[] data2) {
        int[][] _output = this.initArray(data1.length, 2, 0);
        if (data1.length != data2.length) {
            System.out.println("length of both data has to be same!");
        }

        for(int i = 0; i < data1.length; ++i) {
            _output[i][0] = data1[i];
            _output[i][1] = data2[i];
        }

        return _output;
    }

    public double[][] mergeArray_col(double[] data1, double[] data2) {
        double[][] _output = this.initArray(data1.length, 2, 0.0);
        if (data1.length != data2.length) {
            System.out.println("length of both data has to be same!");
        }

        for(int i = 0; i < data1.length; ++i) {
            _output[i][0] = data1[i];
            _output[i][1] = data2[i];
        }

        return _output;
    }

    public int[][] mergeArray_row(int[] data1, int[][] data2) {
        int _dim2 = data2[0].length;
        int[][] _output = (int[][])null;
        if (_dim2 == data1.length) {
            _output = this.initArray(data2.length + 1, _dim2, 0);

            int i;
            for(i = 0; i < _dim2; ++i) {
                _output[0][i] = data1[i];
            }

            for(int j = 1; j <= data2.length; ++j) {
                for(i = 0; i < _dim2; ++i) {
                    _output[j][i] = data2[j][i];
                }
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return _output;
    }

    public double[][] mergeArray_row(double[] data1, double[][] data2) {
        int _dim2 = data2[0].length;
        double[][] _output = (double[][])null;
        if (_dim2 == data1.length) {
            _output = this.initArray(data2.length + 1, _dim2, 0.0);

            int i;
            for(i = 0; i < _dim2; ++i) {
                _output[0][i] = data1[i];
            }

            for(int j = 1; j <= data2.length; ++j) {
                for(i = 0; i < _dim2; ++i) {
                    _output[j][i] = data2[j][i];
                }
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return _output;
    }

    public int[][] mergeArray_col(int[] data1, int[][] data2) {
        int _dim2 = data2[0].length;
        int[][] _output = (int[][])null;
        if (data1.length == data2.length) {
            _output = this.initArray(data1.length, _dim2 + 1, 0);

            for(int i = 0; i < data1.length; ++i) {
                _output[data2.length][0] = data1[i];

                for(int j = 1; j <= _dim2; ++j) {
                    _output[i][j] = data2[i][j];
                }
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return _output;
    }

    public double[][] mergeArray_col(double[] data1, double[][] data2) {
        int _dim2 = data2[0].length;
        double[][] _output = (double[][])null;
        if (data1.length == data2.length) {
            _output = this.initArray(data1.length, _dim2 + 1, 0.0);

            for(int i = 0; i < data1.length; ++i) {
                _output[data2.length][0] = data1[i];

                for(int j = 1; j <= _dim2; ++j) {
                    _output[i][j] = data2[i][j];
                }
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return _output;
    }

    public int[][] mergeArray_row(int[][] data1, int[] data2) {
        int[][] _output = (int[][])null;
        if (data1[0].length == data2.length) {
            _output = this.initArray(data1.length + 1, data1[0].length, 0);

            int i;
            for(int j = 0; j < data1.length; ++j) {
                for(i = 0; i < data1[0].length; ++i) {
                    _output[j][i] = data1[j][i];
                }
            }

            for(i = 0; i < data1[0].length; ++i) {
                _output[data1.length][i] = data2[i];
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return _output;
    }

    public double[][] mergeArray_row(double[][] data1, double[] data2) {
        double[][] _output = (double[][])null;
        if (data1[0].length == data2.length) {
            _output = this.initArray(data1.length + 1, data1[0].length, 0.0);

            int i;
            for(int j = 0; j < data1.length; ++j) {
                for(i = 0; i < data1[0].length; ++i) {
                    _output[j][i] = data1[j][i];
                }
            }

            for(i = 0; i < data1[0].length; ++i) {
                _output[data1.length][i] = data2[i];
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return _output;
    }

    public int[][] mergeArray_col(int[][] data1, int[] data2) {
        int[][] _output = (int[][])null;
        if (data1.length == data2.length) {
            _output = this.initArray(data1.length, data1[0].length + 1, 0);

            for(int i = 0; i < data1.length; ++i) {
                for(int j = 0; j < data1[0].length; ++j) {
                    _output[i][j] = data1[i][j];
                }

                _output[data1.length][data1[0].length] = data2[i];
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return _output;
    }

    public double[][] mergeArray_col(double[][] data1, double[] data2) {
        double[][] _output = (double[][])null;
        if (data1.length == data2.length) {
            _output = this.initArray(data1.length, data1[0].length + 1, 0.0);

            for(int i = 0; i < data1.length; ++i) {
                for(int j = 0; j < data1[0].length; ++j) {
                    _output[i][j] = data1[i][j];
                }

                _output[i][data1[0].length] = data2[i];
            }
        } else {
            System.out.println("Dimension of data has to be same!");
        }

        return _output;
    }

    public int[][] mergeArray_row(int[][] data1, int[][] data2) {
        int _dim2 = data2[0].length;
        int[][] _output = this.initArray(data1.length + data2.length, data1[0].length, 0);
        if (data1[0].length != _dim2) {
            System.out.println("Cols of both data has to be same!");
        }

        for(int i = 0; i < data1[0].length; ++i) {
            int j;
            for(j = 0; j < data1.length; ++j) {
                _output[j][i] = data1[j][i];
            }

            for(j = 0; j < data2.length; ++j) {
                _output[data1.length + j][i] = data2[j][i];
            }
        }

        return _output;
    }

    public double[][] mergeArray_row(double[][] data1, double[][] data2) {
        double[][] _output = this.initArray(data1.length + data2.length, data1[0].length, 0.0);
        if (data1[0].length != data1[0].length) {
            System.out.println("Cols of both data has to be same!");
        }
        for(int i = 0; i < data1[0].length; ++i) {
            int j;
            for(j = 0; j < data1.length; ++j) {
                _output[j][i] = data1[j][i];
            }
            for(j = 0; j < data2.length; ++j) {
                _output[data1.length + j][i] = data2[j][i];
            }
        }
        return _output;
    }

    public int[][] mergeArray_col(int[][] data1, int[][] data2) {
        int _dim2 = data2[0].length;
        int[][] _output = this.initArray(data1.length, data1[0].length + _dim2, 0);
        if (data1.length != data2.length) {
            System.out.println("Rows of both data has to be same!");
        }
        for(int i = 0; i < data1.length; ++i) {
            int j;
            for(j = 0; j < data1[0].length; ++j) {
                _output[i][j] = data1[i][j];
            }
            for(j = 0; j < _dim2; ++j) {
                _output[i][data1[0].length + j] = data2[i][j];
            }
        }

        return _output;
    }

    public double[][] mergeArray_col(double[][] data1, double[][] data2) {
        int _dim2 = data2[0].length;
        double[][] _output = this.initArray(data1.length, data1[0].length + _dim2, 0.0);
        if (data1.length != data2.length) {
            System.out.println("Rows of both data has to be same!");
        }
        for(int i = 0; i < data1.length; ++i) {
            int j;
            for(j = 0; j < data1[0].length; ++j) {
                _output[i][j] = data1[i][j];
            }

            for(j = 0; j < _dim2; ++j) {
                _output[i][data1[0].length + j] = data2[i][j];
            }
        }
        return _output;
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
            int _dimensi = data[i].length;
            newArray[i] = new int[_dimensi];
            System.arraycopy(data[i], 0, newArray[i], 0, _dimensi);
        }

        return newArray;
    }

    public double[][] copyArray(double[][] data) {
        double[][] newArray = new double[data.length][];

        for(int i = 0; i < data.length; ++i) {
            int _dimensi = data[i].length;
            newArray[i] = new double[_dimensi];
            System.arraycopy(data[i], 0, newArray[i], 0, _dimensi);
        }

        return newArray;
    }

    public String[][] copyArray(String[][] data) {
        String[][] newArray = new String[data.length][];

        for(int i = 0; i < data.length; ++i) {
            int _dimensi = data[i].length;
            newArray[i] = new String[_dimensi];
            System.arraycopy(data[i], 0, newArray[i], 0, _dimensi);
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
        int[][] newArray = (int[][])null;
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
        double[][] newArray = (double[][])null;
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
                newArray[i] = math.getRandom(min, max);
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
                newArray[i] = math.getRandom(min, max);
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public int[][] initArrayRandom(int rows, int cols, int min, int max) {
        int[][] newArray = (int[][])null;
        if (rows > 0 && cols > 0) {
            newArray = new int[rows][cols];

            for(int i = 0; i < rows; ++i) {
                for(int j = 0; j < cols; ++j) {
                    newArray[i][j] = math.getRandom(min, max);
                }
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public double[][] initArrayRandom(int rows, int cols, double min, double max) {
        double[][] newArray = (double[][])null;
        if (rows > 0 && cols > 0) {
            newArray = new double[rows][cols];

            for(int i = 0; i < rows; ++i) {
                for(int j = 0; j < cols; ++j) {
                    newArray[i][j] = math.getRandom(min, max);
                }
            }
        } else {
            System.out.println("Array length must be greater than zero!");
        }

        return newArray;
    }

    public int[][] initArrayUniform(int dim) {
        int[][] pusat = new int[][]{{25, 25}, {50, 25}, {75, 25}, {25, 50}, {50, 50}, {75, 50}, {25, 75}, {50, 75}, {75, 75}};
        List list_x = new ArrayList();
        List list_y = new ArrayList();

        int j;
        for(int i = 0; i < pusat.length; ++i) {
            int r = math.getRandom(1, 10);
            if (r > 5) {
                int x = pusat[i][0];
                int y = pusat[i][1];

                for(j = 0; j < 20; ++j) {
                    list_x.add(new Integer(math.getRandom(x - dim, x + dim)));
                    list_y.add(new Integer(math.getRandom(y - dim, y + dim)));
                }
            }
        }

        int[][] newArray = new int[list_x.size()][2];

        for(j = 0; j < list_x.size(); ++j) {
            newArray[j][0] = (Integer)list_x.get(j);
            newArray[j][1] = (Integer)list_y.get(j);
        }

        return newArray;
    }

    /* ======================================= Array Init End ========================================================*/

    /* ======================================= Array Create Start ====================================================*/

    public int[] makeArray_1D_int(String data) {
        data = data.replace(" ", "");
        int length = data.length();
        String _temp = this.cleanArrIn(data);
        String[] split = _temp.split(",");
        int[] newData = utils.String_to_int(split);
        return newData;
    }

    public double[] makeArray_1D_double(String data) {
        data = data.replace(" ", "");
        int length = data.length();
        String _temp = this.cleanArrIn(data);
        String[] split = _temp.split(",");
        double[] newData = utils.String_to_double(split);
        return newData;
    }

    public String[] makeArray_1D_String(String data) {
        data = data.replace(" ", "");
        String _temp = this.cleanArrIn(data);
        String[] newData = _temp.split(",");
        return newData;
    }

    public int[][] makeArray_2D_int(String data) {
        data = data.replace(" ", "");
        String _temp = this.cleanArrIn(data);
        String[] split1 = _temp.split(";");
        String[] split2 = split1[0].split(",");
        int _lrow = split1.length;
        int _lcol = split2.length;
        int[][] newData = new int[_lrow][_lcol];

        for(int i = 0; i < _lrow; ++i) {
            split2 = split1[i].split(",");

            for(int _c2 = 0; _c2 < _lcol; ++_c2) {
                newData[i][_c2] = Integer.parseInt(split2[_c2]);
            }
        }
        return newData;
    }

    public double[][] makeArray_2D_double(String data) {
        data = data.replace(" ", "");
        String _temp = this.cleanArrIn(data);
        String[] split1 = _temp.split(";");
        String[] split2 = split1[0].split(",");
        int _lrow = split1.length;
        int _lcol = split2.length;
        double[][] newData = new double[_lrow][_lcol];

        for(int i = 0; i < _lrow; ++i) {
            split2 = split1[i].split(",");

            for(int _c2 = 0; _c2 < _lcol; ++_c2) {
                newData[i][_c2] = Double.parseDouble(split2[_c2]);
            }
        }

        return newData;
    }

    public String[][] makeArray_2D_String(String data) {
        data = data.replace(" ", "");
        String _temp = this.cleanArrIn(data);
        String[] split1 = _temp.split(";");
        String[] split2 = split1[0].split(",");
        int _lrow = split1.length;
        int _lcol = split2.length;
        String[][] newData = new String[_lrow][_lcol];

        for(int i = 0; i < _lrow; ++i) {
            split2 = split1[i].split(",");

            for(int _c2 = 0; _c2 < _lcol; ++_c2) {
                newData[i][_c2] = split2[_c2];
            }
        }

        return newData;
    }

    /* ======================================= Array Create End ======================================================*/

    /* ======================================= Array Remove Start =====================================================*/

    private String cleanArrIn(String data) {
        if (data.charAt(0) != '[' && data.charAt(data.length() - 1) != ']') {
            System.out.println("data should be between [ and ]");
        }

        data = data.substring(1, data.length() - 1);
        if (data.charAt(data.length() - 1) == ';') {
            data = data.substring(0, data.length() - 1);
        }

        return data;
    }

    public int[] removeNull(int[] data) {
        int countNulls = 0;
        for (int i = 0; i < data.length; i++) {
            if (Integer.toString(data[i]) == null) {
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
        for (int i = 0; i < data.length; i++) {
            if (Double.toString(data[i]) == null) {
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
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
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
        for (int i = 0; i < data.length; i++) {
            newArray[j - 1] = data[i];
            j = j - 1;
        }
        return newArray;
    }

    public double[] arrayReverse(double[] data){
        double[] newArray = new double[data.length];
        int j = data.length;
        for (int i = 0; i < data.length; i++) {
            newArray[j - 1] = data[i];
            j = j - 1;
        }
        return newArray;
    }

    public String[] arrayReverse(String[] data){
        String[] newArray = new String[data.length];
        int j = data.length;
        for (int i = 0; i < data.length; i++) {
            newArray[j - 1] = data[i];
            j = j - 1;
        }
        return newArray;
    }

    /* ======================================= Array Reverse End =====================================================*/

    public String[][] removeDuplicate(String[][] data) {
        String[][] newMatrix = new String[data.length][data[0].length];
        int newMatrixRow = 1;
        for (int i = 0; i < data[0].length; i++) {
            newMatrix[0][i] = data[0][i];
        }
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
                for (int i = 0; i < data[j].length; i++) {
                    newMatrix[newMatrixRow][i] = data[j][i];
                }
                newMatrixRow++;
            }
        }
        int i;
        for(i = 0; newMatrix[i][0] != null; i++);
        String[][] finalMatrix = new String[i][newMatrix[0].length];
        for (i = 0; i < finalMatrix.length; i++) {
            for (int j = 0; j < finalMatrix[i].length; j++) {
                finalMatrix[i][j] = newMatrix[i][j];
            }
        }
        return finalMatrix;
    }

    private double[] push(double[] oldArray, double[] newArray) {
        for (int i = 0; i < oldArray.length - 1; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    private int[] push(int[] oldArray, int[] newArray) {
        for (int i = 0; i < oldArray.length - 1; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    private String[] push(String[] oldArray, String[] newArray) {
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
