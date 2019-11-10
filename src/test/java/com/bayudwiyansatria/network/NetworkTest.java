package com.bayudwiyansatria.network;

import org.junit.Test;

import static org.junit.Assert.*;

public class NetworkTest {
	@Test
	public void getHostName(){
		System.out.println ( "Get Hostname of current machine" );
		String Hostname =  new com.bayudwiyansatria.network.Network ().getHostname ();
		System.out.println ( "Current Hostname : " + Hostname );
	}
	
	@Test
	public void getNetworkInterface(){
		System.out.println ( "Get Network Interface of current machine" );
		String Interface =  new com.bayudwiyansatria.network.Network ().getNetworkInterface ();
		System.out.println ( "Current Hostname : " + Interface );
	}
	
	@Test
	public void getIPAddress(){
		System.out.println ( "Get IP Address of current machine" );
		String IP =  new com.bayudwiyansatria.network.Network ().getIpAddress ();
		System.out.println ( "System IP Address : " + IP );
	}
	
	@Test
	public void getPublicIPAddress(){
		System.out.println ( "Get Public IP Address of current machine" );
		String IP =  new com.bayudwiyansatria.network.Network ().getPublicIPAddress ();
		System.out.println ( "System Public IP Address : " + IP );
	}
}