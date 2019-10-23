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
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import java.util.Arrays;
import java.util.Optional;

public class Core {
	public void myLambda(){
		int[][] arrays = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}, {1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
	}

	public void noLamda(){
		int[][] arrays = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}, {1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
		for (int i = 0; i<arrays.length; i++) {
			for(int j=0; i<arrays[0].length; i++){
				System.out.println(arrays[i][j]);
			}
		}
	}

	public void parallel(){
		int[][] arrays = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}, {1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
	}

	public static void main (String[] args){
		long StartTime = System.currentTimeMillis();
		new Core().myLambda();
		long EndTime = System.currentTimeMillis();
		float sec = (EndTime - StartTime) / 1000F; System.out.println(sec + " seconds");

		StartTime = System.currentTimeMillis();
		new Core().noLamda();
		EndTime = System.currentTimeMillis();
		sec = (EndTime - StartTime) / 1000F; System.out.println(sec + " seconds");
	}
}
