import org.junit.Assert;
import org.junit.Test;

public class TestSearchAlgorithms {

    private static int[] array;
    private static final int elementToSearch = 8;

    @Test
    public void linearSearchTest() {
        array = new int[]{12, 2, 8, 5, 1, 6, 4, 15};
        int index = SearchAlgorithms.linearSearch(array, elementToSearch);

        Assert.assertEquals(2, index);
        SearchAlgorithms.print(elementToSearch, index);
    }

    @Test
    public void binarySearchTest() {
        array = new int[]{1, 2, 4, 5, 6, 8, 12, 15};
        int index = SearchAlgorithms.binarySearch(array, elementToSearch);

        Assert.assertEquals(5, index);
        SearchAlgorithms.print(elementToSearch, index);
    }
}
