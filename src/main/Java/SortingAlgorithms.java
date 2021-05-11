import java.util.Arrays;

public class SortingAlgorithms {

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

    private static void swap(int i, int j, int[] arr) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
