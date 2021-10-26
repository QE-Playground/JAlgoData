package org.obiwan.algorithm.search;

public class BaseSearch<T extends Comparable<T>> {
    public BaseSearch() {

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
