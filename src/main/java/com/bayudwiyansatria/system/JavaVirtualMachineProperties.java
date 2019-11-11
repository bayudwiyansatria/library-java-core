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

package com.bayudwiyansatria.system;

public class JavaVirtualMachineProperties extends Properties {
    private static String SPARK_HOME = null;
    private static String SPARK_USER = null;
    private static String SPARK_CONF_DIR = null;
    private static String SPARK_LOCAL_DIRS = null;
    private static String SPARK_LOCAL_IP = null;
    private static String SPARK_LOG_DIR = null;
    private static String SPARK_PID_DIR = null;
    private static String SPARK_HISTORY_OPTS = null;
	
	/* Java Virtual Machine Environment */
	public String getJavaHome() {
		return System.getProperty("java.home");
	}
	
	public String getJavaVersion() {
		return System.getProperty("java.version");
	}
    
    public String[] getJavaInformation() {
		String[] JavaInfo = new String[2];
		JavaInfo[0] = this.getJavaVirtualMachineProperties ().getJavaHome ();
		JavaInfo[1] = this.getJavaVirtualMachineProperties ().getJavaVersion ();
		System.out.println ( "Java Home : " + JavaInfo[0] );
		System.out.println ( "Java Version : " + JavaInfo[1] );
		return JavaInfo;
	}
 
	/* APACHE SPARK PROPERTIES */
	public static void setSparkHome( String Directory) {
        System.setProperty("SPARK_HOME", Directory);
        SPARK_HOME = Directory;
    }
    
    public String getSparkHome() {
        return SPARK_HOME;
    }
    
	public static void setSparkUser(String User) {
        System.setProperty("SPARK_USER", User);
        SPARK_HOME = User;
    }
    
    public String getSparkUser() {
	    return SPARK_USER;
    }
    
    public static void setSparkConfDir(String Directory) {
		System.setProperty ("SPARK_CONF_DIR", Directory);
		SPARK_CONF_DIR = Directory;
    }
    
    public String getSparkConfDir() {
		return SPARK_CONF_DIR;
    }
    
    public static void setSparkLocalDir(String Directory) {
		System.setProperty ("SPARK_LOCAL_DIRS", Directory);
		SPARK_CONF_DIR = Directory;
    }
    
    public String getSparkLocalDirs() {
		return SPARK_LOCAL_DIRS;
    }
    
    public static void setSparkLocalIp(String Directory) {
		System.setProperty ("SPARK_LOCAL_IP", Directory);
		SPARK_CONF_DIR = Directory;
    }
    
    public String getSparkLocalIp() {
		return SPARK_LOCAL_IP;
    }
    
    public static void setSparkLogDir(String Directory) {
		System.setProperty ("SPARK_LOG_DIR", Directory);
		SPARK_CONF_DIR = Directory;
    }
    
    public String getSparkLogDir() {
		return SPARK_LOG_DIR;
    }
    
    public static void setSparkPidDir(String Directory) {
		System.setProperty ("SPARK_PID_DIR", Directory);
		SPARK_CONF_DIR = Directory;
    }
    
    public String getSparkPidDir() {
		return SPARK_PID_DIR;
    }
    
    public static void setSparkHistoryDir(String Directory) {
		System.setProperty ("SPARK_HISTORY_OPTS", Directory);
		SPARK_CONF_DIR = Directory;
    }
    
    public String getSparkHistoryOpts() {
		return SPARK_HISTORY_OPTS;
    }
	
}
