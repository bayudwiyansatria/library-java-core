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

package com.bayudwiyansatria.math;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Math extends Calculation {

    /* ========================================= Average Start ====================================================== */
    public double[] getAverage(int[][] data, String mode) {
        double[] average = null;
        double initAverage;
        if (mode.equals("col")) {
            average = new double[data[0].length];
            for(int i = 0; i < data[0].length; ++i) {
                initAverage = 0.0;
                for(int j = 0; j < data.length; ++j) {
                    initAverage += data[j][i];
                }
                average[i] = initAverage / (double)data.length;
            }
        } else if (mode.equals("row")) {
            average = new double[data.length];

            for(int i = 0; i < data.length; ++i) {
                initAverage = 0.0;
                for(int j = 0; j < data[0].length; ++j) {
                    initAverage += data[i][j];
                }
                average[i] = initAverage / (double)data[0].length;
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Error in mode parameter!");
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
        if (mode.equals("col")) {
            average = new double[data[0].length];
            for(int i = 0; i < data[0].length; ++i) {
                initAverage = 0.0;
                for(int j = 0; j < data.length; ++j) {
                    initAverage += data[j][i];
                }
                average[i] = initAverage / (double)data.length;
            }
        } else if (mode.equals("row")) {
            average = new double[data.length];
            for(int i = 0; i < data.length; ++i) {
                initAverage = 0.0;
                for(int j = 0; j < data[0].length; ++j) {
                    initAverage += data[i][j];
                }
                average[i] = initAverage / (double)data[0].length;
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Error in mode parameter!");
        }
        return average;
    }

    /* ========================================= Average End ======================================================== */

    /* ========================================= Random Start ======================================================= */
    public int getRandom(int min, int max) {
        return (int)(java.lang.Math.random() * (double)(max + 1 - min)) + min;
    }

    public double getRandom(double min, double max) {
        return java.lang.Math.random() * (max - min) + min;
    }

    /* ========================================= Random End ========================================================= */

    /* ========================================= Standard Deviation Start =========================================== */

    public double getStd(int[] data) {
        return this.getStd(new com.bayudwiyansatria.utils.Utils().int_to_double(data));
    }

    public double getStd(double[] data) {
        double mean = this.getAverage(data);
        double[] calculate = new Math().Calculate(data, mean, "-");
        double[] sqrtDifference = new Math().Calculate(calculate, calculate, "*");
        return java.lang.Math.sqrt(this.getSum(sqrtDifference) / (double)data.length);
    }

    public double[] getStd(int[][] data, String type) {
        return this.getStd(new com.bayudwiyansatria.utils.Utils().int_to_double(data), type);
    }

    public double[] getStd(double[][] data, String type) {
        double[] output = null;
        if (type.equals("col")) {
            output = new double[data[0].length];
            for(int i = 0; i < data[0].length; ++i) {
                output[i] = this.getStd(new com.bayudwiyansatria.mat.Mat().getCol(data, i));
            }
        } else if (type.equals("row")) {
            output = new double[data.length];

            for(int i = 0; i < data.length; ++i) {
                output[i] = this.getStd(new com.bayudwiyansatria.mat.Mat().getRow(data, i));
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Unknown type!");
        }
        return output;
    }

    /* ========================================= Standard Deviation End ============================================= */

    public double getRound(double data, int decimal_fraction) {
        String format = "#.";
        for(int i = 0; i < decimal_fraction; ++i) {
            format = format + "#";
        }
        DecimalFormat Form = new DecimalFormat(format);
        format = Form.format(data).replace(",", ".");
        data = Double.parseDouble(format);
        return data;
    }

    public int[] getMin(int[] data) {
        int[] min = new int[]{data[0], 0};
        for(int i = 1; i < data.length; ++i) {
            if (data[i] < min[0]) {
                min[0] = data[i];
                min[1] = i;
            }
        }
        return min;
    }

    public double[] getMin(double[] data) {
        double[] min = new double[]{data[0], 0.0};
        for(int i = 1; i < data.length; ++i) {
            if (data[i] < min[0]) {
                min[0] = data[i];
                min[1] = i;
            }
        }
        return min;
    }

    public int[][] getMin(int[][] data) {
        int[][] min = new int[2][data[0].length];

        for(int i = 0; i < data[0].length; ++i) {
            int[] tmp = this.getMin(new com.bayudwiyansatria.mat.Mat().getCol(data, i));
            min[0][i] = tmp[0];
            min[1][i] = tmp[1];
        }

        return min;
    }

    public double[][] getMin(double[][] data) {
        double[][] min = new double[2][data[0].length];
        for(int i = 0; i < data[0].length; ++i) {
            double[] tmp = this.getMin(new com.bayudwiyansatria.mat.Mat().getCol(data, i));
            min[0][i] = tmp[0];
            min[1][i] = tmp[1];
        }
        return min;
    }

    public int[] getMax(int[] data) {
        int[] max = new int[]{data[0], 0};
        for(int i = 1; i < data.length; ++i) {
            if (data[i] > max[0]) {
                max[0] = data[i];
                max[1] = i;
            }
        }
        return max;
    }

    public double[] getMax(double[] data) {
        double[] max = new double[]{data[0], 0.0};
        for(int i = 1; i < data.length; ++i) {
            if (data[i] > max[0]) {
                max[0] = data[i];
                max[1] = i;
            }
        }
        return max;
    }

    public int[][] getMax(int[][] data) {
        int[][] max = new int[2][data[0].length];
        for(int i = 0; i < data[0].length; ++i) {
            int[] tmp = this.getMax(new com.bayudwiyansatria.mat.Mat().getCol(data, i));
            max[0][i] = tmp[0];
            max[1][i] = tmp[1];
        }
        return max;
    }

    public double[][] getMax(double[][] data) {
        double[][] max = new double[2][data[0].length];
        for(int i = 0; i < data[0].length; ++i) {
            double[] tmp = this.getMax(new com.bayudwiyansatria.mat.Mat().getCol(data, i));
            max[0][i] = tmp[0];
            max[1][i] = tmp[1];
        }
        return max;
    }

    public int getFactorial(int n) {
        int factorial = 1;
        if (n < 1) {
            new com.bayudwiyansatria.utils.Utils().warning("N must be greater than zero!");
        } else {
            for(int i = ~(0 - (int)(1L + (long)n)); i > 1; --i) {
                factorial *= i;
            }
        }

        return factorial;
    }

    public int[][] getPerm(int n) {
        if (n > 10) {
            new com.bayudwiyansatria.utils.Utils().warning("Maximal n is 10");
        }

        int factorial = this.getFactorial(n);
        int[][] _perm = new int[factorial][n];
        PermutationGenerator _xx = new PermutationGenerator(n);

        for(int i = 0; _xx.hasMore(); ++i) {
            int[] indices = _xx.getNext();
            System.arraycopy(indices, 0, _perm[i], 0, n);
        }

        return _perm;
    }

    public int[] randPerm(int n) {
        int[] result = new int[n];
        ArrayList<Integer> data = new ArrayList<Integer>(n);

        for(int i = 0; i < n; ++i) {
            data.add(new Integer(i));
        }

        Random random = new Random();

        for(int i = 0; i < n; ++i) {
            int index = random.nextInt(data.size());
            result[i] = data.get(index);
            data.remove(index);
        }

        return result;
    }

    /* ========================================= Sum Start ========================================================== */

    public int getSum(int[] data) {
        int output = 0;
        for(int i = 0; i < data.length; ++i) {
            output += data[i];
        }
        return output;
    }

    public double getSum(double[] data) {
        double output = 0.0;
        for(int i = 0; i < data.length; ++i) {
            output += data[i];
        }
        return output;
    }

    public int[] getSum(int[][] data, String mode) {
        int[] output = null;
        int sum;
        if (mode.equals("col")) {
            output = new int[data[0].length];
            for(int i = 0; i < data[0].length; ++i) {
                sum = 0;

                for(int j = 0; j < data.length; ++j) {
                    sum += data[j][i];
                }
                output[i] = sum;
            }
        } else if (mode.equals("row")) {
            output = new int[data.length];
            for(int i = 0; i < data.length; ++i) {
                sum = 0;

                for(int j = 0; j < data[0].length; ++j) {
                    sum += data[i][j];
                }
                output[i] = sum;
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Error in mode parameter!");
        }
        return output;
    }

    public double[] getSum(double[][] data, String mode) {
        double[] output = null;
        double sum;
        if (mode.equals("col")) {
            output = new double[data[0].length];

            for(int i = 0; i < data[0].length; ++i) {
                sum = 0.0;

                for(int j = 0; j < data.length; ++j) {
                    sum += data[j][i];
                }

                output[i] = sum;
            }
        } else if (mode.equals("row")) {
            output = new double[data.length];

            for(int i = 0; i < data.length; ++i) {
                sum = 0.0;

                for(int j = 0; j < data[0].length; ++j) {
                    sum += data[i][j];
                }

                output[i] = sum;
            }
        } else {
            new com.bayudwiyansatria.utils.Utils().warning("Error in mode parameter!");
        }
        return output;
    }

    /* ========================================= Sum End ============================================================ */
}
