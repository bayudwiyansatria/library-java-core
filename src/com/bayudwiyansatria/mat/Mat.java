package com.bayudwiyansatria.mat;

public class Mat extends Vector{
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
            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes. It has to be same");
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
            this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes. It has to be same");
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
            this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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

            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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

}
