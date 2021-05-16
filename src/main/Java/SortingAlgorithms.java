import java.util.Arrays;

public class SortingAlgorithms {
    public static void radixSort(int[] arr) {
        int n = arr.length;
        int m = getMax(arr);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, exp);
    }

    public static void mergeSort(int[] a) {
        int k = 1, n = a.length;

        do {
            int p = 0, pb = 0, pc = 0;
            int[] b = new int[n], c = new int[n];

            while (p < n) {
                for (int i = 0; (p < n) && (i < k); i++) b[pb++] = a[p++];
                for (int i = 0; (p < n) && (i < k); i++) c[pc++] = a[p++];
            }

            merge(a, b, c, pb, pc, k);

            k *= 2;
        } while (k < n);
    }

    public static void quickSort(int[] a, int l, int r) {
        int i = l, j = r;
        int x = a[(l+r)/2];

        do {
            while (a[i] < x) i++;
            while (a[j] > x) j--;

            if (i <= j) {
                swap(i, j, a);
                i++;
                j--;
            }
        } while (i < j);

        if (l < j) quickSort(a, l, j);
        if (i < r) quickSort(a, i, r);
    }

    public static void shellSort(int[] a, int[] steps) {
        for (int step : steps) {
            insertionSort(a, step);
        }
    }

    public static void heapSort(int[] a) {
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

    public static void shakerSort(int[] a) {
        int N = a.length;
        int l = 0, r = N-1, k = N-1;

        while (l < r) {
            int j = r;

            while (j > l) {
                if (a[j] < a[j-1]) {
                    swap(j , j-1, a);
                    k = j;
                }
                j--;
            }

            l = k;
            j = l;

            while (j < r) {
                if (a[j] > a[j+1]) {
                    swap(j , j+1, a);
                    k = j;
                }
                j++;
            }

            r = k;
        }
    }

    public static void bubbleSort(int[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = N-1; j > i; j--) {
                if (a[j] < a[j-1]) {
                    swap(j , j-1, a);
                }
            }
        }
    }

    public static void interchangeSort(int[] a) {
        int N = a.length;

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (a[j] < a[i]) {
                    swap(i , j, a);
                }
            }
        }
    }

    public static void binaryInsertionSort(int[] a) {
        int l, r, m, temp;

        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            l = 0;
            r = i-1;

            while (l <= r) {
                m = (l + r) / 2;

                if (temp < a[m]) {
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

    public static void insertionSort(int[] a) {
        int pos, temp;
        int N = a.length;

        for (int i = 1; i < N; i++) {
            temp = a[i];
            pos = i-1;

            while ((pos >= 0) && (a[pos] > temp)) {
                a[pos+1] = a[pos];
                pos--;
            }

            a[pos+1] = temp;
        }
    }

    public static void selectionSort(int[] arr) {
        int min;
        int N = arr.length;

        for (int i = 0; i < N-1; i++) {
            min = i;

            for (int j = i+1; j < N; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            swap(min, i, arr);
        }
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] a, int step) {
        int pos, temp;
        int N = a.length;

        for (int i = step; i < N; i++) {
            temp = a[i];
            pos = i-step;

            while ((pos >= 0) && (a[pos] > temp)) {
                a[pos+step] = a[pos];
                pos = pos - step;
            }

            a[pos+step] = temp;
        }
    }

    private static void merge(int[] a, int[] b, int[] c, int nb, int nc, int k) {
        int p = 0, pb = 0, pc = 0, ib = 0, ic = 0;

        while ((0 < nb) && (0 < nc)) {
            int kb = Math.min(k, nb);
            int kc = Math.min(k, nc);

            if (b[pb+ib] <= c[pc+ic]) {
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

    private static void siftUp(int[] a, int l, int r) {
        int i = l, j = 2 * i;
        int x = a[i];
        int maxTry = 0;

        while (j <= r && maxTry < 10) {
            if (j < r) {
                if (a[j] < a[j+1]) j++;
                if (a[j] < x) {
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

    private static void swap(int i, int j, int[] arr) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    private static void countSort(int arr[], int exp) {
        int n = arr.length;
        int output[] = new int[n]; // output array
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

    private static int getMax(int arr[]) {
        int n = arr.length;
        int mx = arr[0];

        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];

        return mx;
    }
}
