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

import org.junit.Test;

public class NetworkTest {
	@Test
	public void getLocalHostName(){
		System.out.println ( "Get Hostname of current machine : " );
		String Hostname =  new com.bayudwiyansatria.network.Network ().getLocalHostname ();
		System.out.println ( "System Hostname : " + Hostname );
	}
	
	@Test
	public void getLocalIPAddress(){
		System.out.println ( "Get IP Address of current machine : " );
		String IP =  new com.bayudwiyansatria.network.Network ().getLocalIpAddress ();
		System.out.println ( "System IP Address : " + IP );
	}
	
	@Test
	public void getPublicIPAddress(){
		System.out.println ( "Get Public IP Address of current machine : " );
		String IP =  new com.bayudwiyansatria.network.Network ().getPublicIPAddress ();
		System.out.println ( "System Public IP Address : " + IP );
	}
	
	@Test
	public void getMacPAddress(){
		System.out.println ( "Get MAC Address of current machine : " );
		String IP =  new com.bayudwiyansatria.network.Network ().getMACAddress("eth0");
		System.out.println ( "System MAC Address : " + IP );
	}
	
	@Test
	public void getNetworkInterface(){
		System.out.println ( "Get Network Interface : " );
		String[] Interface =  new com.bayudwiyansatria.network.Network ().getNetworkInterface ();
		new com.bayudwiyansatria.mat.Mat().print ( "Running Network Interface : " , Interface );
	}
	
	@Test
	public void getIPv4AddressByNetworkInterface(){
		System.out.println ( "Get IPv4 By Network Interface : " );
		String Interface =  new com.bayudwiyansatria.network.Network ().getIPv4AddressByInterface ("eth0");
		System.out.println ( "System Network Interface IPv4 : " + Interface );
	}
	
	@Test
	public void getAllIPv4Address(){
		System.out.println ( "Get All IPv4 : " );
		String[] Interface =  new com.bayudwiyansatria.network.Network ().getAllIPv4Address ();
		new com.bayudwiyansatria.mat.Mat().print ( "All IPv4 Running Network Interface : " , Interface );
	}
	
	@Test
	public void getIPv6AddressByNetworkInterface(){
		System.out.println ( "Get IPv6 By Network Interface : " );
		String Interface =  new com.bayudwiyansatria.network.Network ().getIPv6AddressByInterface ("eth0");
		System.out.println ( "System Network Interface IPv6 : " + Interface );
	}
	
	@Test
	public void getAllIPv6Address(){
		System.out.println ( "Get All IPv6 : " );
		String[] Interface =  new com.bayudwiyansatria.network.Network ().getAllIPv6Address ();
		new com.bayudwiyansatria.mat.Mat().print ( "All IPv6 Running Network Interface : " , Interface );
	}
	
}