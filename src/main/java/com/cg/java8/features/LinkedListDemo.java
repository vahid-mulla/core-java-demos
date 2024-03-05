package com.cg.java8.features;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insert("This");
        singleLinkedList.insert("is");
        singleLinkedList.insert("single");
        singleLinkedList.insert("linked");
        singleLinkedList.insert("list");
        singleLinkedList.insert("list");
        singleLinkedList.insert("list");
        singleLinkedList.insert("list");

        //singleLinkedList.displayList();


        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(5);
        integerLinkedList.add(6);
        integerLinkedList.add(7);
        integerLinkedList.add(8);
        integerLinkedList.add(9);
        integerLinkedList.add(10);

        integerLinkedList.addFirst(21);
        integerLinkedList.offerFirst(22);

        integerLinkedList.forEach(il -> {
            System.out.println("List item is : " + il);
        });

    }
}
