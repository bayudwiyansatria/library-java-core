package com.bayudwiyansatria.system;

public class OperationSystemProperties extends Properties {
	
	public String getOperatingSystem() {
		return System.getProperty("os.name");
	}
	
	public String getOperatingSystemVersion() {
		return System.getProperty("os.version");
	}
	
	public String getOperatingSystemArchitecture() {
		return System.getProperty("os.arch");
	}
	
	public String[] getOperatingSystemInformation () {
		String[] OSInfo = new String[3];
		OSInfo[0] = this.getOperatingSystem ();
		OSInfo[1] = this.getOperatingSystemVersion ();
		OSInfo[2] = this.getOperatingSystemArchitecture ();
		System.out.println ( "OS : " + OSInfo[0]);
		System.out.println ( "OS Version : " + OSInfo[1]);
		System.out.println ( "OS Architecture : " + OSInfo[2]);
		return OSInfo;
	}
	
}
