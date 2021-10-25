package org.obiwan.datastruct;

import org.junit.Test;

public class TestSinglyLinkedList {
    /**
     * Currently I don't assert anything. Just look at the console log.
     */

    @Test
    public void testAppendHead() {
        SinglyLinkedList<Integer> listInt   = new SinglyLinkedList<>();
        SinglyLinkedList<Float>   listFloat = new SinglyLinkedList<>();

        System.out.println("A singly linked list with integer data");

        listInt
                .appendHead(1)
                .appendHead(2)
                .appendHead(3)
                .appendHead(4)
                .appendHead(5)
                .print();

        System.out.println("A singly linked list with float data");

        listFloat
                .appendHead(1.0f)
                .appendHead(2.0f)
                .appendHead(3.0f)
                .appendHead(4.0f)
                .appendHead(5.0f)
                .print();
    }

    @Test
    public void testAppendTail() {
        SinglyLinkedList<Integer> listInt   = new SinglyLinkedList<>();
        SinglyLinkedList<String>  listString = new SinglyLinkedList<>();

        System.out.println("A singly linked list with integer data");

        listInt
                .appendTail(1)
                .appendTail(2)
                .appendTail(3)
                .appendTail(4)
                .appendTail(5)
                .print();

        System.out.println("A singly linked list with String data");

        listString
                .appendTail("Vietnam")
                .appendTail("France")
                .appendTail("Switzerland")
                .appendTail("Australia")
                .appendTail("Ireland")
                .print();
    }

    @Test
    public void testAppendAfter() {
        SinglyLinkedList<Integer> listInt   = new SinglyLinkedList<>();
        SinglyLinkedList<String>  listString = new SinglyLinkedList<>();

        System.out.println("A singly linked list with integer data");

        listInt
                .appendTail(1)
                .appendTail(2)
                .appendTail(3)
                .appendTail(4)
                .appendTail(6)
                .print();

        System.out.println("Append '5' after '4' ...");

        listInt.appendAfter(4,5)
                .print();

        System.out.println("A singly linked list with String data");

        listString
                .appendTail("Vietnam")
                .appendTail("France")
                .appendTail("Switzerland")
                .appendTail("Australia")
                .appendTail("Ireland")
                .print();

        System.out.println("Append 'Germany' after 'Switzerland' ...");

        listString.appendAfter("Switzerland", "Germany")
                .print();
    }

    @Test
    public void testRemove() {
        SinglyLinkedList<Integer> listInt   = new SinglyLinkedList<>();
        SinglyLinkedList<String>  listString = new SinglyLinkedList<>();

        System.out.println("A singly linked list with integer data");

        listInt
                .appendTail(1)
                .appendTail(2)
                .appendTail(3)
                .appendTail(4)
                .appendTail(7)
                .appendTail(5)
                .print();

        System.out.println("Remove '7' ...");

        listInt.remove(7)
                .print();

        System.out.println("A singly linked list with String data");

        listString
                .appendTail("Vietnam")
                .appendTail("France")
                .appendTail("Switzerland")
                .appendTail("Australia")
                .appendTail("Germany")
                .appendTail("Ireland")
                .print();

        System.out.println("Remove 'Germany' ...");

        listString.remove("Germany")
                .print();
    }

    @Test
    public void testSelectionSort() {
        SinglyLinkedList<Integer> listInt   = new SinglyLinkedList<>();
        SinglyLinkedList<String>  listString = new SinglyLinkedList<>();

        System.out.println("A singly linked list with integer data");

        listInt
                .appendTail(10)
                .appendTail(9)
                .appendTail(20)
                .appendTail(8)
                .appendTail(1)
                .appendTail(5)
                .print();

        System.out.println("Selection sort on the data field ...");

        listInt.selectionSort()
                .print();

        System.out.println("A singly linked list with String data");

        listString
                .appendTail("Vietnam")
                .appendTail("France")
                .appendTail("Switzerland")
                .appendTail("Australia")
                .appendTail("Germany")
                .appendTail("Ireland")
                .print();

        System.out.println("Selection sort on the data field ...");

        listString.selectionSort()
                .print();
    }
}
