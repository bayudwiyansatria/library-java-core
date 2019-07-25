package com.bayudwiyansatria.mat;


import com.bayudwiyansatria.math.Calculation;
import com.bayudwiyansatria.utils.Utils;

public class Vector {

    private double getDistance_Absolute(double[] p1, double[] p2) {
        double jarak = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - p1[i];
            jarak += difference * difference;
        }
        return Math.sqrt(jarak);
    }

    private double getDistance_Absolute(int[] p1, double[] p2) {
        double jarak = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - (double)p1[i];
            jarak += difference * difference;
        }
        return Math.sqrt(jarak);
    }

    private double getDistance_Absolute(double[] p1, int[] p2) {
        double jarak = 0.0;

        for(int i = 0; i < p1.length; ++i) {
            double difference = (double)p2[i] - p1[i];
            jarak += difference * difference;
        }

        return Math.sqrt(jarak);
    }

    private double getDistance_Relative(double[] p1, double[] p2) {
        double jarak = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - p1[i];
            jarak += difference * difference;
        }
        return jarak;
    }

    private int getDistance_Relative(int[] p1, int[] p2) {
        int jarak = 0;
        for(int i = 0; i < p1.length; ++i) {
            int difference = p2[i] - p1[i];
            jarak += difference * difference;
        }
        return jarak;
    }

    private double getDistance_Relative(int[] p1, double[] p2) {
        double jarak = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - (double)p1[i];
            jarak += difference * difference;
        }
        return jarak;
    }

    private double getDistance_Relative(double[] p1, int[] p2) {
        double jarak = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = (double)p2[i] - p1[i];
            jarak += difference * difference;
        }
        return jarak;
    }

    public double getDistance(double[] p1, double[] p2, String type) {
        type = type.toLowerCase();
        double jarak = 0.0;
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("relative")) {
                    var7 = 1;
                }
                break;
            case 1:
                if (type.equals("absolute")) {
                    var7 = 0;
                }
        }

        switch(var7) {
            case 0:
                jarak = this.getDistance_Absolute(p1, p2);
                break;
            case 1:
                jarak = this.getDistance_Relative(p1, p2);
                break;
            default:
                new Utils().warning("Error distance type!");
        }
        return jarak;
    }

    public double getDistance(double[] p1, double[] p2) {
        double jarak = 0.0;
        jarak = this.getDistance(p1, p2, "absolute");
        return jarak;
    }

    public double getDistance(int[] p1, int[] p2) {
        double jarak = 0.0;
        jarak = this.getDistance(p1, p2, "absolute");
        return jarak;
    }

    public double getDistance(int[] p1, double[] p2) {
        double jarak = 0.0;
        jarak = this.getDistance(p1, p2, "absolute");
        return jarak;
    }

    public double getDistance(double[] p1, int[] p2) {
        double jarak = 0.0;
        jarak = this.getDistance(p1, p2, "absolute");
        return jarak;
    }

    public double getDistance(int[] p1, double[] p2, String type) {
        double jarak = 0.0;
        type = type.toLowerCase();
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("relative")) {
                    var7 = 1;
                }
                break;
            case 1:
                if (type.equals("absolute")) {
                    var7 = 0;
                }
        }

        switch(var7) {
            case 0:
                jarak = this.getDistance_Absolute(p1, p2);
                break;
            case 1:
                jarak = this.getDistance_Relative(p1, p2);
                break;
            default:
                new Utils().warning("Error distance type!");
        }

        return jarak;
    }

    public double getDistance(double[] p1, int[] p2, String type) {
        double jarak = 0.0;
        type = type.toLowerCase();
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("relative")) {
                    var7 = 1;
                }
                break;
            case 1:
                if (type.equals("absolute")) {
                    var7 = 0;
                }
        }

        switch(var7) {
            case 0:
                jarak = this.getDistance_Absolute(p1, p2);
                break;
            case 1:
                jarak = this.getDistance_Relative(p1, p2);
                break;
            default:
                new Utils().warning("Error distance type!");
        }
        return jarak;
    }

    private double getDistance_Absolute(int[] p1, int[] p2) {
        double jarak = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            int difference = p2[i] - p1[i];
            jarak += (double)(difference * difference);
        }
        return Math.sqrt(jarak);
    }

    public double getDistance(int[] p1, int[] p2, String type) {
        double jarak = 0.0;
        type = type.toLowerCase();
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("relative")) {
                    var7 = 1;
                }
                break;
            case 1:
                if (type.equals("absolute")) {
                    var7 = 0;
                }
        }

        switch(var7) {
            case 0:
                jarak = this.getDistance_Absolute(p1, p2);
                break;
            case 1:
                jarak = (double)this.getDistance_Relative(p1, p2);
                break;
            default:
                new Utils().warning("Error distance type!");
        }

        return jarak;
    }

    private double[] getDistance_Absolute(double[] p1, double[][] p2) {
        double[] jarak = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            jarak[i] = this.getDistance_Absolute(p1, p2[i]);
        }
        return jarak;
    }

    private double[] getDistance_Absolute(double[] p1, int[][] p2) {
        double[] jarak = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            jarak[i] = this.getDistance_Absolute(p1, p2[i]);
        }
        return jarak;
    }

    private double[] getDistance_Absolute(int[] p1, double[][] p2) {
        double[] jarak = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            jarak[i] = this.getDistance_Absolute(p1, p2[i]);
        }

        return jarak;
    }

    private double[] getDistance_Relative(double[] p1, double[][] p2) {
        double[] jarak = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            jarak[i] = this.getDistance_Relative(p1, p2[i]);
        }
        return jarak;
    }

    private double[] getDistance_Relative(int[] p1, double[][] p2) {
        double[] jarak = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            jarak[i] = this.getDistance_Relative(p1, p2[i]);
        }

        return jarak;
    }

    private double[] getDistance_Relative(double[] p1, int[][] p2) {
        double[] jarak = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            jarak[i] = this.getDistance_Relative(p1, p2[i]);
        }

        return jarak;
    }

    public double[] getDistance(double[] p1, double[][] p2, String type) {
        type = type.toLowerCase();
        double[] jarak = new double[p2.length];
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("relative")) {
                    var7 = 1;
                }
                break;
            case 1:
                if (type.equals("absolute")) {
                    var7 = 0;
                }
        }

        switch(var7) {
            case 0:
                jarak = this.getDistance_Absolute(p1, p2);
                break;
            case 1:
                jarak = this.getDistance_Relative(p1, p2);
                break;
            default:
                new Utils().warning("Error distance type!");
        }

        return jarak;
    }

    public double[] getDistance(int[] p1, double[][] p2, String type) {
        type = type.toLowerCase();
        double[] jarak = new double[p2.length];
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("relative")) {
                    var7 = 1;
                }
                break;
            case 1:
                if (type.equals("absolute")) {
                    var7 = 0;
                }
        }

        switch(var7) {
            case 0:
                jarak = this.getDistance_Absolute(p1, p2);
                break;
            case 1:
                jarak = this.getDistance_Relative(p1, p2);
                break;
            default:
                new Utils().warning("Error distance type!");
        }

        return jarak;
    }

    public double[] getDistance(double[] p1, int[][] p2, String type) {
        type = type.toLowerCase();
        double[] jarak = new double[p2.length];
        byte var7 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("relative")) {
                    var7 = 1;
                }
                break;
            case 1:
                if (type.equals("absolute")) {
                    var7 = 0;
                }
        }

        switch(var7) {
            case 0:
                jarak = this.getDistance_Absolute(p1, p2);
                break;
            case 1:
                jarak = this.getDistance_Relative(p1, p2);
                break;
            default:
                new Utils().warning("Error distance type!");
        }

        return jarak;
    }

    private double[] getDistance_Absolute(int[] p1, int[][] p2) {
        double[] jarak = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            jarak[i] = this.getDistance_Absolute(p1, p2[i]);
        }

        return jarak;
    }

    private double[] getDistance_Relative(int[] p1, int[][] p2) {
        double[] jarak = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            jarak[i] = (double)this.getDistance_Relative(p1, p2[i]);
        }
        return jarak;
    }

    public double[] getDistance(int[] p1, int[][] p2, String type) {
        double[] jarak = new double[p2.length];
        type = type.toLowerCase();
        byte var6 = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("relative")) {
                    var6 = 1;
                }
                break;
            case 1:
                if (type.equals("absolute")) {
                    var6 = 0;
                }
        }

        switch(var6) {
            case 0:
                jarak = this.getDistance_Absolute(p1, p2);
                break;
            case 1:
                jarak = this.getDistance_Relative(p1, p2);
                break;
            default:
                new Utils().warning("Error distance type!");
        }

        return jarak;
    }

    public double[] getDistance(int[] p1, int[][] p2) {
        double[] jarak = new double[p2.length];
        jarak = this.getDistance(p1, p2, "absolute");
        return jarak;
    }

    public double[] getDistance(int[] p1, double[][] p2) {
        double[] jarak = new double[p2.length];
        jarak = this.getDistance(p1, p2, "absolute");
        return jarak;
    }

    public double[] getDistance(double[] p1, int[][] p2) {
        double[] jarak = new double[p2.length];
        jarak = this.getDistance(p1, p2, "absolute");
        return jarak;
    }

    public double[] getDistance(double[] p1, double[][] p2) {
        double[] jarak = new double[p2.length];
        jarak = this.getDistance(p1, p2, "absolute");
        return jarak;
    }

    public double[] getMinDistance_Relative(double[] p1, double[][] p2) {
        double[] _min = new double[]{this.getDistance_Relative(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double jarak = this.getDistance_Relative(p1, p2[i]);
            if (jarak < _min[0]) {
                _min[0] = jarak;
                _min[1] = (double)i;
            }
        }

        return _min;
    }

    public double[] getMinDistance_Relative(int[] p1, int[][] p2) {
        double[] _min = new double[]{(double)this.getDistance_Relative(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double jarak = (double)this.getDistance_Relative(p1, p2[i]);
            if (jarak < _min[0]) {
                _min[0] = jarak;
                _min[1] = (double)i;
            }
        }

        return _min;
    }

    public double[] getMinDistance_Relative(int[] p1, double[][] p2) {
        double[] _min = new double[]{this.getDistance_Relative(p1, p2[0]), 0.0};

        for(int i = 1; i < p2.length; ++i) {
            double jarak = this.getDistance_Relative(p1, p2[i]);
            if (jarak < _min[0]) {
                _min[0] = jarak;
                _min[1] = (double)i;
            }
        }

        return _min;
    }

    public double[] getMinDistance_Absolute(double[] p1, double[][] p2) {
        double[] _min = new double[]{this.getDistance_Absolute(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double jarak = this.getDistance_Absolute(p1, p2[i]);
            if (jarak < _min[0]) {
                _min[0] = jarak;
                _min[1] = (double)i;
            }
        }

        return _min;
    }

    public double[] getMinDistance_Absolute(int[] p1, int[][] p2) {
        double[] _min = new double[]{this.getDistance_Absolute(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double jarak = this.getDistance_Absolute(p1, p2[i]);
            if (jarak < _min[0]) {
                _min[0] = jarak;
                _min[1] = (double)i;
            }
        }

        return _min;
    }

    public double[] getMinDistance_Absolute(int[] p1, double[][] p2) {
        double[] _min = new double[]{this.getDistance_Absolute(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double jarak = this.getDistance_Absolute(p1, p2[i]);
            if (jarak < _min[0]) {
                _min[0] = jarak;
                _min[1] = (double)i;
            }
        }
        return _min;
    }

    public int[][] transposeMatrix(int[][] data) {
        int rows = data.length;
        int cols = data[0].length;
        int[][] _hasil = new int[cols][rows];

        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                _hasil[j][i] = data[i][j];
            }
        }
        return _hasil;
    }

    public double[][] transposeMatrix(double[][] data) {
        int rows = data.length;
        int cols = data[0].length;
        double[][] _hasil = new double[cols][rows];
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                _hasil[j][i] = data[i][j];
            }
        }
        return _hasil;
    }

    public String[][] transposeMatrix(String[][] data) {
        String[][] matrix = new String[data[0].length][data.length];
        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[0].length; ++j) {
                matrix[j][i] = data[i][j];
            }
        }
        return matrix;
    }

    public double[][] reshapeMatrix(double[] in, int col, int row) {
        int lcol = in.length;
        int lrow = 1;
        int ncol = col * lcol;
        int nrow = row * lrow;
        double[][] res = new double[nrow][ncol];

        for(int c1 = 0; c1 < nrow; ++c1) {
            for(int c2 = 0; c2 < ncol; ++c2) {
                res[c1][c2] = in[c2 % lcol];
            }
        }

        return res;
    }

    public String[][] reshapeMatrix(String[][] in, int col, int row) {
        int lrow = in.length;
        int lcol = in[0].length;
        int ncol = col * lcol;
        int nrow = row * lrow;
        String[][] res = new String[nrow][ncol];

        for(int c1 = 0; c1 < nrow; ++c1) {
            for(int c2 = 0; c2 < ncol; ++c2) {
                res[c1][c2] = in[c1 % lrow][c2 % lcol];
            }
        }

        return res;
    }

    public String[][] reshapeMatrix(String[] in, int col, int row) {
        int lcol = in.length;
        int lrow = 1;
        int ncol = col * lcol;
        int nrow = row * lrow;
        String[][] res = new String[nrow][ncol];

        for(int c1 = 0; c1 < nrow; ++c1) {
            for(int c2 = 0; c2 < ncol; ++c2) {
                res[c1][c2] = in[c2 % lcol];
            }
        }

        return res;
    }

    public int[][] reshapeMatrix(int[][] in, int col, int row) {
        int lrow = in.length;
        int lcol = in[0].length;
        int ncol = col * lcol;
        int nrow = row * lrow;
        int[][] res = new int[nrow][ncol];

        for(int c1 = 0; c1 < nrow; ++c1) {
            for(int c2 = 0; c2 < ncol; ++c2) {
                res[c1][c2] = in[c1 % lrow][c2 % lcol];
            }
        }

        return res;
    }

    public double[][] reshapeMatrix(double[][] in, int col, int row) {
        int lrow = in.length;
        int lcol = in[0].length;
        int ncol = col * lcol;
        int nrow = row * lrow;
        double[][] res = new double[nrow][ncol];

        for(int c1 = 0; c1 < nrow; ++c1) {
            for(int c2 = 0; c2 < ncol; ++c2) {
                res[c1][c2] = in[c1 % lrow][c2 % lcol];
            }
        }

        return res;
    }

    public int[][] reshapeMatrix(int[] in, int col, int row) {
        int lcol = in.length;
        int lrow = 1;
        int ncol = col * lcol;
        int nrow = row * lrow;
        int[][] res = new int[nrow][ncol];

        for(int c1 = 0; c1 < nrow; ++c1) {
            for(int c2 = 0; c2 < ncol; ++c2) {
                res[c1][c2] = in[c2 % lcol];
            }
        }

        return res;
    }

    public double[][] getDistanceMetric(double[][] data) {
        double[][] _metrikjarak = new double[data.length - 1][];

        for(int i = 0; i < data.length - 1; ++i) {

                _metrikjarak[i] = new double[i + 1];


            for(int j = 0; j <= i; ++j) {
                _metrikjarak[i][j] = this.getDistance_Relative(data[i + 1], data[j]);
            }
        }

        return _metrikjarak;
    }

    public double[][] getDistanceMetric(int[][] data) {
        double[][] _metrikjarak = new double[data.length - 1][];

        for(int i = 0; i < data.length - 1; ++i) {

                _metrikjarak[i] = new double[i + 1];

            for(int j = 0; j <= i; ++j) {
                _metrikjarak[i][j] = (double)this.getDistance_Relative(data[i + 1], data[j]);
            }
        }

        return _metrikjarak;
    }
}
