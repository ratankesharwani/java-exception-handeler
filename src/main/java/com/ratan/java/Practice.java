package com.ratan.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(1100, 700, 650, 500);
        List<Integer> array2 = Arrays.asList(900, 750, 400, 10);
        // System.out.println(concat(array1, array2));
        System.out.println(concatAndSort(array1, array2));
    }

    static List<Integer> concat(List<Integer> array1, List<Integer> array2) {
        List<Integer> result = new ArrayList<>();
        result.addAll(array1);
        result.addAll(array2);
        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = 0; j < result.size() - i - 1; j++) {
                if (result.get(j) > result.get(j + 1)) {
                    int temp = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, temp);
                }
            }
        }
        return result;
    }

    static List<Integer> concatAndSort(List<Integer> array1, List<Integer> array2) {
        List<Integer> result = new ArrayList<>();
        result.addAll(array1);
        result.addAll(array2);
        Collections.sort(result);
        return result;
    }
}
