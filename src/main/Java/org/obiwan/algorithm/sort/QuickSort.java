package org.obiwan.algorithm.sort;

public class QuickSort<T extends Comparable<T>> extends BaseSort<T> implements ISort<T> {
    public QuickSort() {
    }

    @Override
    public void sort(T[] a) {
        quickSort(a, 0, a.length - 1);
    }

    protected void quickSort(T[] a, int l, int r) {
        int i = l, j = r;
        T x = a[(l+r)/2];

        do {
            while (a[i].compareTo(x) < 0) i++;
            while (a[j].compareTo(x) > 0) j--;

            if (i <= j) {
                swap(i, j, a);
                i++;
                j--;
            }
        } while (i < j);

        if (l < j) quickSort(a, l, j);
        if (i < r) quickSort(a, i, r);
    }
}
