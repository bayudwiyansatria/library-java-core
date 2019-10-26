package com.bayudwiyansatria.system;

public class JavaVirtualMachineProperties extends Properties {
	
	public String getJavaHome() {
		return System.getProperty("java.home");
	}
	
	public String getJavaVersion() {
		return System.getProperty("java.version");
	}
	
}
