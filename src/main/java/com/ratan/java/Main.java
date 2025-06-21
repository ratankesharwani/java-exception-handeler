package com.ratan.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void greet(List<String> list, Boolean remove) {
        List<String> mySortedList;
        if (remove) {
            mySortedList = list.stream()
                    .distinct()
                    .sorted(Comparator.comparing(String::length))
                    .collect(Collectors.toList());
        } else {
            mySortedList = list.stream()
                    .sorted(Comparator.comparing(String::length))
                    .collect(Collectors.toList());
        }
        System.out.println(mySortedList);
    }

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Boolean remove = true;
        greet(myList, remove);
    }
}
