package com.bayudwiyansatria.network;

import java.net.InetAddress;
import java.net.NetworkInterface;

public class Network {
	private String HOSTNAME;
	private String INTERFACE;
	private String IP_ADDRESS;
	
	public String getHostname(){
		try {
			return InetAddress.getLocalHost ( ).getHostName ( );
		} catch ( Exception e ) {
			return String.valueOf ( e );
		}
	}
	
	public String getInterface() {
		try {
			return String.valueOf ( NetworkInterface.getByName ( "lo" ) );
		} catch ( Exception e ) {
			return String.valueOf ( e );
		}
	}
	
	public String getIpAddress() {
	
	}
	
}
