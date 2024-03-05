package com.cg.java8.features;

import java.util.*;

public class HashCollectionDemo {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, -2, -1, -2, -20 ,5 ,6 ,3 ,4 ,7 ,8 ,9 ,-6 ,-8 ,-9 ,10 ,11 ,14 ,15 ,12 ,13 ,16 ,17,18,19};

        Map<Integer, String> hashMap = new HashMap<>();
        for(int i : arr) {
            hashMap.put(i, String.valueOf(i));
        }
        System.out.println("Hashmap " + hashMap);


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for(int i : arr) {
            linkedHashMap.put(i, String.valueOf(i));
        }
        System.out.println("LinkedHashMap " + linkedHashMap);


        Map<Integer, String> treeMap = new TreeMap<>();
        for(int i : arr) {
            treeMap.put(i, String.valueOf(i));
        }
        System.out.println("TreeMap " + treeMap);

        Map<Integer, String> hashTable = new Hashtable<>();
        for(int i : arr) {
            hashTable.put(i, String.valueOf(i));
        }
        System.out.println("HashTable " + hashTable);
    }
}
