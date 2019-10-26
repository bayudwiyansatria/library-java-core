package com.bayudwiyansatria;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoreTest {
	
	@Test
	public void setSystemUsername ( ) {
		new  com.bayudwiyansatria.Core ().getUserProperties ().setSystemUsername ( "bayudwiyansatria" );
	}
	
	@Test
	public void getSystemUsername ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new  com.bayudwiyansatria.Core ().getUserProperties ().getSystemUsername () );
	}
	
	@Test
	public void getOperatingSystem ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new  com.bayudwiyansatria.Core ().getOperationSystemProperties ().getOperatingSystem () );
	}
	
	@Test
	public void getOperatingSystemVersion ( ) {
		new com.bayudwiyansatria.mat.Mat ().print (new  com.bayudwiyansatria.Core ().getOperationSystemProperties ().getOperatingSystemVersion () );
	}
	
	@Test
	public void getOperatingSystemArchitecture ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new  com.bayudwiyansatria.Core ().getOperationSystemProperties ().getOperatingSystemArchitecture () );
	}
	
	@Test
	public void getOperatingSystemInformation ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new  com.bayudwiyansatria.Core ().getOperationSystemProperties ().getOperatingSystemInformation () );
	}
	
	@Test
	public void getJavaHome ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new  com.bayudwiyansatria.Core ().getJavaVirtualMachineProperties ().getJavaHome () );
	}
	
	@Test
	public void getJavaVersion ( ) {
		new com.bayudwiyansatria.mat.Mat ().print (  new  com.bayudwiyansatria.Core ().getJavaVirtualMachineProperties ().getJavaVersion () );
	}
	
	@Test
	public void getJavaInformation ( ) {
		new com.bayudwiyansatria.mat.Mat ().print (  new  com.bayudwiyansatria.Core ().getJavaVirtualMachineProperties ().getJavaInformation () );
	}
	
}