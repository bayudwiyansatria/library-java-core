package com.bayudwiyansatria.mat;

public class Mat extends Array {
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
        System.out.println(new com.bayudwiyansatria.math.Math().getRound(data, decimal_fraction) + "\n");
    }

    public void print(double[] data, int decimal_fraction) {
        this.print("", data, decimal_fraction);
    }

    public void print(double[][] data, int decimal_fraction) {
        this.print("", data, decimal_fraction);
    }

    public void print(String label, double data, int decimal_fraction) {
        System.out.println(label + " = " + new com.bayudwiyansatria.math.Math().getRound(data, decimal_fraction) + "\n");
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
            System.out.print(new com.bayudwiyansatria.math.Math().getRound(data[i], decimal_fraction) + "    ");
        }
        if (data.length > 0) {
            System.out.print(new com.bayudwiyansatria.math.Math().getRound(data[data.length - 1], decimal_fraction));
        }
        System.out.print("\n\n");
    }

    public void print(String label, double[][] data, int decimal_fraction) {
        if (label.length() > 0) {
            System.out.println(label + " =");
        }

        for(int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[i].length; ++j) {
                System.out.print(new com.bayudwiyansatria.math.Math().getRound(data[i][j], decimal_fraction) + "    ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    /* ======================================= Array View End ========================================================*/
}
