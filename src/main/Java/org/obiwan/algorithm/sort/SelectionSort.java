package org.obiwan.algorithm.sort;

public class SelectionSort<T extends Comparable<T>> extends BaseSort<T> implements ISort<T> {
    @Override
    public void sort(T[] a) {
        selectionSort(a);
    }

    protected void selectionSort(T[] arr) {
        int min;
        int N = arr.length;

        for (int i = 0; i < N-1; i++) {
            min = i;

            for (int j = i+1; j < N; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }

            swap(min, i, arr);
        }
    }
}
