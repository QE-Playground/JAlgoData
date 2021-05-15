import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSortingAlgorithms {

    private int[] arrayToTest;
    private static final int[] expectedArray = new int[]{1, 2, 4, 5, 6, 8, 12, 15};

    @Before
    public void setArrayToTest() {
        arrayToTest   = new int[]{12, 2, 8, 5, 1, 6, 4, 15};
    }

    @Test
    public void selectionSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.selectionSort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void insertionSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.insertionSort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void binaryInsertionSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.binaryInsertionSort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void interchangeSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.interchangeSort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void bubbleSortTest() {
        int[] array = arrayToTest;

        SortingAlgorithms.bubbleSort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }
}
