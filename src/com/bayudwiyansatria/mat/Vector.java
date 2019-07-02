package com.bayudwiyansatria.mat;

import com.bayudwiyansatria.utils.Utils;

public class Vector extends Utils {
    /* ========================================= Addition Start ======================================================*/

    int[] addition(int[] inA, int inB) {
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

    int[] substraction(int[] inA, int inB) {
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
            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
                this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
        }

        return res;
    }

    int vectorMultiplication(int[] inA, int[] inB) {
        int nb = inB.length;
        int _output = 0;
        if (inA.length == nb) {
            for(int i = 0; i < inA.length; ++i) {
                _output += inA[i] * inB[i];
            }
        } else {
            this.warning("Length of both data has to be same!");
        }

        return _output;
    }

    double vectorMultiplication(double[] inA, double[] inB) {
        int nb = inB.length;
        double _output = 0.0;
        if (inA.length == nb) {
            for(int i = 0; i < inA.length; ++i) {
                _output += inA[i] * inB[i];
            }
        } else {
            this.warning("Length of both data has to be same!");
        }

        return _output;
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
            this.warning("Recheck size of both matrixes!");
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
            this.warning("Recheck size of both matrixes!");
        }

        return res;
    }

    private double getDistance_Absolute(double[] p1, double[] p2) {
        double jarak = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - p1[i];
            jarak += difference * difference;
        }
        return java.lang.Math.sqrt(jarak);
    }

    private double getDistance_Absolute(int[] p1, double[] p2) {
        double jarak = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - (double)p1[i];
            jarak += difference * difference;
        }
        return java.lang.Math.sqrt(jarak);
    }

    private double getDistance_Absolute(double[] p1, int[] p2) {
        double jarak = 0.0;

        for(int i = 0; i < p1.length; ++i) {
            double difference = (double)p2[i] - p1[i];
            jarak += difference * difference;
        }

        return java.lang.Math.sqrt(jarak);
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
                this.warning("Error distance type!");
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
                this.warning("Error distance type!");
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
                this.warning("Error distance type!");
        }
        return jarak;
    }

    private double getDistance_Absolute(int[] p1, int[] p2) {
        double jarak = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            int difference = p2[i] - p1[i];
            jarak += (double)(difference * difference);
        }
        return java.lang.Math.sqrt(jarak);
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
                this.warning("Error distance type!");
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
                this.warning("Error distance type!");
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
                this.warning("Error distance type!");
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
                this.warning("Error distance type!");
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
                this.warning("Error distance type!");
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
