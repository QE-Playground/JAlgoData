package org.obiwan.algorithm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.obiwan.algorithm.sort.*;

import java.util.Arrays;

public class TestSortingAlgorithms {

    private Integer[] arrayToTest;
    private Integer[] anotherArrayToTest;
    private Float[]   floatArray;
    private String[]  countries;
    private static final Integer[] expectedArray        = new Integer[]{1, 2, 4, 5, 6, 8, 12, 15};
    private static final Integer[] anotherExpectedArray = new Integer[]{6, 12, 18, 42, 44, 55, 67, 94};
    private static final Float[]   expectedFloatArray   = new Float[]{1.0f, 2.0f, 4.0f, 5.0f, 6.0f, 8.0f, 12.0f, 15.0f};
    private static final String[]  sortedCountries      = new String[]{"America", "Australia", "Denmark", "France", "Germany", "India", "Italy", "Netherlands", "South-Africa", "Yugoslavia", "Zimbabwe"};

    @Before
    public void setArrayToTest() {
        arrayToTest        = new Integer[]{12, 2, 8, 5, 1, 6, 4, 15};
        anotherArrayToTest = new Integer[]{44, 55, 12, 42, 94, 18, 6, 67};
        floatArray         = new Float[]{12.0f, 2.0f, 8.0f, 5.0f, 1.0f, 6.0f, 4.0f, 15.0f};
        countries          = new String[]{"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
    }

    @Test
    public void selectionSortTest() {
        Integer[] array = arrayToTest;
        ISort<Integer> sortingAlgorithm = new SelectionSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void selectionSortFloatTest() {
        Float[] array = floatArray;
        ISort<Float> sortingAlgorithm = new SelectionSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void selectionSortStringTest() {
        String[] array = countries;
        ISort<String> sortingAlgorithm = new SelectionSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void insertionSortTest() {
        Integer[] array = arrayToTest;
        ISort<Integer> sortingAlgorithm = new InsertionSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void insertionSortFloatTest() {
        Float[] array = floatArray;
        ISort<Float> sortingAlgorithm = new InsertionSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void insertionSortStringTest() {
        String[] array = countries;
        ISort<String> sortingAlgorithm = new InsertionSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void binaryInsertionSortTest() {
        Integer[] array = arrayToTest;
        ISort<Integer> sortingAlgorithm = new BinaryInsertionSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void binaryInsertionSortFloatTest() {
        Float[] array = floatArray;
        ISort<Float> sortingAlgorithm = new BinaryInsertionSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void binaryInsertionSortStringTest() {
        String[] array = countries;
        ISort<String> sortingAlgorithm = new BinaryInsertionSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void interchangeSortTest() {
        Integer[] array = arrayToTest;
        ISort<Integer> sortingAlgorithm = new InterchangeSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void interchangeSortFloatTest() {
        Float[] array = floatArray;
        ISort<Float> sortingAlgorithm = new InterchangeSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void interchangeSortStringTest() {
        String[] array = countries;
        ISort<String> sortingAlgorithm = new InterchangeSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
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
    public void bubbleSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.bubbleSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void bubbleSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.bubbleSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
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
    public void shakerSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shakerSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void shakerSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shakerSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void heapSortTest() {
        Integer[] array = arrayToTest;
        ISort<Integer> sortingAlgorithm = new HeapSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void heapSortFloatTest() {
        Float[] array = floatArray;
        ISort<Float> sortingAlgorithm = new HeapSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void heapSortStringTest() {
        String[] array = countries;
        ISort<String> sortingAlgorithm = new HeapSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
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
    public void shellSortFloatTest() {
        Float[] array = floatArray;
        int[] steps = new int[]{5, 3, 1};
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shellSort(array, steps);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void shellSortStringTest() {
        String[] array = countries;
        int[] steps = new int[]{5, 3, 1};
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shellSort(array, steps);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void quickSortTest() {
        Integer[] array = arrayToTest;
        ISort<Integer> sortingAlgorithm = new QuickSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void quickSortFloatTest() {
        Float[] array = floatArray;
        ISort<Float> sortingAlgorithm = new QuickSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void quickSortStringTest() {
        String[] array = countries;
        ISort<String> sortingAlgorithm = new QuickSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void mergeSortTest() {
        Integer[] array = arrayToTest;
        ISort<Integer> sortingAlgorithm = new MergeSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void mergeSortFloatTest() {
        Float[] array = floatArray;
        ISort<Float> sortingAlgorithm = new MergeSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void mergeSortStringTest() {
        String[] array = countries;
        ISort<String> sortingAlgorithm = new MergeSort<>();

        sortingAlgorithm.sort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
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
