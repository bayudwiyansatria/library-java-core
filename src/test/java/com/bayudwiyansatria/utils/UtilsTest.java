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

package com.bayudwiyansatria.utils;

import org.junit.Test;

public class UtilsTest {
	
	@Test
	public void testBuildArgument ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Build argument" );
		String[] array = { "com.bayudwiyansatria:core:1.1.7", "junit:junit:1.1", "org.slf4j-simple:org.slf4j:1.1" };
		String splitter = ",";
        new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils().buildArgument ( array, splitter ) );
	}
	
	@Test
	public void testBuildDependencyArgument ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Build dependencies" );
		String[][] dependency = { {"com.bayudwiyansatria", "core", "1.1.7"}, {"junit", "junit", "1.1"} };
        String splitter = ",";
		new com.bayudwiyansatria.mat.Mat().print(new com.bayudwiyansatria.utils.Utils().buildDependencyArgument ( dependency, splitter ));
	}
	
	@Test
	public void testGetUnique ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Get uniqueness value of data" );
		int[] data = { 4,2,3,4,1,2,3,4,1,2,42,5,24,52,1,1,1,2,3,4,51,2,3,4 };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).getUnique ( data ) );
	}
	
	@Test
	public void int_to_double ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert int to double" );
		int[] data = { 213,12,1,23,4,1,2,3,4,12,3,12,3 };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).int_to_double ( data ) );
	}
	
	@Test
	public void testInt_to_double ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert int to double multi dimension array" );
		int[][] data = { {1,2,3,4,5,12,3,4,212,3,421,31,2,34,5}, {1,2,3,4,5,12,3,4,212,3,421,31,2,34,5} };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).int_to_double ( data ) );
	}
	
	@Test
	public void double_to_int ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert double to int" );
		double[] data = { 31,31,23,4,12,3,4,12,31,2,31,3,4,1,2 };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).double_to_int ( data ) );
	}
	
	@Test
	public void testDouble_to_int ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert double to int multi dimension array" );
		double[][] data = { {1,2,3,4,5,12,3,4,212,3,421,31,2,34,5}, {31,31,23,4,12,3,4,12,31,2,31,3,4,1,2} };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).double_to_int ( data ) );
	}
	
	@Test
	public void string_to_int ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert string to int" );
		String[] data = { "1", "2", "3", "1", "4", "1", "2", "3" };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).string_to_int ( data ) );
	}
	
	@Test
	public void testString_to_int ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert string to int multi dimension array" );
		String[][] data = { { "1", "2", "3", "1", "4", "1", "2", "3" }, { "1", "2", "3", "1", "4", "1", "2", "3" } };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).string_to_int ( data ) );
	}
	
	@Test
	public void string_to_double ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert string to double" );
		String[] data = { "1", "2", "3", "1", "4", "1", "2", "3" };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).string_to_double ( data) );
	}
	
	@Test
	public void testString_to_double ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert double to int multi dimension array" );
		String[][] data = { { "1", "2", "3", "1", "4", "1", "2", "3" }, { "1", "2", "3", "1", "4", "1", "2", "3" } };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).string_to_double ( data ) );
	}
	
	@Test
	public void string_to_categorical ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert string to categorical" );
		String[] data = { "where", "are", "you", "my", "big", "brother", "s", "?" };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).string_to_categorical ( data ) );
	}
	
	@Test
	public void testString_to_categorical ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( "Convert string to categorical multi dimension array" );
		String[][] data = { { "where", "are", "you", "my", "big", "brother", "s", "?" }, { "where", "are", "you", "my", "big", "sisters", "s", "?" }  };
		new com.bayudwiyansatria.mat.Mat().print ( new com.bayudwiyansatria.utils.Utils ( ).string_to_categorical (data ) );
	}

}