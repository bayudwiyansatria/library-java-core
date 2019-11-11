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

package com.bayudwiyansatria.math;

import java.math.BigInteger;

public class PermutationGenerator {
    private int[] a;
    private BigInteger numLeft;
    private BigInteger total;

    public PermutationGenerator(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Min 1");
        } else {
            this.a = new int[n];
            this.total = getFactorial(n);
            this.reset();
        }
    }

    public void reset() {
        for(int i = 0; i < this.a.length; this.a[i] = i++) {
        }

        this.numLeft = new BigInteger(this.total.toString());
    }

    public BigInteger getNumLeft() {
        return this.numLeft;
    }

    public BigInteger getTotal() {
        return this.total;
    }

    public boolean hasMore() {
        return this.numLeft.compareTo(BigInteger.ZERO) == 1;
    }

    private static BigInteger getFactorial(int n) {
        BigInteger fact = BigInteger.ONE;

        for(int i = ~(0 - (int)(1L + (long)n)); i > 1; --i) {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }

        return fact;
    }

    public int[] getNext() {
        if (this.numLeft.equals(this.total)) {
            this.numLeft = this.numLeft.subtract(BigInteger.ONE);
            return this.a;
        } else {
            int i;
            int j;
            for(i = this.a.length - 2; this.a[i] > this.a[i + 1]; --i) {
            }

            for(j = this.a.length - 1; this.a[i] > this.a[j]; --j) {
            }

            int temp = this.a[j];
            this.a[j] = this.a[i];
            this.a[i] = temp;
            int r = this.a.length - 1;

            for(int k = i + 1; r > k; ++k) {
                temp = this.a[k];
                this.a[k] = this.a[r];
                this.a[r] = temp;
                --r;
            }

            this.numLeft = this.numLeft.subtract(BigInteger.ONE);
            return this.a;
        }
    }
}
