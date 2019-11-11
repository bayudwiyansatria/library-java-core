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

package com.bayudwiyansatria.network;

import java.net.*;
import java.util.*;

public class NetworkUtils {
    
    public String[] getNetworkInterface () {
        String[] networkInterface = null;
        try {
            ArrayList< NetworkInterface> interfaces = Collections.list ( NetworkInterface.getNetworkInterfaces ( ));
            networkInterface = new String[interfaces.size ()];
            int i = 0;
            for ( NetworkInterface IFace : interfaces ) {
                if ( IFace.isUp ( ) ) {
                    networkInterface[ i ] = IFace.getDisplayName ( );
                    i++;
                }
            }
            return new com.bayudwiyansatria.mat.Mat().removeNull ( networkInterface );
        } catch ( Exception e ) {
            return null;
        }
    }
    
    public String getIPv4AddressByInterface(String Interface) {
		try {
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
			while (interfaces.hasMoreElements()) {
				NetworkInterface networkInterface = interfaces.nextElement ( );
				if (Interface.equals ( networkInterface.getName () )) {
					List < InterfaceAddress > ipAddress = networkInterface.getInterfaceAddresses ( );
					for ( InterfaceAddress address : ipAddress ) {
						String IPv4 = address.getAddress ( ).getHostAddress ( );
						if ( IPv4.contains ( "." ) ) {
							return IPv4;
						}
					}
				}
			}
		} catch ( Exception e ) {
			System.out.println ( e.toString () );
		}
		return null;
	}
	
	public String getIPv6AddressByInterface(String Interface) {
		try {
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
			while (interfaces.hasMoreElements()) {
				NetworkInterface networkInterface = interfaces.nextElement ( );
				if (Interface.equals ( networkInterface.getName () )) {
					List < InterfaceAddress > ipAddress = networkInterface.getInterfaceAddresses ( );
					for ( InterfaceAddress address : ipAddress ) {
						String[] IPv6 = address.getAddress ( ).getHostAddress ( ).split ("%");
                        for ( String s : IPv6 ) {
                            if ( s.contains ( ":" ) ) {
                                return s;
                            }
                        }
						
					}
				}
			}
		} catch ( Exception e ) {
			System.out.println ( e.toString () );
		}
		return null;
	}
	
	public String[] getAllIPv4Address() {
        String[] ipAddress = new String[this.getNetworkInterface().length];
        for (int i=0; i < ipAddress.length; i ++ ){
            ipAddress[i] = this.getIPv4AddressByInterface ( getNetworkInterface ()[i] );
        }
        return ipAddress;
    }
    
    public String[] getAllIPv6Address() {
        String[] ipAddress = new String[this.getNetworkInterface().length];
        for (int i=0; i < ipAddress.length; i ++ ){
            ipAddress[i] = this.getIPv6AddressByInterface ( getNetworkInterface ()[i] );
        }
        return ipAddress;
    }
}
