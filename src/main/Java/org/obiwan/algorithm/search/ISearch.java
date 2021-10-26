package org.obiwan.algorithm.search;

public interface ISearch<T extends Comparable<T>> {
    int search(T[] arr, T elementToSearch);

    void print(T elementToSearch, int index);
}
