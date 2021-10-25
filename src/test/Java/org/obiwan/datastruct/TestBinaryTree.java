package org.obiwan.datastruct;

import org.junit.Test;

public class TestBinaryTree {
    @Test
    public void testBinaryTreeSort() {
        BinaryTree<Integer> bTreeInt = new BinaryTree<>();
        BinaryTree<String>  btreeStr = new BinaryTree<>();

        System.out.println("A sorted binary tree with integer data");

        bTreeInt
                .insertNode(10)
                .insertNode(9)
                .insertNode(20)
                .insertNode(8)
                .insertNode(1)
                .insertNode(5)
                .print();

        System.out.println("A sorted binary tree with String data");

        btreeStr
                .insertNode("Vietnam")
                .insertNode("France")
                .insertNode("Switzerland")
                .insertNode("Australia")
                .insertNode("Germany")
                .insertNode("Ireland")
                .print();
    }
}
