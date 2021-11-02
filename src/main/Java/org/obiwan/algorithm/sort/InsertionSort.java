package org.obiwan.algorithm.sort;

public class InsertionSort<T extends Comparable<T>> implements ISort<T> {
    @Override
    public void sort(T[] a) {
        insertionSort(a);
    }

    protected void insertionSort(T[] a) {
        int pos;
        T temp;
        int N = a.length;

        for (int i = 1; i < N; i++) {
            temp = a[i];
            pos = i-1;

            while ((pos >= 0) && (a[pos].compareTo(temp) > 0)) {
                a[pos+1] = a[pos];
                pos--;
            }

            a[pos+1] = temp;
        }
    }
}
