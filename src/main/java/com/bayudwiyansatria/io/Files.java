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

package com.bayudwiyansatria.io;

import com.bayudwiyansatria.mat.Array;
import com.bayudwiyansatria.utils.Utils;

import java.io.*;

public class Files extends Array {
    
    private String[][] readCSV(String filename, String titlemode) {
        filename = filename + ".csv";
        String initData = "";
        String[] reader = null;
        String[][] data = null;
        String[][] parsedData;
        String[] mode = titlemode.split("title:");
        File readFile = new File(filename);

        try {
            String readByte;
            for(BufferedReader _reader = new BufferedReader(new java.io.FileReader(readFile));
                (readByte = _reader.readLine()) != null;
                initData = initData + readByte + "\n") {
            }
            reader = initData.split("\n");
        } catch (Exception exception) {
            new Utils().warning(exception.toString());
        }

        int i;
        if (mode[1].equalsIgnoreCase("no")) {
            data = new String[reader.length][reader[0].length()];

            for(i = 0; i < reader.length; ++i) {
                data[i] = reader[i].split(",");
            }
        } else if (mode[1].equalsIgnoreCase("col")) {
            data = new String[reader.length - 1][reader[0].length()];

            for(i = 1; i < reader.length; ++i) {
                data[i - 1] = reader[i].split(",");
            }
        } else {
            int j;
            if (mode[1].equalsIgnoreCase("row")) {
                parsedData = new String[reader.length][reader[0].length()];

                for(i = 0; i < reader.length; ++i) {
                    parsedData[i] = reader[i].split(",");
                }

                data = new String[reader.length][parsedData[0].length - 1];

                for(i = 0; i < reader.length; ++i) {
                    for(j = 1; j < parsedData[0].length; ++j) {
                        data[i][j - 1] = parsedData[i][j];
                    }
                }
            } else if (mode[1].equalsIgnoreCase("colrow")) {
                parsedData = new String[reader.length][reader[0].length()];

                for(i = 0; i < reader.length; ++i) {
                    parsedData[i] = reader[i].split(",");
                }

                data = new String[reader.length - 1][parsedData[0].length - 1];

                for(i = 1; i < reader.length; ++i) {
                    for(j = 1; j < parsedData[0].length; ++j) {
                        data[i - 1][j - 1] = parsedData[i][j];
                    }
                }
            } else if (mode[1].equalsIgnoreCase("rowcol")) {
                parsedData = new String[reader.length][reader[0].length()];

                for(i = 0; i < reader.length; ++i) {
                    parsedData[i] = reader[i].split(",");
                }

                data = new String[reader.length - 1][parsedData[0].length - 1];

                for(i = 1; i < reader.length; ++i) {
                    for(j = 1; j < parsedData[0].length; ++j) {
                        data[i - 1][j - 1] = parsedData[i][j];
                    }
                }
            } else {
                new Utils().warning("Title format is unknown.\nAvailable titles are = no, col, row, colrow or rowcol");
            }
        }

        return data;
    }

    public int[][] readCSV_int(String filename, String titlemode) {
        return new Utils().string_to_int (this.readCSV(filename, titlemode));
    }

    public int[][] readCSV_int(String filename) {
        return new Utils().string_to_int (this.readCSV(filename, "title:no"));
    }

    public double[][] readCSV_double(String filename, String titlemode) {
        return new Utils().string_to_double (this.readCSV(filename, titlemode));
    }

    public double[][] readCSV_double(String filename) {
        return new Utils().string_to_double (this.readCSV(filename, "title:no"));
    }

    public String[][] readCSV_String(String filename, String titlemode) {
        return this.readCSV(filename, titlemode);
    }

    public String[][] readCSV_String(String filename) {
        return this.readCSV(filename, "title:no");
    }
    
    public void saveCSV(int[] data, String filename) {
        PrintWriter writer = null;
        File file = new File(filename + ".csv");

        try {
            try {
                writer = new PrintWriter(new FileWriter(file));
            } catch (FileNotFoundException var8) {
                new Utils().warning("Can not find the file!");
            }

            int i = 0;

            String string;
            for(string = ""; i < data.length; ++i) {
                if (i != data.length - 1) {
                    string = string + data[i] + ",";
                } else {
                    string = string + data[i];
                }
            }

            if (writer != null) {
                writer.print(string);
            }
            if (writer != null) {
                writer.flush();
            }
        } catch (Exception e) {
            if (writer != null) {
                writer.close();
            }
        }

    }

    public void saveCSV(double[] data, String filename) {
        PrintWriter writer = null;
        File file = new File(filename + ".csv");

        try {
            try {
                writer = new PrintWriter(new FileWriter(file));
            } catch (FileNotFoundException var8) {
                new Utils().warning("Can not find the file!");
            }

            int i = 0;

            String string;
            for(string = ""; i < data.length; ++i) {
                if (i != data.length - 1) {
                    string = string + data[i] + ",";
                } else {
                    string = string + data[i];
                }
            }

            if (writer != null) {
                writer.print(string);
            }
            if (writer != null) {
                writer.flush();
            }
        } catch (Exception e) {
            if (writer != null) {
                writer.close();
            }
        }

    }

    public void saveCSV(String[] data, String filename) {
        PrintWriter writer = null;
        File file = new File(filename + ".csv");

        try {
            try {
                writer = new PrintWriter(new FileWriter(file));
            } catch (FileNotFoundException e) {
                new Utils().warning("Can not find the file");
            }

            int i = 0;

            String string;
            for(string = ""; i < data.length; ++i) {
                if (i != data.length - 1) {
                    string = string + data[i] + ",";
                } else {
                    string = string + data[i];
                }
            }

            if (writer != null) {
                writer.print(string);
            }
            if (writer != null) {
                writer.flush();
            }
        } catch (Exception e) {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public void saveCSV(int[][] data, String filename) {
        PrintWriter writer = null;
        File file = new File(filename + ".csv");

        try {
            try {
                writer = new PrintWriter(new FileWriter(file));
            } catch (FileNotFoundException var10) {
                new Utils().warning("Can not find the file!");
            }

            for (int[] datum : data) {
                int j = 0;

                String string;
                for (string = ""; j < data[0].length; ++j) {
                    if (j != data[0].length - 1) {
                        string = string + datum[j] + ",";
                    } else {
                        string = string + datum[j];
                    }
                }

                if (writer != null) {
                    writer.println(string);
                }
            }

            if (writer != null) {
                writer.flush();
            }
        } catch (Exception var11) {
            if (writer != null) {
                writer.close();
            }
        }

    }

    public void saveCSV(double[][] data, String filename) {
        PrintWriter writer = null;
        File file = new File(filename + ".csv");

        try {
            try {
                writer = new PrintWriter(new FileWriter(file));
            } catch (FileNotFoundException var10) {
                new Utils().warning("Can not find the file!");
            }

            for (double[] datum : data) {
                int j = 0;

                String string;
                for (string = ""; j < data[0].length; ++j) {
                    if (j != data[0].length - 1) {
                        string = string + datum[j] + ",";
                    } else {
                        string = string + datum[j];
                    }
                }

                if (writer != null) {
                    writer.println(string);
                }
            }

            if (writer != null) {
                writer.flush();
            }
        } catch (Exception var11) {
            if (writer != null) {
                writer.close();
            }
        }

    }

    public void saveCSV(String[][] data, String filename) {
        PrintWriter writer = null;
        File file = new File(filename + ".csv");

        try {
            try {
                writer = new PrintWriter(new FileWriter(file));
            } catch (FileNotFoundException var10) {
                new Utils().warning("Can not find the file!");
            }

            for (String[] datum : data) {
                int j = 0;

                String string;
                for (string = ""; j < data[0].length; ++j) {
                    if (j != data[0].length - 1) {
                        string = string + datum[j] + ",";
                    } else {
                        string = string + datum[j];
                    }
                }

                if (writer != null) {
                    writer.println(string);
                }
            }

            if (writer != null) {
                writer.flush();
            }
        } catch (Exception var11) {
            if (writer != null) {
                writer.close();
            }
        }

    }

    public void saveDST(int[] data, String filename) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename + ".dst"));
            outputStream.writeObject(data);
            outputStream.close();
        } catch (Exception e) {
            new Utils().warning(e.toString());
        }

    }

    public void saveDST(double[] data, String filename) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename + ".dst"));
            outputStream.writeObject(data);
            outputStream.close();
        } catch (Exception e) {
            new Utils().warning(e.toString());
        }

    }

    public void saveDST(int[][] data, String filename) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename + ".dst"));
            outputStream.writeObject(data);
            outputStream.close();
        } catch (Exception e) {
            new Utils().warning(e.toString());
        }

    }

    public void saveDST(double[][] data, String filename) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename + ".dst"));
            outputStream.writeObject(data);
            outputStream.close();
        } catch (Exception e) {
            new Utils().warning(e.toString());
        }

    }

    public int[] readDST_1D_int(String filename) {
        int[] data = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename + ".dst"));
            data = (int[])inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {
            new Utils().warning(e.toString());
        }

        return data;
    }

    public int[][] readDST_2D_int(String filename) {
        int[][] data = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename + ".dst"));
            data = (int[][])inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {
            new Utils().warning(e.toString());
        }

        return data;
    }

    public double[] readDST_1D_double(String filename) {
        double[] data = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename + ".dst"));
            data = (double[])inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {
            new Utils().warning(e.toString());
        }

        return data;
    }

    public double[][] readDST_2D_double(String filename) {
        double[][] data = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename + ".dst"));
            data = (double[][])inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {
            new Utils().warning(e.toString());
        }

        return data;
    }


    public void convertCSV_to_DST_int(String filename, String titleMode) {
        boolean validation = false;
        byte bytes = -1;
        switch(titleMode.hashCode()) {
            case 0: if ( "title:col".equals(titleMode)) { bytes = 0; }
            break;
            case 1: if ("title:row".equals(titleMode)) { bytes = 1; }
            break;
            case 2: if ("title:rowcol".equals(titleMode)) { bytes = 2; }
            break;
            case 3: if ("title:no".equals(titleMode)) { bytes = 3; }
            break;
            case 4: if ("title:colrow".equals(titleMode)) { bytes = 4; }
            default: break;
        }

        switch(bytes) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: validation = true;
            break;
        }

        if (validation) {
            try {
                int[][] dataset = this.readCSV_int(filename, titleMode);
                this.saveDST(dataset, filename);
            } catch (Exception var6) {
                new Utils().warning("Can not find the file!");
            }
        } else {
            new Utils().warning("Title format is unknown.\nAvailable titles are = no, col, row, colrow or rowcol");
        }

    }
}
