package com.bayudwiyansatria.mat;

import java.math.BigInteger;

class PermutationGenerator {
    private int[] a;
    private BigInteger numLeft;
    private BigInteger total;

    protected PermutationGenerator(int n) {
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
            int j;
            for(j = this.a.length - 2; this.a[j] > this.a[j + 1]; --j) {
            }

            int k;
            for(k = this.a.length - 1; this.a[j] > this.a[k]; --k) {
            }

            int temp = this.a[k];
            this.a[k] = this.a[j];
            this.a[j] = temp;
            int r = this.a.length - 1;

            for(int s = j + 1; r > s; ++s) {
                temp = this.a[s];
                this.a[s] = this.a[r];
                this.a[r] = temp;
                --r;
            }

            this.numLeft = this.numLeft.subtract(BigInteger.ONE);
            return this.a;
        }
    }
}
