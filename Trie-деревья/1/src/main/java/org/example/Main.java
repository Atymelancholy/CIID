package org.example;

public class Main {
    public static void main(String[] args) {
        String text = "pop";
        SuffixTree suffixTree = new SuffixTree(text);
        int uniqueSubstrings = suffixTree.countUniqueSubstrings();
        System.out.println("Количество уникальных подстрок в " + text + " - " + uniqueSubstrings);
    }
}

