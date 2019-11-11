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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Collections;
import java.util.List;

public class Network extends NetworkUtils {
	public String getLocalHostname(){
		try {
			return InetAddress.getLocalHost ( ).getHostName ( );
			
		} catch ( Exception e ) {
			return String.valueOf ( e );
		}
	}
	
	public String getLocalIpAddress() {
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
            return sc.readLine().trim();
        } catch (Exception e) {
            return "Cannot Execute Properly, Please Check Your Internet Connection";
        }
	}
    
	public String getMACAddress(String interfaceName) {
        try {
            List<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface iFace : interfaces) {
                if (interfaceName != null) { if (!iFace.getName().equalsIgnoreCase(interfaceName))  { continue; }
                }
                byte[] mac = iFace.getHardwareAddress();
                if ( mac == null) { return ""; }
                StringBuilder sb = new StringBuilder();
                for (byte aMac : mac) { sb.append(String.format("%02X:",aMac)); }
                if (sb.length()>0) { sb.deleteCharAt(sb.length()-1); }
                return sb.toString();
            }
        } catch (Exception e) {
			System.out.println ( e.toString () );
        }
        return null;
    }
	
}