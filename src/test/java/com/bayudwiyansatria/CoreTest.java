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

package com.bayudwiyansatria;

import org.junit.Test;

public class CoreTest {
	
	@Test
	public void setSystemUsername ( ) {
		new  com.bayudwiyansatria.Core ().getOperationSystemProperties ().setSystemUsername ( "bayudwiyansatria" );
	}
	
	@Test
	public void getSystemUsername ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new  com.bayudwiyansatria.Core ().getSystemUsername () );
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