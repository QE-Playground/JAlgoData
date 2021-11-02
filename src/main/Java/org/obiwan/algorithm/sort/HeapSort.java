package org.obiwan.algorithm.sort;

public class HeapSort<T extends Comparable<T>> extends BaseSort<T> implements ISort<T> {
    @Override
    public void sort(T[] a) {
        heapSort(a);
    }

    protected void heapSort(T[] a) {
        int N = a.length, l = N/2, r = N-1;

        while (l >= 0) {
            siftUp(a, l, N-1);
            l--;
        }

        while (r >= 0) {
            swap(0, r, a);
            r--;
            siftUp(a, 0, r);
        }
    }

    private void siftUp(T[] a, int l, int r) {
        int i = l, j = 2 * i;
        T x = a[i];
        int maxTry = 0;

        while (j <= r && maxTry < 10) {
            if (j < r) {
                if (a[j].compareTo(a[j+1]) < 0) j++;
                if (a[j].compareTo(x) < 0) {
                    break;
                } else {
                    a[i] = a[j];
                    i = j;
                    j = 2 * i;
                    a[i] = x;
                }
            } else {
                break;
            }
            maxTry++;
        }
    }
}
