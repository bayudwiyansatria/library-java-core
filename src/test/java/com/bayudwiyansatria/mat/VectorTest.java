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

package com.bayudwiyansatria.mat;

import org.junit.Test;

public class VectorTest {
	
	private String[][] data = new com.bayudwiyansatria.io.IO().readCSV_String ( "src/main/resources/ruspini" );
	
	@Test
	public void getDistanceAbsolute ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[0];
		double[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceAbsolute ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceAbsolute1 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		int[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceAbsolute2 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		int[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceAbsolute3 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		double[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double (data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceAbsolute4 ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double (data )[0];
		int[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceAbsolute5 ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double (data )[0];
		int[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceAbsolute6 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void getDistanceRelative ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double( data )[0];
		double[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceRelative ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double( data )[0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceRelative1 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		int[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceRelative2 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		int[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceRelative3 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		double[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double(data)[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceRelative4 ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double( data )[0];
		int[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceRelative5 ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double( data )[0];
		int[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistanceRelative6 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data ) [0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void getDistance ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double( data )[0];
		double[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistance ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistance ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistance ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistance1 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int( data )[0];
		int[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistance ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistance2 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		int[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistance ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistance3 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		double[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistance ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistance4 ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[0];
		int[] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[1];
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistance ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistance5 ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[0];
		int[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistance ( p1, p2 ) );
	}
	
	@Test
	public void testGetDistance6 ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistance ( p1, p2 ) );
	}
	
	@Test
	public void getMinDistanceRelative ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getMinDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void testGetMinDistanceRelative ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		int[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getMinDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void testGetMinDistanceRelative1 ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getMinDistanceRelative ( p1, p2 ) );
	}
	
	@Test
	public void getMinDistanceAbsolute ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getMinDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void testGetMinDistanceAbsolute ( ) {
		int[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_int ( data )[0];
		int[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_int (data);
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getMinDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void testGetMinDistanceAbsolute1 ( ) {
		double[] p1 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data )[0];
		double[][] p2 = new com.bayudwiyansatria.utils.Utils().string_to_double ( data );
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getMinDistanceAbsolute ( p1, p2 ) );
	}
	
	@Test
	public void transposeMatrix ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().transposeMatrix ( data ) );
	}
	
	@Test
	public void testTransposeMatrix ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().transposeMatrix ( new com.bayudwiyansatria.utils.Utils().string_to_double ( data ) ) );
	}
	
	@Test
	public void testTransposeMatrix1 ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().transposeMatrix ( new com.bayudwiyansatria.utils.Utils().string_to_int ( data ) ) );
	}
	
	@Test
	public void reshapeMatrix ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().reshapeMatrix ( data[0], 10, 10 ) );
	}
	
	@Test
	public void testReshapeMatrix ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().reshapeMatrix (data, 10, 10 ) );
	}
	
	@Test
	public void testReshapeMatrix1 ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().reshapeMatrix ( new com.bayudwiyansatria.utils.Utils().string_to_double ( data[0] ), 10, 10 ) );
	}
	
	@Test
	public void testReshapeMatrix2 ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().reshapeMatrix ( new com.bayudwiyansatria.utils.Utils().string_to_double ( data ), 10, 10 ) );
	}
	
	@Test
	public void testReshapeMatrix3 ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().reshapeMatrix ( new com.bayudwiyansatria.utils.Utils().string_to_int ( data[0] ), 10, 10 ) );
	}
	
	@Test
	public void testReshapeMatrix4 ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().reshapeMatrix ( new com.bayudwiyansatria.utils.Utils().string_to_int ( data ), 10, 10 ) );
	}
	
	@Test
	public void getDistanceMetric ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceMetric( new com.bayudwiyansatria.utils.Utils().string_to_int ( data ) ) );
	}
	
	@Test
	public void testGetDistanceMetric ( ) {
		new com.bayudwiyansatria.mat.Mat ().print ( new com.bayudwiyansatria.mat.Vector ().getDistanceMetric( new com.bayudwiyansatria.utils.Utils().string_to_double ( data ) ) );
	}
	
}