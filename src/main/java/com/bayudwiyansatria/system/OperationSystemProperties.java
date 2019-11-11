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
	
	public int getNumOfCores(){
		return Runtime.getRuntime().availableProcessors();
	}
	
	public String[] getOperatingSystemInformation () {
		String[] OSInfo = new String[ 3 ];
		OSInfo[ 0 ] = this.getOperatingSystem ( );
		OSInfo[ 1 ] = this.getOperatingSystemVersion ( );
		OSInfo[ 2 ] = this.getOperatingSystemArchitecture ( );
		System.out.println ( "OS : " + OSInfo[ 0 ] );
		System.out.println ( "OS Version : " + OSInfo[ 1 ] );
		System.out.println ( "OS Architecture : " + OSInfo[ 2 ] );
		return OSInfo;
	}
}
