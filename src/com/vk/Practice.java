package com.vk;

import java.util.HashSet;

public class Practice {
    public static void findDuplicates(int[] array) {
        if (array.length <= 0) {
            System.out.println("Invalid input");
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (int num : array) {
            if (!set.add(num)) {
                duplicateSet.add(num);
            }
        }

        duplicateSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        findDuplicates(new int[] { 1, 2, 3, 2, 4, 5, 7, 6, 7, 5 });
    }
}