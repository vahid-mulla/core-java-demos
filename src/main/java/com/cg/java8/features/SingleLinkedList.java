package com.cg.java8.features;

public class SingleLinkedList {
    public Node head = null;
    public Node tail = null;

    public void insert(String data){
        Node newNode = new Node(data);
        if(null == head){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void displayList(){
        Node current = head;
        if(current == null){
            System.out.println("Linked list is empty");
        } else {
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
