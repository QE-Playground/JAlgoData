import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSortingAlgorithms {

    private int[] arrayToTest;
    private int[] anotherArrayToTest;
    private static final int[] expectedArray        = new int[]{1, 2, 4, 5, 6, 8, 12, 15};
    private static final int[] anotherExpectedArray = new int[]{6, 12, 18, 42, 44, 55, 67, 94};

    @Before
    public void setArrayToTest() {
        arrayToTest        = new int[]{12, 2, 8, 5, 1, 6, 4, 15};
        anotherArrayToTest = new int[]{44, 55, 12, 42, 94, 18, 6, 67};
    }

    @Test
    public void selectionSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.selectionSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.selectionSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void insertionSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.insertionSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.insertionSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void binaryInsertionSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.binaryInsertionSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.binaryInsertionSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void interchangeSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.interchangeSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.interchangeSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void bubbleSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.bubbleSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.bubbleSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void shakerSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.shakerSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.shakerSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void heapSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.heapSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.heapSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void shellSortTest() {
        int[] array = arrayToTest;
        int[] steps = new int[]{5, 3, 1};

        SortingAlgorithms.shellSort(array, steps);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.shellSort(array, steps);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void quickSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.quickSort(array, 0, array.length - 1);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.quickSort(array, 0, array.length - 1);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void mergeSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.mergeSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.mergeSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void radixSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.radixSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        SortingAlgorithms.radixSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }
}
