package org.obiwan.algorithm;

import java.util.Arrays;

public class SortingAlgorithms<T extends Comparable<T>> {

    public void radixSort(Integer[] arr) {
        int n = arr.length;
        Integer m = getMax(arr);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, exp);
    }

    public void shellSort(T[] a, int[] steps) {
        for (int step : steps) {
            insertionSort(a, step);
        }
    }

    public void heapSort(T[] a) {
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

    public void shakerSort(T[] a) {
        int N = a.length;
        int l = 0, r = N-1, k = N-1;

        while (l < r) {
            int j = r;

            while (j > l) {
                if (a[j].compareTo(a[j-1]) < 0) {
                    swap(j , j-1, a);
                    k = j;
                }
                j--;
            }

            l = k;
            j = l;

            while (j < r) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    swap(j , j+1, a);
                    k = j;
                }
                j++;
            }

            r = k;
        }
    }

    public void bubbleSort(T[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = N-1; j > i; j--) {
                if (a[j].compareTo(a[j-1]) < 0) {
                    swap(j , j-1, a);
                }
            }
        }
    }

    public void interchangeSort(T[] a) {
        int N = a.length;

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (a[j].compareTo(a[i]) < 0) {
                    swap(i , j, a);
                }
            }
        }
    }

    public void binaryInsertionSort(T[] a) {
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

    public void insertionSort(T[] a) {
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

    public void selectionSort(T[] arr) {
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

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private void insertionSort(T[] a, int step) {
        int pos;
        T temp;
        int N = a.length;

        for (int i = step; i < N; i++) {
            temp = a[i];
            pos = i-step;

            while ((pos >= 0) && (a[pos].compareTo(temp) > 0)) {
                a[pos+step] = a[pos];
                pos = pos - step;
            }

            a[pos+step] = temp;
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

    private void swap(int i, int j, T[] arr) {
        T t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    private void countSort(Integer arr[], int exp) {
        int n = arr.length;
        Integer output[] = new Integer[n]; // output array
        int i;
        int count[] = new int[10];

        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    private Integer getMax(Integer arr[]) {
        int n = arr.length;
        Integer mx = arr[0];

        for (int i = 1; i < n; i++)
            if (arr[i].compareTo(mx) > 0)
                mx = arr[i];

        return mx;
    }
}
