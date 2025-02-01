package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayKey[] keys = {
                new ArrayKey(new int[]{3, 1, 4}),
                new ArrayKey(new int[]{3, 1, 3, 9}),
                new ArrayKey(new int[]{1, 5, 9}),
                new ArrayKey(new int[]{2, 7, 1, 8}),
                new ArrayKey(new int[]{3, 1, 3, 8})
        };

        System.out.println("До сортировки:");
        for (ArrayKey key : keys) {
            System.out.println(key);
        }

        sort(keys);

        System.out.println("\nПосле сортировки:");
        for (ArrayKey key : keys) {
            System.out.println(key);
        }
    }

    public static void sort(ArrayKey[] keys) {
        Arrays.sort(keys);
    }
}
