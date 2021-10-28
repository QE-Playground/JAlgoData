package org.obiwan.algorithm.sort;

public class MergeSort<T extends Comparable<T>> implements ISort<T> {
    public MergeSort() {
    }

    @Override
    public void sort(T[] a) {
        mergeSort(a);
    }

    protected void mergeSort(T[] a) {
        int k = 1, n = a.length;

        do {
            int p = 0, pb = 0, pc = 0;
            T[] b = (T[]) new Comparable[n];
            T[] c = (T[]) new Comparable[n];

            while (p < n) {
                for (int i = 0; (p < n) && (i < k); i++) b[pb++] = a[p++];
                for (int i = 0; (p < n) && (i < k); i++) c[pc++] = a[p++];
            }

            merge(a, b, c, pb, pc, k);

            k *= 2;
        } while (k < n);
    }

    private void merge(T[] a, T[] b, T[] c, int nb, int nc, int k) {
        int p = 0, pb = 0, pc = 0, ib = 0, ic = 0;

        while ((0 < nb) && (0 < nc)) {
            int kb = Math.min(k, nb);
            int kc = Math.min(k, nc);

            if (b[pb+ib].compareTo(c[pc+ic]) <= 0) {
                a[p++] = b[pb+ib]; ib++;
                if (ib == kb) {
                    for(; ic < kc; ic++) a[p++] = c[pc+ic];
                    pb += kb; pc += kc;
                    ib = 0; ic = 0;
                    nb -= kb; nc -= kc;
                }
            } else {
                a[p++] = c[pc+ic]; ic++;
                if (ic == kc) {
                    for(; ib < kb; ib++) a[p++] = b[pb+ib];
                    pb += kb; pc += kc;
                    ib = 0; ic = 0;
                    nb -= kb; nc -= kc;
                }
            }
        }
    }

}
