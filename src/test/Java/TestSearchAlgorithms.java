import org.junit.Assert;
import org.junit.Test;

public class TestSearchAlgorithms {

    private static Integer[] array;
    private static final Integer elementToSearch = 8;

    @Test
    public void linearSearchIntegerArrayTest() {
        array = new Integer[]{12, 2, 8, 5, 1, 6, 4, 15};
        SearchAlgorithms<Integer> searchAlgorithm = new SearchAlgorithms<>();
        int index = searchAlgorithm.linearSearch(array, elementToSearch);

        Assert.assertEquals(2, index);
        searchAlgorithm.print(elementToSearch, index);
    }

    @Test
    public void linearSearchFloatArrayTest() {
        Float[] floatArray = new Float[]{12.0f, 2.5f, 8.5f, 5.6f, 1.2f, 6.3f, 4.5f, 15.0f};
        Float elementToSearch = 8.5f;
        SearchAlgorithms<Float> searchAlgorithm = new SearchAlgorithms<>();
        int index = searchAlgorithm.linearSearch(floatArray, elementToSearch);

        Assert.assertEquals(2, index);
        searchAlgorithm.print(elementToSearch, index);
    }

    @Test
    public void binarySearchTest() {
        array = new Integer[]{1, 2, 4, 5, 6, 8, 12, 15};
        int index = SearchAlgorithms.binarySearch(array, elementToSearch);
        SearchAlgorithms<Integer> searchAlgorithm = new SearchAlgorithms<>();

        Assert.assertEquals(5, index);
        searchAlgorithm.print(elementToSearch, index);
    }
}
