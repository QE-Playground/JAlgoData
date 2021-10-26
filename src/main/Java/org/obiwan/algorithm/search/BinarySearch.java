package org.obiwan.algorithm.search;

public class BinarySearch<T extends Comparable<T>> extends BaseSearch<T> implements ISearch<T> {
    public BinarySearch() {

    }

    @Override
    public int search(Comparable[] arr, Comparable elementToSearch) {
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

    @Override
    public void print(T elementToSearch, int index) {
        super.print(elementToSearch, index);
    }
}
