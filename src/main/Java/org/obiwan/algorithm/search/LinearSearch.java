package org.obiwan.algorithm.search;

public class LinearSearch<T extends Comparable<T>> extends BaseSearch<T> implements ISearch<T> {
    public LinearSearch() {

    }

    @Override
    public int search(Comparable[] arr, Comparable elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index].equals(elementToSearch))
                return index;
        }
        return -1;
    }

    @Override
    public void print(T elementToSearch, int index) {
        super.print(elementToSearch, index);
    }
}
