import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSortingAlgorithms {

    private Integer[] arrayToTest;
    private Integer[] anotherArrayToTest;
    private static final Integer[] expectedArray        = new Integer[]{1, 2, 4, 5, 6, 8, 12, 15};
    private static final Integer[] anotherExpectedArray = new Integer[]{6, 12, 18, 42, 44, 55, 67, 94};

    @Before
    public void setArrayToTest() {
        arrayToTest        = new Integer[]{12, 2, 8, 5, 1, 6, 4, 15};
        anotherArrayToTest = new Integer[]{44, 55, 12, 42, 94, 18, 6, 67};
    }

    @Test
    public void selectionSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.selectionSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.selectionSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void insertionSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.insertionSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.insertionSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void binaryInsertionSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.binaryInsertionSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.binaryInsertionSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void interchangeSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.interchangeSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.interchangeSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void bubbleSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.bubbleSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.bubbleSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void shakerSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shakerSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.shakerSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void heapSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.heapSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.heapSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void shellSortTest() {
        Integer[] array = arrayToTest;
        int[] steps = new int[]{5, 3, 1};
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shellSort(array, steps);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.shellSort(array, steps);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void quickSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.quickSort(array, 0, array.length - 1);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.quickSort(array, 0, array.length - 1);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void mergeSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.mergeSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.mergeSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void radixSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.radixSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.radixSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }
}
