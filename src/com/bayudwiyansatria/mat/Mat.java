package com.bayudwiyansatria.mat;

import com.bayudwiyansatria.io.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Mat extends Vector{
    static Array array = new Array();

    /* ========================================= Average Start ====================================================== */
    public double[] getAverage(int[][] data, String mode) {
        double[] average = null;
        double initAverage;
        int i;
        int j;
        if (mode.equals("col")) {
            average = new double[data[0].length];
            for(i = 0; i < data[0].length; ++i) {
                initAverage = 0.0;
                for(j = 0; j < data.length; ++j) {
                    initAverage += data[j][i];
                }
                average[i] = initAverage / (double)data.length;
            }
        } else if (mode.equals("row")) {
            average = new double[data.length];

            for(i = 0; i < data.length; ++i) {
                initAverage = 0.0;
                for(j = 0; j < data[0].length; ++j) {
                    initAverage += data[i][j];
                }
                average[i] = initAverage / (double)data[0].length;
            }
        } else {
            this.warning("Error in mode parameter!");
        }
        return average;
    }

    public double getAverage(int[] data) {
        double initAverage = 0.0;
        for(int i = 0; i < data.length; ++i) {
            initAverage = initAverage + data[i];
        }
        double average = initAverage / (double)data.length;
        return average;
    }

    public double getAverage(double[] data) {
        double initAverage = 0.0;
        for(int i = 0; i < data.length; ++i) {
            initAverage = initAverage + data[i];
        }
        double average = initAverage / (double)data.length;
        return average;
    }

    public double[] getAverage(double[][] data, String mode) {
        double[] average = null;
        double initAverage;
        int i;
        int j;
        if (mode.equals("col")) {
            average = new double[data[0].length];
            for(i = 0; i < data[0].length; ++i) {
                initAverage = 0.0;
                for(j = 0; j < data.length; ++j) {
                    initAverage += data[j][i];
                }
                average[i] = initAverage / (double)data.length;
            }
        } else if (mode.equals("row")) {
            average = new double[data.length];
            for(i = 0; i < data.length; ++i) {
                initAverage = 0.0;
                for(j = 0; j < data[0].length; ++j) {
                    initAverage += data[i][j];
                }
                average[i] = initAverage / (double)data[0].length;
            }
        } else {
            this.warning("Error in mode parameter!");
        }
        return average;
    }

    /* ========================================= Average End ======================================================== */

    /* ========================================= Random Start ======================================================= */
    public int getRandom(int min, int max) {
        new Random();
        int nilai = (int)(java.lang.Math.random() * (double)(max + 1 - min)) + min;
        return nilai;
    }

    public double getRandom(double min, double max) {
        new Random();
        double nilai = java.lang.Math.random() * (max - min) + min;
        return nilai;
    }

    /* ========================================= Random End ========================================================= */

    /* ========================================= Standard Deviation Start =========================================== */

    public double getStd(int[] data) {
        double _output = this.getStd(this.int_to_double(data));
        return _output;
    }

    public double getStd(double[] data) {
        double _mean = this.getAverage(data);
        double[] calculate = this.Calculate(data, _mean, "-");
        double[] sqr_selisih = this.Calculate(calculate, calculate, "*");
        double _output = java.lang.Math.sqrt(this.getSum(sqr_selisih) / (double)data.length);
        return _output;
    }

    public double[] getStd(int[][] data, String type) {
        double[] _output = this.getStd(this.int_to_double(data), type);
        return _output;
    }

    public double[] getStd(double[][] data, String type) {
        double[] _output = null;
        int i;
        if (type.equals("col")) {
            _output = new double[data[0].length];
            for(i = 0; i < data[0].length; ++i) {
                _output[i] = this.getStd(array.getCol(data, i));
            }
        } else if (type.equals("row")) {
            _output = new double[data.length];

            for(i = 0; i < data.length; ++i) {
                _output[i] = this.getStd(array.getRow(data, i));
            }
        } else {
            this.warning("Unknown type!");
        }
        return _output;
    }

    /* ========================================= Standard Deviation End ============================================= */

    /* ========================================= Sum Start ========================================================== */

    public int getSum(int[] data) {
        int _output = 0;
        for(int i = 0; i < data.length; ++i) {
            _output += data[i];
        }
        return _output;
    }

    public double getSum(double[] data) {
        double _output = 0.0;
        for(int i = 0; i < data.length; ++i) {
            _output += data[i];
        }
        return _output;
    }

    public int[] getSum(int[][] data, String mode) {
        int[] _output = null;
        int sum;
        int i;
        int j;
        if (mode.equals("col")) {
            _output = new int[data[0].length];
            for(i = 0; i < data[0].length; ++i) {
                sum = 0;

                for(j = 0; j < data.length; ++j) {
                    sum += data[j][i];
                }
                _output[i] = sum;
            }
        } else if (mode.equals("row")) {
            _output = new int[data.length];
            for(i = 0; i < data.length; ++i) {
                sum = 0;

                for(j = 0; j < data[0].length; ++j) {
                    sum += data[i][j];
                }
                _output[i] = sum;
            }
        } else {
            this.warning("Error in mode parameter!");
        }
        return _output;
    }

    public double[] getSum(double[][] data, String mode) {
        double[] _output = null;
        double sum;
        int i;
        int j;
        if (mode.equals("col")) {
            _output = new double[data[0].length];

            for(i = 0; i < data[0].length; ++i) {
                sum = 0.0;

                for(j = 0; j < data.length; ++j) {
                    sum += data[j][i];
                }

                _output[i] = sum;
            }
        } else if (mode.equals("row")) {
            _output = new double[data.length];

            for(i = 0; i < data.length; ++i) {
                sum = 0.0;

                for(j = 0; j < data[0].length; ++j) {
                    sum += data[i][j];
                }

                _output[i] = sum;
            }
        } else {
            this.warning("Error in mode parameter!");
        }
        return _output;
    }

    /* ========================================= Sum End ============================================================ */

    /* ========================================= Calculate Start ==================================================== */

    public int[] Calculate(int[] data, int point, String type) {
        int[] _output = null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            default:
                break;
            case 3:
                if (type.equals("-")) {
                    var6 = 1;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public double[] Calculate(double[] data, double point, String type) {
        double[] _output = null;
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var7 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var7 = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    var7 = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    var7 = 3;
                }
        }

        switch(var7) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            case 3:
                _output = this.division(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public int[] Calculate(int point, int[] data, String type) {
        int[] _output = null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            default:
                break;
            case 3:
                if (type.equals("-")) {
                    var6 = 1;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }
        return _output;
    }

    public double[] Calculate(double point, double[] data, String type) {
        double[] _output = null;
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var7 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var7 = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    var7 = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    var7 = 3;
                }
        }

        switch(var7) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            case 3:
                _output = this.division(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public int[] Calculate(int[] data, int[] point, String type) {
        int[] _output = null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            default:
                break;
            case 3:
                if (type.equals("-")) {
                    var6 = 1;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public double[] Calculate(double[] data, double[] point, String type) {
        double[] _output = null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    var6 = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    var6 = 3;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            case 3:
                _output = this.division(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public int[][] Calculate(int[][] data, int point, String type) {
        int[][] _output = (int[][])null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            default:
                break;
            case 3:
                if (type.equals("-")) {
                    var6 = 1;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public double[][] Calculate(double[][] data, double point, String type) {
        double[][] _output = (double[][])null;
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var7 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var7 = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    var7 = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    var7 = 3;
                }
        }

        switch(var7) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            case 3:
                _output = this.division(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public int[][] Calculate(int point, int[][] data, String type) {
        int[][] _output = (int[][])null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            default:
                break;
            case 3:
                if (type.equals("-")) {
                    var6 = 1;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public double[][] Calculate(double point, double[][] data, String type) {
        double[][] _output = (double[][])null;
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var7 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var7 = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    var7 = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    var7 = 3;
                }
        }
        switch(var7) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            case 3:
                _output = this.division(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public int[][] Calculate(int[][] data, int[] point, String type) {
        int[][] _output = (int[][])null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            default:
                break;
            case 3:
                if (type.equals("-")) {
                    var6 = 1;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public double[][] Calculate(double[][] data, double[] point, String type) {
        double[][] _output = (double[][])null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    var6 = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    var6 = 3;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            case 3:
                _output = this.division(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public int[][] Calculate(int[] point, int[][] data, String type) {
        int[][] _output = (int[][])null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            default:
                break;
            case 3:
                if (type.equals("-")) {
                    var6 = 1;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public double[][] Calculate(double[] point, double[][] data, String type) {
        double[][] _output = (double[][])null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    var6 = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    var6 = 3;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            case 3:
                _output = this.division(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public int[][] Calculate(int[][] data, int[][] point, String type) {
        int[][] _output = (int[][])null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            default:
                break;
            case 3:
                if (type.equals("-")) {
                    var6 = 1;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public double[][] Calculate(double[][] data, double[][] point, String type) {
        double[][] _output = (double[][])null;
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    var6 = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    var6 = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    var6 = 1;
                }
                break;
            case 47:
                if (type.equals("/")) {
                    var6 = 3;
                }
        }

        switch(var6) {
            case 0:
                _output = this.addition(data, point);
                break;
            case 1:
                _output = this.substraction(data, point);
                break;
            case 2:
                _output = this.scalarMultiplication(data, point);
                break;
            case 3:
                _output = this.division(data, point);
                break;
            default:
                this.warning("Type is not defined!");
        }

        return _output;
    }

    public int CalculateVector(int[] point, int[] data) {
        int _output = this.vectorMultiplication(data, point);
        return _output;
    }

    public double CalculateVector(double[] point, double[] data) {
        double _output = this.vectorMultiplication(data, point);
        return _output;
    }

    public int[] CalculateVector(int[] point, int[][] data) {
        int[] _output = this.vectorMultiplication(point, data);
        return _output;
    }

    public double[] CalculateVector(double[] point, double[][] data) {
        double[] _output = this.vectorMultiplication(point, data);
        return _output;
    }

    public int[] CalculateVector(int[][] point, int[] data) {
        int[] _output = this.vectorMultiplication(data, point);
        return _output;
    }

    public double[] CalculateVector(double[][] point, double[] data) {
        double[] _output = this.vectorMultiplication(data, point);
        return _output;
    }


    public int[][] CalculateVector(int[][] point, int[][] data) {
        int[][] _output = this.vectorMultiplication(point, data);
        return _output;
    }

    public double[][] CalculateVector(double[][] point, double[][] data) {
        double[][] _output = this.vectorMultiplication(point, data);
        return _output;
    }

    /* ========================================= Calculate Start ==================================================== */

    public double getRound(double data, int decimal_fraction) {
        String _format = "#.";
        for(int i = 0; i < decimal_fraction; ++i) {
            _format = _format + "#";
        }
        DecimalFormat _Form = new DecimalFormat(_format);
        _format = _Form.format(data).replace(",", ".");
        data = Double.parseDouble(_format);
        return data;
    }

    public int[] getMin(int[] data) {
        int[] _min = new int[]{data[0], 0};
        for(int i = 1; i < data.length; ++i) {
            if (data[i] < _min[0]) {
                _min[0] = data[i];
                _min[1] = i;
            }
        }
        return _min;
    }

    public double[] getMin(double[] data) {
        double[] _min = new double[]{data[0], 0.0};
        for(int i = 1; i < data.length; ++i) {
            if (data[i] < _min[0]) {
                _min[0] = data[i];
                _min[1] = (double)i;
            }
        }
        return _min;
    }

    public int[][] getMin(int[][] data) {
        int[][] _min = new int[2][data[0].length];

        for(int i = 0; i < data[0].length; ++i) {
            int[] _tmp = this.getMin(array.getCol(data, i));
            _min[0][i] = _tmp[0];
            _min[1][i] = _tmp[1];
        }

        return _min;
    }

    public double[][] getMin(double[][] data) {
        double[][] _min = new double[2][data[0].length];
        for(int i = 0; i < data[0].length; ++i) {
            double[] _tmp = this.getMin(array.getCol(data, i));
            _min[0][i] = _tmp[0];
            _min[1][i] = _tmp[1];
        }
        return _min;
    }

    public int[] getMax(int[] data) {
        int[] _max = new int[]{data[0], 0};
        for(int i = 1; i < data.length; ++i) {
            if (data[i] > _max[0]) {
                _max[0] = data[i];
                _max[1] = i;
            }
        }
        return _max;
    }

    public double[] getMax(double[] data) {
        double[] _max = new double[]{data[0], 0.0};
        for(int i = 1; i < data.length; ++i) {
            if (data[i] > _max[0]) {
                _max[0] = data[i];
                _max[1] = (double)i;
            }
        }
        return _max;
    }

    public int[][] getMax(int[][] data) {
        int[][] _max = new int[2][data[0].length];
        for(int i = 0; i < data[0].length; ++i) {
            int[] _tmp = this.getMax(array.getCol(data, i));
            _max[0][i] = _tmp[0];
            _max[1][i] = _tmp[1];
        }
        return _max;
    }

    public double[][] getMax(double[][] data) {
        double[][] _max = new double[2][data[0].length];
        for(int i = 0; i < data[0].length; ++i) {
            double[] _tmp = this.getMax(array.getCol(data, i));
            _max[0][i] = _tmp[0];
            _max[1][i] = _tmp[1];
        }
        return _max;
    }

    public int getFactorial(int n) {
        int factorial = 1;
        if (n < 1) {
            this.warning("N must be greater than zero!");
        } else {
            for(int i = ~(0 - (int)(1L + (long)n)); i > 1; --i) {
                factorial *= i;
            }
        }

        return factorial;
    }

    public int[][] getPerm(int n) {
        if (n > 10) {
            this.warning("Maximal n is 10");
        }

        int factorial = this.getFactorial(n);
        int[][] _perm = new int[factorial][n];
        PermutationGenerator _xx = new PermutationGenerator(n);

        for(int i = 0; _xx.hasMore(); ++i) {
            int[] _indices = _xx.getNext();
            System.arraycopy(_indices, 0, _perm[i], 0, n);
        }

        return _perm;
    }

    public int[] randPerm(int n) {
        int[] _randperm = new int[n];
        ArrayList _data = new ArrayList(n);

        int i;
        for(i = 0; i < n; ++i) {
            _data.add(new Integer(i));
        }

        Random random = new Random();

        for(i = 0; i < n; ++i) {
            int index = random.nextInt(_data.size());
            _randperm[i] = (Integer)_data.get(index);
            _data.remove(index);
        }

        return _randperm;
    }


}
