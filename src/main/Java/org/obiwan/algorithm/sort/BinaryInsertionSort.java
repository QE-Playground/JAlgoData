package org.obiwan.algorithm.sort;

public class BinaryInsertionSort<T extends Comparable<T>> implements ISort<T> {
    @Override
    public void sort(T[] a) {
        binaryInsertionSort(a);
    }

    protected void binaryInsertionSort(T[] a) {
        int l, r, m;
        T temp;

        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            l = 0;
            r = i-1;

            while (l <= r) {
                m = (l + r) / 2;

                if (temp.compareTo(a[m]) < 0) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }

            for (int j = i-1; j >= l; j--) {
                a[j+1] = a[j];
            }

            a[l] = temp;

        }
    }
}
