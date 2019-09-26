package com.bayudwiyansatria.math;

public class Calculation {

    /* ========================================= Addition Start ======================================================*/

    public int[] addition(int[] inA, int inB) {
        int l1 = inA.length;
        int[] res = new int[l1];

        for(int c1 = 0; c1 < l1; ++c1) {
            res[c1] = inA[c1] + inB;
        }
        return res;
    }

    double[] addition(double[] inA, double inB) {
        int l1 = inA.length;
        double[] res = new double[l1];
        for(int c1 = 0; c1 < l1; ++c1) {
            res[c1] = inA[c1] + inB;
        }
        return res;
    }

    int[] addition(int[] inA, int[] inB) {
        int l1 = inA.length;
        int[] res = new int[l1];
        if (inA.length == inB.length) {
            for(int c1 = 0; c1 < l1; ++c1) {
                res[c1] = inA[c1] + inB[c1];
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    double[] addition(double[] inA, double[] inB) {
        int l1 = inA.length;
        int l2 = inB.length;
        double[] res = new double[l1];
        if (l1 == l2) {
            for(int c1 = 0; c1 < l1; ++c1) {
                res[c1] = inA[c1] + inB[c1];
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    int[][] addition(int[][] inA, int inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        int[][] res = new int[l1][l2];

        for(int c1 = 0; c1 < l1; ++c1) {
            for(int c2 = 0; c2 < l2; ++c2) {
                res[c1][c2] = inA[c1][c2] + inB;
            }
        }

        return res;
    }

    double[][] addition(double[][] inA, double inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        double[][] res = new double[l1][l2];

        for(int c1 = 0; c1 < l1; ++c1) {
            for(int c2 = 0; c2 < l2; ++c2) {
                res[c1][c2] = inA[c1][c2] + inB;
            }
        }

        return res;
    }

    int[][] addition(int[][] inA, int[] inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        int l3 = inB.length;
        int[][] res = new int[l1][l2];
        if (l2 == l3) {
            for(int c1 = 0; c1 < l1; ++c1) {
                for(int c2 = 0; c2 < l2; ++c2) {
                    res[c1][c2] = inA[c1][c2] + inB[c2];
                }
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    double[][] addition(double[][] inA, double[] inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        int l3 = inB.length;
        double[][] res = new double[l1][l2];
        if (l2 == l3) {
            for(int c1 = 0; c1 < l1; ++c1) {
                for(int c2 = 0; c2 < l2; ++c2) {
                    res[c1][c2] = inA[c1][c2] + inB[c2];
                }
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    int[][] addition(int[][] inA, int[][] inB) {
        int col1 = inA[0].length;
        int col2 = inB[0].length;
        int row1 = inA.length;
        int row2 = inB.length;
        int[][] res = (int[][])null;
        int c1;
        int c2;
        if (col1 == 1) {
            if (row1 == row2) {
                res = new int[row2][col2];

                for(c1 = 0; c1 < row2; ++c1) {
                    for(c2 = 0; c2 < col2; ++c2) {
                        res[c1][c2] = inB[c1][c2] + inA[c1][0];
                    }
                }
            } else {
                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else if (col2 == 1) {
            if (row1 == row2) {
                res = new int[row1][col1];

                for(c1 = 0; c1 < row1; ++c1) {
                    for(c2 = 0; c2 < col1; ++c2) {
                        res[c1][c2] = inA[c1][c2] + inB[c1][0];
                    }
                }
            } else {
                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else {
            res = new int[row1][col1];

            for(c1 = 0; c1 < row1; ++c1) {
                for(c2 = 0; c2 < col1; ++c2) {
                    res[c1][c2] = inA[c1][c2] + inB[c1][c2];
                }
            }
        }

        return res;
    }

    double[][] addition(double[][] inA, double[][] inB) {
        int col1 = inA[0].length;
        int col2 = inB[0].length;
        int row1 = inA.length;
        int row2 = inB.length;
        double[][] res = (double[][])null;
        int c1;
        int c2;
        if (col1 == 1) {
            if (row1 == row2) {
                res = new double[row2][col2];

                for(c1 = 0; c1 < row2; ++c1) {
                    for(c2 = 0; c2 < col2; ++c2) {
                        res[c1][c2] = inB[c1][c2] + inA[c1][0];
                    }
                }
            } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else if (col2 == 1) {
            if (row1 == row2) {
                res = new double[row1][col1];

                for(c1 = 0; c1 < row1; ++c1) {
                    for(c2 = 0; c2 < col1; ++c2) {
                        res[c1][c2] = inA[c1][c2] + inB[c1][0];
                    }
                }
            } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else {
            res = new double[row1][col1];

            for(c1 = 0; c1 < row1; ++c1) {
                for(c2 = 0; c2 < col1; ++c2) {
                    res[c1][c2] = inA[c1][c2] + inB[c1][c2];
                }
            }
        }

        return res;
    }

    /* ========================================= Addition End ========================================================*/

    /* ========================================= Substraction Start ==================================================*/

    double[] substraction(double[] inA, double inB) {
        int l1 = inA.length;
        double[] res = new double[l1];

        for(int c1 = 0; c1 < l1; ++c1) {
            res[c1] = inA[c1] - inB;
        }

        return res;
    }

    double[] substraction(double[] inA, double[] inB) {
        int l1 = inA.length;
        int l2 = inB.length;
        double[] res = new double[l1];
        if (l1 == l2) {
            for(int c1 = 0; c1 < l1; ++c1) {
                res[c1] = inA[c1] - inB[c1];
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix. It has to be same");
        }

        return res;
    }

    double[][] substraction(double[][] inA, double inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        double[][] res = new double[l1][l2];

        for(int c1 = 0; c1 < l1; ++c1) {
            for(int c2 = 0; c2 < l2; ++c2) {
                res[c1][c2] = inA[c1][c2] - inB;
            }
        }

        return res;
    }

    double[][] substraction(double[][] inA, double[] inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        int l3 = inB.length;
        double[][] res = new double[l1][l2];
        if (l3 == l2) {
            for(int c1 = 0; c1 < l1; ++c1) {
                for(int c2 = 0; c2 < l2; ++c2) {
                    res[c1][c2] = inA[c1][c2] - inB[c2];
                }
            }
        } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    double[][] substraction(double[][] inA, double[][] inB) {
        int col1 = inA[0].length;
        int col2 = inB[0].length;
        int row1 = inA.length;
        int row2 = inB.length;
        double[][] res = (double[][])null;
        int c1;
        int c2;
        if (col1 == 1) {
            if (row1 == row2) {
                res = new double[row2][col2];

                for(c1 = 0; c1 < row2; ++c1) {
                    for(c2 = 0; c2 < col2; ++c2) {
                        res[c1][c2] = inB[c1][c2] - inA[c1][0];
                    }
                }
            } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else if (col2 == 1) {
            if (row1 == row2) {
                res = new double[row1][col1];

                for(c1 = 0; c1 < row1; ++c1) {
                    for(c2 = 0; c2 < col1; ++c2) {
                        res[c1][c2] = inA[c1][c2] - inB[c1][0];
                    }
                }
            }


                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        } else {
            res = new double[row1][col1];

            for(c1 = 0; c1 < row1; ++c1) {
                for(c2 = 0; c2 < col1; ++c2) {
                    res[c1][c2] = inA[c1][c2] - inB[c1][c2];
                }
            }
        }

        return res;
    }

    public int[] substraction(int[] inA, int inB) {
        int l1 = inA.length;
        int[] res = new int[l1];

        for(int c1 = 0; c1 < l1; ++c1) {
            res[c1] = inA[c1] - inB;
        }

        return res;
    }

    int[] substraction(int[] inA, int[] inB) {
        int l1 = inA.length;
        int[] res = new int[l1];
        if (inA.length == inB.length) {
            for(int c1 = 0; c1 < l1; ++c1) {
                res[c1] = inA[c1] - inB[c1];
            }
        } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    int[][] substraction(int[][] inA, int inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        int[][] res = new int[l1][l2];

        for(int c1 = 0; c1 < l1; ++c1) {
            for(int c2 = 0; c2 < l2; ++c2) {
                res[c1][c2] = inA[c1][c2] - inB;
            }
        }

        return res;
    }

    int[][] substraction(int[][] inA, int[] inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        int l3 = inB.length;
        int[][] res = new int[l1][l2];
        if (l2 == l3) {
            for(int c1 = 0; c1 < l1; ++c1) {
                for(int c2 = 0; c2 < l2; ++c2) {
                    res[c1][c2] = inA[c1][c2] - inB[c2];
                }
            }
        } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    int[][] substraction(int[][] inA, int[][] inB) {
        int col1 = inA[0].length;
        int col2 = inB[0].length;
        int row1 = inA.length;
        int row2 = inB.length;
        int[][] res = (int[][])null;
        int c1;
        int c2;
        if (col1 == 1) {
            if (row1 == row2) {
                res = new int[row2][col2];

                for(c1 = 0; c1 < row2; ++c1) {
                    for(c2 = 0; c2 < col2; ++c2) {
                        res[c1][c2] = inB[c1][c2] - inA[c1][0];
                    }
                }
            } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else if (col2 == 1) {
            if (row1 == row2) {
                res = new int[row1][col1];

                for(c1 = 0; c1 < row1; ++c1) {
                    for(c2 = 0; c2 < col1; ++c2) {
                        res[c1][c2] = inA[c1][c2] - inB[c1][0];
                    }
                }
            } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else {
            res = new int[row1][col1];

            for(c1 = 0; c1 < row1; ++c1) {
                for(c2 = 0; c2 < col1; ++c2) {
                    res[c1][c2] = inA[c1][c2] - inB[c1][c2];
                }
            }
        }

        return res;
    }

    double[] division(double[] inA, double inB) {
        int l1 = inA.length;
        double[] res = new double[l1];

        for(int c1 = 0; c1 < l1; ++c1) {
            res[c1] = inA[c1] / inB;
        }

        return res;
    }

    double[] division(double[] inA, double[] inB) {
        int l1 = inA.length;
        int l2 = inB.length;
        double[] res = new double[l1];
        if (l1 == l2) {
            for(int c1 = 0; c1 < l1; ++c1) {
                res[c1] = inA[c1] / inB[c1];
            }
        } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    double[][] division(double[][] inA, double inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        double[][] res = new double[l1][l2];

        for(int c1 = 0; c1 < l1; ++c1) {
            for(int c2 = 0; c2 < l2; ++c2) {
                res[c1][c2] = inA[c1][c2] / inB;
            }
        }

        return res;
    }

    double[][] division(double[][] inA, double[] inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        int l3 = inB.length;
        double[][] res = new double[l1][l2];
        if (l2 == l3) {
            for(int c1 = 0; c1 < l1; ++c1) {
                for(int c2 = 0; c2 < l2; ++c2) {
                    res[c1][c2] = inA[c1][c2] / inB[c2];
                }
            }
        } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    double[][] division(double[][] inA, double[][] inB) {
        int col1 = inA[0].length;
        int col2 = inB[0].length;
        int row1 = inA.length;
        int row2 = inB.length;
        double[][] res = (double[][])null;
        int c1;
        int c2;
        if (col1 == 1) {
            if (row1 == row2) {
                res = new double[row2][col2];

                for(c1 = 0; c1 < row2; ++c1) {
                    for(c2 = 0; c2 < col2; ++c2) {
                        res[c1][c2] = inB[c1][c2] / inA[c1][0];
                    }
                }
            } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else if (col2 == 1) {
            if (row1 == row2) {
                res = new double[row1][col1];

                for(c1 = 0; c1 < row1; ++c1) {
                    for(c2 = 0; c2 < col1; ++c2) {
                        res[c1][c2] = inA[c1][c2] / inB[c1][0];
                    }
                }
            } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else {
            res = new double[row1][col1];

            for(c1 = 0; c1 < row1; ++c1) {
                for(c2 = 0; c2 < col1; ++c2) {
                    res[c1][c2] = inA[c1][c2] / inB[c1][c2];
                }
            }
        }

        return res;
    }

    double[] division(int[] inA, int inB) {
        int l1 = inA.length;
        double[] res = new double[l1];

        for(int c1 = 0; c1 < l1; ++c1) {
            res[c1] = (double)(inA[c1] / inB);
        }

        return res;
    }

    double[] division(int[] inA, int[] inB) {
        int l1 = inA.length;
        double[] res = new double[l1];
        if (inA.length == inB.length) {
            for(int c1 = 0; c1 < l1; ++c1) {
                res[c1] = (double)(inA[c1] / inB[c1]);
            }
        } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    double[][] division(int[][] inA, int inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        double[][] res = new double[l1][l2];

        for(int c1 = 0; c1 < l1; ++c1) {
            for(int c2 = 0; c2 < l2; ++c2) {
                res[c1][c2] = (double)(inA[c1][c2] / inB);
            }
        }

        return res;
    }

    double[][] division(int[][] inA, int[] inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        int l3 = inB.length;
        double[][] res = new double[l1][l2];
        if (l2 == l3) {
            for(int c1 = 0; c1 < l1; ++c1) {
                for(int c2 = 0; c2 < l2; ++c2) {
                    res[c1][c2] = (double)(inA[c1][c2] / inB[c2]);
                }
            }
        } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
        }

        return res;
    }

    double[][] division(int[][] inA, int[][] inB) {
        int col1 = inA[0].length;
        int col2 = inB[0].length;
        int row1 = inA.length;
        int row2 = inB.length;
        double[][] res = (double[][])null;
        int c1;
        int c2;
        if (col1 == 1) {
            if (row1 == row2) {
                res = new double[row2][col2];

                for(c1 = 0; c1 < row2; ++c1) {
                    for(c2 = 0; c2 < col2; ++c2) {
                        res[c1][c2] = (double)(inB[c1][c2] / inA[c1][0]);
                    }
                }
            } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else if (col2 == 1) {
            if (row1 == row2) {
                res = new double[row1][col1];

                for(c1 = 0; c1 < row1; ++c1) {
                    for(c2 = 0; c2 < col1; ++c2) {
                        res[c1][c2] = (double)(inA[c1][c2] / inB[c1][0]);
                    }
                }
            } else {

                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrix");
            }
        } else {
            res = new double[row1][col1];

            for(c1 = 0; c1 < row1; ++c1) {
                for(c2 = 0; c2 < col1; ++c2) {
                    res[c1][c2] = (double)(inA[c1][c2] / inB[c1][c2]);
                }
            }
        }

        return res;
    }

    public int[] Calculate(int[] data, int point, String type) {
        int[] output = null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public double[] Calculate(double[] data, double point, String type) {
        double[] output = null;
        byte bytes = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    bytes = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    bytes = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    bytes = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    bytes = 3;
                }
        }

        switch(bytes) {
            case 0:
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            case 3:
                output = this.division(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public int[] Calculate(int point, int[] data, String type) {
        int[] output = null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }
        return output;
    }

    public double[] Calculate(double point, double[] data, String type) {
        double[] output = null;
        byte bytes = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    bytes = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    bytes = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    bytes = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    bytes = 3;
                }
        }

        switch(bytes) {
            case 0:
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            case 3:
                output = this.division(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public int[] Calculate(int[] data, int[] point, String type) {
        int[] output = null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public double[] Calculate(double[] data, double[] point, String type) {
        double[] output = null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            case 3:
                output = this.division(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public int[][] Calculate(int[][] data, int point, String type) {
        int[][] output = (int[][])null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public double[][] Calculate(double[][] data, double point, String type) {
        double[][] output = (double[][])null;
        byte bytes = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    bytes = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    bytes = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    bytes = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    bytes = 3;
                }
        }

        switch(bytes) {
            case 0:
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            case 3:
                output = this.division(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public int[][] Calculate(int point, int[][] data, String type) {
        int[][] output = (int[][])null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public double[][] Calculate(double point, double[][] data, String type) {
        double[][] output = (double[][])null;
        byte bytes = -1;
        switch(type.hashCode()) {
            case 0:
                if (type.equals("*")) {
                    bytes = 2;
                }
                break;
            case 1:
                if (type.equals("+")) {
                    bytes = 0;
                }
            case 2:
            case 3:
            default:
                break;
            case 4:
                if (type.equals("-")) {
                    bytes = 1;
                }
                break;
            case 5:
                if (type.equals("/")) {
                    bytes = 3;
                }
        }
        switch(bytes) {
            case 0:
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            case 3:
                output = this.division(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public int[][] Calculate(int[][] data, int[] point, String type) {
        int[][] output = (int[][])null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public double[][] Calculate(double[][] data, double[] point, String type) {
        double[][] output = (double[][])null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            case 3:
                output = this.division(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public int[][] Calculate(int[] point, int[][] data, String type) {
        int[][] output = (int[][])null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public double[][] Calculate(double[] point, double[][] data, String type) {
        double[][] output = (double[][])null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            case 3:
                output = this.division(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public int[][] Calculate(int[][] data, int[][] point, String type) {
        int[][] output = (int[][])null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public double[][] Calculate(double[][] data, double[][] point, String type) {
        double[][] output = (double[][])null;
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
                output = this.addition(data, point);
                break;
            case 1:
                output = this.substraction(data, point);
                break;
            case 2:
                output = this.scalarMultiplication(data, point);
                break;
            case 3:
                output = this.division(data, point);
                break;
            default:
                new com.bayudwiyansatria.utils.Utils().warning("Type is not defined!");
        }

        return output;
    }

    public int CalculateVector(int[] point, int[] data) {
        int output = this.vectorMultiplication(data, point);
        return output;
    }

    public double CalculateVector(double[] point, double[] data) {
        double output = this.vectorMultiplication(data, point);
        return output;
    }

    public int[] CalculateVector(int[] point, int[][] data) {
        int[] output = this.vectorMultiplication(point, data);
        return output;
    }

    public double[] CalculateVector(double[] point, double[][] data) {
        double[] output = this.vectorMultiplication(point, data);
        return output;
    }

    public int[] CalculateVector(int[][] point, int[] data) {
        int[] output = this.vectorMultiplication(data, point);
        return output;
    }

    public double[] CalculateVector(double[][] point, double[] data) {
        double[] output = this.vectorMultiplication(data, point);
        return output;
    }


    public int[][] CalculateVector(int[][] point, int[][] data) {
        int[][] output = this.vectorMultiplication(point, data);
        return output;
    }

    public double[][] CalculateVector(double[][] point, double[][] data) {
        double[][] output = this.vectorMultiplication(point, data);
        return output;
    }

    /* ========================================= Calculate Start ==================================================== */

    double[] scalarMultiplication(double[] inA, double inB) {
        int l1 = inA.length;
        double[] res = new double[l1];

        for(int c1 = 0; c1 < l1; ++c1) {
            res[c1] = inA[c1] * inB;
        }

        return res;
    }

    double[] scalarMultiplication(double[] inA, double[] inB) {
        int l1 = inA.length;
        int l2 = inB.length;
        double[] res = null;
        if (l1 == l2) {
            res = new double[l1];

            for(int c1 = 0; c1 < l1; ++c1) {
                res[c1] = inA[c1] * inB[c1];
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
        }

        return res;
    }

    double[][] scalarMultiplication(double[][] inA, double inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        double[][] res = new double[l1][l2];

        for(int c1 = 0; c1 < l1; ++c1) {
            for(int c2 = 0; c2 < l2; ++c2) {
                res[c1][c2] = inA[c1][c2] * inB;
            }
        }

        return res;
    }

    double[][] scalarMultiplication(double[][] inA, double[] inB) {
        int l1 = inB.length;
        int l2 = inA.length;
        int l3 = inA[0].length;
        double[][] res = (double[][])null;
        if (l1 == l3) {
            res = new double[l2][l3];

            for(int c1 = 0; c1 < l2; ++c1) {
                for(int c2 = 0; c2 < l3; ++c2) {
                    res[c1][c2] = inB[c2] * inA[c1][c2];
                }
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
        }

        return res;
    }

    double[][] scalarMultiplication(double[][] inA, double[][] inB) {
        int col1 = inA[0].length;
        int col2 = inB[0].length;
        int row1 = inA.length;
        int row2 = inB.length;
        double[][] res = (double[][])null;
        int c1;
        int c2;
        if (col1 == 1) {
            if (row1 == row2) {
                res = new double[row2][col2];

                for(c1 = 0; c1 < row2; ++c1) {
                    for(c2 = 0; c2 < col2; ++c2) {
                        res[c1][c2] = inB[c1][c2] * inA[c1][0];
                    }
                }
            } else {
                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
            }
        } else if (col2 == 1) {
            if (row1 == row2) {
                res = new double[row1][col1];

                for(c1 = 0; c1 < row1; ++c1) {
                    for(c2 = 0; c2 < col1; ++c2) {
                        res[c1][c2] = inA[c1][c2] * inB[c1][0];
                    }
                }
            } else {
                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
            }
        } else {
            res = new double[row1][col1];

            for(c1 = 0; c1 < row1; ++c1) {
                for(c2 = 0; c2 < col1; ++c2) {
                    res[c1][c2] = inA[c1][c2] * inB[c1][c2];
                }
            }
        }

        return res;
    }

    int[] scalarMultiplication(int[] inA, int inB) {
        int l1 = inA.length;
        int[] res = new int[l1];

        for(int c1 = 0; c1 < l1; ++c1) {
            res[c1] = inA[c1] * inB;
        }

        return res;
    }

    int[] scalarMultiplication(int[] inA, int[] inB) {
        int l1 = inA.length;
        int l2 = inB.length;
        int[] res = null;
        if (l1 == l2) {
            res = new int[l1];

            for(int c1 = 0; c1 < l1; ++c1) {
                res[c1] = inA[c1] * inB[c1];
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
        }

        return res;
    }

    int[][] scalarMultiplication(int[][] inA, int inB) {
        int l1 = inA.length;
        int l2 = inA[0].length;
        int[][] res = new int[l1][l2];

        for(int c1 = 0; c1 < l1; ++c1) {
            for(int c2 = 0; c2 < l2; ++c2) {
                res[c1][c2] = inA[c1][c2] * inB;
            }
        }

        return res;
    }

    int[][] scalarMultiplication(int[][] inA, int[] inB) {
        int l1 = inB.length;
        int l2 = inA.length;
        int l3 = inA[0].length;
        int[][] res = (int[][])null;
        if (l1 == l3) {
            res = new int[l2][l3];

            for(int c1 = 0; c1 < l2; ++c1) {
                for(int c2 = 0; c2 < l3; ++c2) {
                    res[c1][c2] = inB[c2] * inA[c1][c2];
                }
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
        }

        return res;
    }

    int[][] scalarMultiplication(int[][] inA, int[][] inB) {
        int col1 = inA[0].length;
        int col2 = inB[0].length;
        int row1 = inA.length;
        int row2 = inB.length;
        int[][] res = (int[][])null;
        int c1;
        int c2;
        if (col1 == 1) {
            if (row1 == row2) {
                res = new int[row2][col2];

                for(c1 = 0; c1 < row2; ++c1) {
                    for(c2 = 0; c2 < col2; ++c2) {
                        res[c1][c2] = inB[c1][c2] * inA[c1][0];
                    }
                }
            } else {
                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
            }
        } else if (col2 == 1) {
            if (row1 == row2) {
                res = new int[row1][col1];

                for(c1 = 0; c1 < row1; ++c1) {
                    for(c2 = 0; c2 < col1; ++c2) {
                        res[c1][c2] = inA[c1][c2] * inB[c1][0];
                    }
                }
            } else {
                new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
            }
        } else {
            res = new int[row1][col1];

            for(c1 = 0; c1 < row1; ++c1) {
                for(c2 = 0; c2 < col1; ++c2) {
                    res[c1][c2] = inA[c1][c2] * inB[c1][c2];
                }
            }
        }

        return res;
    }

    double[] vectorMultiplication(double[] inA, double[][] inB) {
        double[] res = null;
        int colB = inB[0].length;
        int colA = inA.length;
        boolean rowA = true;
        int rowB = inB.length;
        int count = colA;
        if (colA == rowB) {
            res = new double[colB];

            for(int c2 = 0; c2 < colB; ++c2) {
                int c1 = 0;

                for(res[c2] = 0.0; c1 < count; ++c1) {
                    res[c2] += inA[c1] * inB[c1][c2];
                }
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
        }

        return res;
    }

    double[][] vectorMultiplication(double[][] inA, double[][] inB) {
        double[][] res = (double[][])null;
        int colA = inA[0].length;
        int rowA = inA.length;
        int colB = inB[0].length;
        int rowB = inB.length;
        int count = colA;
        if (colA == rowB) {
            res = new double[rowA][colB];

            for(int c1 = 0; c1 < rowA; ++c1) {
                for(int c2 = 0; c2 < colB; ++c2) {
                    for(int c3 = 0; c3 < count; ++c3) {
                        res[c1][c2] += inA[c1][c3] * inB[c3][c2];
                    }
                }
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
        }

        return res;
    }

    int vectorMultiplication(int[] inA, int[] inB) {
        int nb = inB.length;
        int output = 0;
        if (inA.length == nb) {
            for(int i = 0; i < inA.length; ++i) {
                output += inA[i] * inB[i];
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Length of both data has to be same!");
        }

        return output;
    }

    double vectorMultiplication(double[] inA, double[] inB) {
        int nb = inB.length;
        double output = 0.0;
        if (inA.length == nb) {
            for(int i = 0; i < inA.length; ++i) {
                output += inA[i] * inB[i];
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Length of both data has to be same!");
        }

        return output;
    }

    int[] vectorMultiplication(int[] inA, int[][] inB) {
        int[] res = null;
        int colB = inB[0].length;
        int colA = inA.length;
        boolean rowA = true;
        int rowB = inB.length;
        int count = colA;
        if (colA == rowB) {
            res = new int[colB];

            for(int c2 = 0; c2 < colB; ++c2) {
                int c1 = 0;

                for(res[c2] = 0; c1 < count; ++c1) {
                    res[c2] += inA[c1] * inB[c1][c2];
                }
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
        }

        return res;
    }

    int[][] vectorMultiplication(int[][] inA, int[][] inB) {
        int[][] res = (int[][])null;
        int colA = inA[0].length;
        int rowA = inA.length;
        int colB = inB[0].length;
        int rowB = inB.length;
        int count = colA;
        if (colA == rowB) {
            res = new int[rowA][colB];

            for(int c1 = 0; c1 < rowA; ++c1) {
                for(int c2 = 0; c2 < colB; ++c2) {
                    for(int c3 = 0; c3 < count; ++c3) {
                        res[c1][c2] += inA[c1][c3] * inB[c3][c2];
                    }
                }
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Recheck size of both matrixes!");
        }

        return res;
    }
}
