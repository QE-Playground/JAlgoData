import org.junit.Assert;
import org.junit.Test;

public class TestSortingAlgorithms {

    private static final int[] arrayToTest   = new int[]{12, 2, 8, 5, 1, 6, 4, 15};
    private static final int[] expectedArray = new int[]{1, 2, 4, 5, 6, 8, 12, 15};

    @Test
    public void selectionSortTest() {
        final int[] array = arrayToTest;

        SortingAlgorithms.selectionSort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void insertionSortTest() {
        final int[] array = arrayToTest;

        SortingAlgorithms.insertionSort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }
}
