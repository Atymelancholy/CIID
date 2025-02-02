package org.example;

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
        sort(keys, 0, keys.length - 1);
    }

    private static void sort(ArrayKey[] keys, int low, int high) {
        if (low >= high) return;

        int lt = low;
        int gt = high;
        ArrayKey pivot = keys[low];
        int i = low + 1;

        while (i <= gt) {
            int cmp = keys[i].compareTo(pivot);
            if (cmp < 0) swap(keys, lt++, i++);
            else if (cmp > 0) swap(keys, i, gt--);
            else i++;
        }

        sort(keys, low, lt - 1);
        sort(keys, gt + 1, high);
    }

    private static void swap(ArrayKey[] keys, int i, int j) {
        ArrayKey temp = keys[i];
        keys[i] = keys[j];
        keys[j] = temp;
    }
}
