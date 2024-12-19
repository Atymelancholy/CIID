package org.example;

public class Main {
    public static boolean isCyclicPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String doubledS1 = s1 + s1;

        return doubledS1.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "shizognome";
        String s2 = "zognomeshi";

        if (isCyclicPermutation(s1, s2)) {
            System.out.println(s2 + " является циклической перестановкой " + s1);
        } else {
            System.out.println(s2 + " не является циклической перестановкой " + s1);
        }
    }
}
