package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Version> versions = new ArrayList<>();
        versions.add(new Version("115.10.1"));
        versions.add(new Version("115.1.1"));
        versions.add(new Version("115.10.0"));
        versions.add(new Version("114.0.5"));
        versions.add(new Version("115.10.10"));

        System.out.println("До сортировки:");
        for (Version version : versions) {
            System.out.println(version);
        }

        bubbleSort(versions);

        System.out.println("После сортировки:");
        for (Version version : versions) {
            System.out.println(version);
        }
    }

    public static void bubbleSort(List<Version> versions) {
        int n = versions.size();
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (versions.get(i).compareTo(versions.get(i + 1)) > 0) {
                    Version temp = versions.get(i);
                    versions.set(i, versions.get(i + 1));
                    versions.set(i + 1, temp);
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
