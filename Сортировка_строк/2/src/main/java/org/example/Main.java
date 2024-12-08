package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayKeySorter.ArrayKey[] keys = {
                new ArrayKeySorter.ArrayKey(new int[]{3, 1, 4}),
                new ArrayKeySorter.ArrayKey(new int[]{3, 1, 3, 9}),
                new ArrayKeySorter.ArrayKey(new int[]{1, 5, 9}),
                new ArrayKeySorter.ArrayKey(new int[]{2, 7, 1, 8}),
                new ArrayKeySorter.ArrayKey(new int[]{3, 1, 3, 8})
        };

        System.out.println("До сортировки:");
        for (ArrayKeySorter.ArrayKey key : keys) {
            System.out.println(key);
        }

        ArrayKeySorter.sort(keys);

        System.out.println("\nПосле сортировки:");
        for (ArrayKeySorter.ArrayKey key : keys) {
            System.out.println(key);
        }
    }
}
