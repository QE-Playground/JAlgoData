public class main {
    public static void main(String args[]) throws Exception {
        int[] array1 = new int[]{12, 2, 8, 5, 1, 6, 4, 15};
        int[] array2 = new int[]{1, 2, 4, 5, 6, 8, 12, 15};
        int elementToSearch = 8;

        SearchAlgorithms.print(elementToSearch, SearchAlgorithms.linearSearch(array1, elementToSearch));
        SearchAlgorithms.print(elementToSearch, SearchAlgorithms.binarySearch(array2, elementToSearch));

        int[] array3 = array1;

        SortingAlgorithms.selectionSort(array3);
        SortingAlgorithms.print(array3);
    }
}
