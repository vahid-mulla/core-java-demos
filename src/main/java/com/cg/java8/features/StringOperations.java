package com.cg.java8.features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOperations {
    public static void main(String[] args) {
        String mitsubishi = "mitsubishi";
        Map<String, Long> characterMap = Arrays.stream(mitsubishi.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterMap);
        //m - 1
        //i - 3
        //t - 1
        //s - 2

    }
}
