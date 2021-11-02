package org.obiwan.algorithm.sort;

public class InterchangeSort<T extends Comparable<T>> extends BaseSort<T> implements ISort<T> {
    @Override
    public void sort(T[] a) {
        interchangeSort(a);
    }

    protected void interchangeSort(T[] a) {
        int N = a.length;

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (a[j].compareTo(a[i]) < 0) {
                    swap(i , j, a);
                }
            }
        }
    }
}
