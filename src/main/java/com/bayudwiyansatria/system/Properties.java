package com.bayudwiyansatria.system;

import java.util.Map;

public class Properties {
	public JavaVirtualMachineProperties getJavaVirtualMachineProperties(){
		return new JavaVirtualMachineProperties ();
	}
	
	public OperationSystemProperties getOperationSystemProperties(){
		return new OperationSystemProperties ();
	}
	
	public UserProperties getUserProperties(){
		return new UserProperties ();
	}
	
	public String[] getOperatingSystemInformation () {
		String[] OSInfo = new String[3];
		OSInfo[0] = this.getOperationSystemProperties ().getOperatingSystem ();
		OSInfo[1] = this.getOperationSystemProperties ().getOperatingSystemVersion ();
		OSInfo[2] = this.getOperationSystemProperties ().getOperatingSystemArchitecture ();
		System.out.println ( "OS : " + OSInfo[0]);
		System.out.println ( "OS Version : " + OSInfo[1]);
		System.out.println ( "OS Architecture : " + OSInfo[2]);
		return OSInfo;
	}
	
	public String[] getJavaInformation() {
		String[] JavaInfo = new String[2];
		JavaInfo[0] = this.getJavaVirtualMachineProperties ().getJavaHome ();
		JavaInfo[1] = this.getJavaVirtualMachineProperties ().getJavaVersion ();
		System.out.println ( "Java Home : " + JavaInfo[0] );
		System.out.println ( "Java Version : " + JavaInfo[1] );
		return JavaInfo;
	}
	
	public Map<String, String> getEnvironmentVariable(){
		return System.getenv ();
	}
	
	public void showAllEnvironmentVariable(){
		this.getEnvironmentVariable ().forEach ( (Keys, Values) -> {
			System.out.println ( Keys + ":" + Values );
		} );
	}
}
