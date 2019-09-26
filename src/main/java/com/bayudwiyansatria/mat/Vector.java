package com.bayudwiyansatria.mat;

public class Vector {

    private double getDistance_Absolute(double[] p1, double[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - p1[i];
            distance += difference * difference;
        }
        return Math.sqrt(distance);
    }

    private double getDistance_Absolute(int[] p1, double[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - (double)p1[i];
            distance += difference * difference;
        }
        return Math.sqrt(distance);
    }

    private double getDistance_Absolute(double[] p1, int[] p2) {
        double distance = 0.0;

        for(int i = 0; i < p1.length; ++i) {
            double difference = (double)p2[i] - p1[i];
            distance += difference * difference;
        }

        return Math.sqrt(distance);
    }

    private double getDistance_Relative(double[] p1, double[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - p1[i];
            distance += difference * difference;
        }
        return distance;
    }

    private int getDistance_Relative(int[] p1, int[] p2) {
        int distance = 0;
        for(int i = 0; i < p1.length; ++i) {
            int difference = p2[i] - p1[i];
            distance += difference * difference;
        }
        return distance;
    }

    private double getDistance_Relative(int[] p1, double[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - (double)p1[i];
            distance += difference * difference;
        }
        return distance;
    }

    private double getDistance_Relative(double[] p1, int[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = (double)p2[i] - p1[i];
            distance += difference * difference;
        }
        return distance;
    }

    public double getDistance(double[] p1, double[] p2) {
        double distance = 0.0;
        distance = this.getDistance_Absolute(p1, p2);
        return distance;
    }

    public double getDistance(int[] p1, int[] p2) {
        double distance = 0.0;
        distance = this.getDistance_Absolute(p1, p2);
        return distance;
    }

    public double getDistance(int[] p1, double[] p2) {
        double distance = 0.0;
        distance = this.getDistance_Absolute(p1, p2);
        return distance;
    }

    public double getDistance(double[] p1, int[] p2) {
        double distance = 0.0;
        distance = this.getDistance_Absolute(p1, p2);
        return distance;
    }

    private double getDistance_Absolute(int[] p1, int[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            int difference = p2[i] - p1[i];
            distance += (double)(difference * difference);
        }
        return Math.sqrt(distance);
    }

    private double[] getDistance_Absolute(double[] p1, double[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Absolute(p1, p2[i]);
        }
        return distance;
    }

    private double[] getDistance_Absolute(double[] p1, int[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Absolute(p1, p2[i]);
        }
        return distance;
    }

    private double[] getDistance_Absolute(int[] p1, double[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Absolute(p1, p2[i]);
        }

        return distance;
    }

    private double[] getDistance_Relative(double[] p1, double[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Relative(p1, p2[i]);
        }
        return distance;
    }

    private double[] getDistance_Relative(int[] p1, double[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Relative(p1, p2[i]);
        }

        return distance;
    }

    private double[] getDistance_Relative(double[] p1, int[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Relative(p1, p2[i]);
        }

        return distance;
    }

    private double[] getDistance_Absolute(int[] p1, int[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Absolute(p1, p2[i]);
        }

        return distance;
    }

    private double[] getDistance_Relative(int[] p1, int[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = (double)this.getDistance_Relative(p1, p2[i]);
        }
        return distance;
    }


    public double[] getDistance(int[] p1, int[][] p2) {
        double[] distance = new double[p2.length];
        distance = this.getDistance_Absolute(p1, p2);
        return distance;
    }

    public double[] getDistance(int[] p1, double[][] p2) {
        double[] distance = new double[p2.length];
        distance = this.getDistance_Absolute(p1, p2);
        return distance;
    }

    public double[] getDistance(double[] p1, int[][] p2) {
        double[] distance = new double[p2.length];
        distance = this.getDistance_Absolute(p1, p2);
        return distance;
    }

    public double[] getDistance(double[] p1, double[][] p2) {
        double[] distance = new double[p2.length];
        distance = this.getDistance_Absolute(p1, p2);
        return distance;
    }

    public double[] getMinDistance_Relative(double[] p1, double[][] p2) {
        double[] min = new double[]{this.getDistance_Relative(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double distance = this.getDistance_Relative(p1, p2[i]);
            if (distance < min[0]) {
                min[0] = distance;
                min[1] = i;
            }
        }

        return min;
    }

    public double[] getMinDistance_Relative(int[] p1, int[][] p2) {
        double[] min = new double[]{(double)this.getDistance_Relative(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double distance = (double)this.getDistance_Relative(p1, p2[i]);
            if (distance < min[0]) {
                min[0] = distance;
                min[1] = i;
            }
        }

        return min;
    }

    public double[] getMinDistance_Relative(int[] p1, double[][] p2) {
        double[] min = new double[]{this.getDistance_Relative(p1, p2[0]), 0.0};

        for(int i = 1; i < p2.length; ++i) {
            double distance = this.getDistance_Relative(p1, p2[i]);
            if (distance < min[0]) {
                min[0] = distance;
                min[1] = i;
            }
        }

        return min;
    }

    public double[] getMinDistance_Absolute(double[] p1, double[][] p2) {
        double[] min = new double[]{this.getDistance_Absolute(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double distance = this.getDistance_Absolute(p1, p2[i]);
            if (distance < min[0]) {
                min[0] = distance;
                min[1] = (double)i;
            }
        }

        return min;
    }

    public double[] getMinDistance_Absolute(int[] p1, int[][] p2) {
        double[] min = new double[]{this.getDistance_Absolute(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double distance = this.getDistance_Absolute(p1, p2[i]);
            if (distance < min[0]) {
                min[0] = distance;
                min[1] = (double)i;
            }
        }

        return min;
    }

    public double[] getMinDistance_Absolute(int[] p1, double[][] p2) {
        double[] min = new double[]{this.getDistance_Absolute(p1, p2[0]), 0.0};
        for(int i = 1; i < p2.length; ++i) {
            double distance = this.getDistance_Absolute(p1, p2[i]);
            if (distance < min[0]) {
                min[0] = distance;
                min[1] = (double)i;
            }
        }
        return min;
    }

    public int[][] transposeMatrix(int[][] data) {
        int rows = data.length;
        int cols = data[0].length;
        int[][] output = new int[cols][rows];

        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                output[j][i] = data[i][j];
            }
        }
        return output;
    }

    public double[][] transposeMatrix(double[][] data) {
        int rows = data.length;
        int cols = data[0].length;
        double[][] output = new double[cols][rows];
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                output[j][i] = data[i][j];
            }
        }
        return output;
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
        double[][] output = new double[row][(col*in.length)];
        for(int c1 = 0; c1 < row; ++c1) {
            for(int c2 = 0; c2 < (col*in.length); ++c2) {
                output[c1][c2] = in[c2 % in.length];
            }
        }
        return output;
    }

    public String[][] reshapeMatrix(String[][] in, int col, int row) {
        String[][] output = new String[row * in.length][(col*in[0].length)];
        for(int c1 = 0; c1 < row * in.length; ++c1) {
            for(int c2 = 0; c2 < (col*in[0].length); ++c2) {
                output[c1][c2] = in[c1 % in.length][c2 % in[0].length];
            }
        }
        return output;
    }

    public String[][] reshapeMatrix(String[] in, int col, int row) {
        String[][] res = new String[row][(col * in.length)];

        for(int c1 = 0; c1 < row; ++c1) {
            for(int c2 = 0; c2 < (col * in.length); ++c2) {
                res[c1][c2] = in[c2 % in.length];
            }
        }

        return res;
    }

    public int[][] reshapeMatrix(int[][] in, int col, int row) {
        int[][] res = new int[(row * in.length)][(col * in[0].length)];
        for(int c1 = 0; c1 < (row * in.length); ++c1) {
            for(int c2 = 0; c2 < (col * in[0].length); ++c2) {
                res[c1][c2] = in[c1 % in.length][c2 % in[0].length];
            }
        }
        return res;
    }

    public double[][] reshapeMatrix(double[][] in, int col, int row) {
        double[][] res = new double[(row * in.length)][(col * in[0].length)];
        for(int c1 = 0; c1 < (row * in.length); ++c1) {
            for(int c2 = 0; c2 < (col * in[0].length); ++c2) {
                res[c1][c2] = in[c1 % in.length][c2 % in[0].length];
            }
        }
        return res;
    }

    public int[][] reshapeMatrix(int[] in, int col, int row) {
        int[][] res = new int[row][(col * in.length)];
        for(int c1 = 0; c1 < row; ++c1) {
            for(int c2 = 0; c2 < (col * in.length); ++c2) {
                res[c1][c2] = in[c2 % in.length];
            }
        }
        return res;
    }

    public double[][] getDistanceMetric(double[][] data) {
        double[][] matrixDistance = new double[data.length - 1][];

        for(int i = 0; i < data.length - 1; ++i) {

                matrixDistance[i] = new double[i + 1];


            for(int j = 0; j <= i; ++j) {
                matrixDistance[i][j] = this.getDistance_Relative(data[i + 1], data[j]);
            }
        }

        return matrixDistance;
    }

    public double[][] getDistanceMetric(int[][] data) {
        double[][] matrixDistance = new double[data.length - 1][];

        for(int i = 0; i < data.length - 1; ++i) {

                matrixDistance[i] = new double[i + 1];

            for(int j = 0; j <= i; ++j) {
                matrixDistance[i][j] = (double)this.getDistance_Relative(data[i + 1], data[j]);
            }
        }

        return matrixDistance;
    }
}
