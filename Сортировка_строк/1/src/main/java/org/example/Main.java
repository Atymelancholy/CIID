package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"The", "House", "of", "the", "Rising", "Sun"};

        System.out.println("До сортировки: " + Arrays.toString(array));

        LSDSorter sorter = new LSDSorter(array);
        sorter.lsdSort();

        String[] sortedArray = sorter.getSortedArray();
        System.out.println("После сортирвки: " + Arrays.toString(sortedArray));
    }
}
