package com.bayudwiyansatria.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.net.InetAddress;

public class Network {
	public String getHostname(){
		try {
			return InetAddress.getLocalHost ( ).getHostName ( );
			
		} catch ( Exception e ) {
			return String.valueOf ( e );
		}
	}
	
	public String getNetworkInterface() {
		try {
			return String.valueOf ( NetworkInterface.getByName ( "lo" ) );
		} catch ( Exception e ) {
			return String.valueOf ( e );
		}
	}
	
	public String getIpAddress() {
		try {
			return InetAddress.getLocalHost ( ).getHostAddress ( ).trim ( );
		} catch ( Exception e ) {
			return String.valueOf ( e );
		}
	}
	
	public String getPublicIPAddress() {
		try {
            URL url_name = new URL("http://ifconfig.me");
            BufferedReader sc = new BufferedReader(new InputStreamReader (url_name.openStream()));
            // reads system IPAddress
            return sc.readLine().trim();
        } catch (Exception e) {
            return "Cannot Execute Properly";
        }
	}
}
