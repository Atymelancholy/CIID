package org.example;

public class Main {
    public static void main(String[] args) {
        String b = "avg";
        String s = "avgtyavgavgavg";

        int index = RepeatedSubstringFinder.findLongestRepeatedSubstring(b, s);
        System.out.println("Индекс самой длинной повторяющейся подстроки: " + index);
    }
}

