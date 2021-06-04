public class SearchAlgorithms<T extends Comparable<T>> {

    public int linearSearch(T[] arr, T elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index].equals(elementToSearch))
                return index;
        }
        return -1;
    }

    public int binarySearch(T[] arr, T elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // termination condition (element isn't present)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // if the middle element is our goal element, return its index
            if (arr[middleIndex].compareTo(elementToSearch) == 0) {
                return middleIndex;
            }

            // if the middle element is smaller
            // point our index to the middle+1, taking the first half out of consideration
            else if (arr[middleIndex].compareTo(elementToSearch) == -1 )
                firstIndex = middleIndex + 1;

                // if the middle element is bigger
                // point our index to the middle-1, taking the second half out of consideration
            else if (arr[middleIndex].compareTo(elementToSearch) == 1)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    public void print(T elementToSearch, int index) {
        if (index == -1){
            System.out.println(elementToSearch + " not found.");
        }
        else {
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }
}
