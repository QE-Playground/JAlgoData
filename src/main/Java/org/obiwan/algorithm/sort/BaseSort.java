package org.obiwan.algorithm.sort;

public class BaseSort<T extends Comparable<T>> {
    public BaseSort() {
    }

    protected void swap(int i, int j, T[] arr) {
        T t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    protected Integer getMax(Integer arr[]) {
        int n = arr.length;
        Integer mx = arr[0];

        for (int i = 1; i < n; i++)
            if (arr[i].compareTo(mx) > 0)
                mx = arr[i];

        return mx;
    }
}
