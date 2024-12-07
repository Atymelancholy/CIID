package org.example;
import java.util.Arrays;

public class LSDSorter {
    private String[] array;

    public LSDSorter(String[] array) {
        this.array = array;
    }

    public void lsdSort() {
        int maxLength = 0;
        for (String s : array) {
            maxLength = Math.max(maxLength, s.length());
        }

        for (int d = maxLength - 1; d >= 0; d--) {
            countingSortByDigit(d);
        }

        Arrays.sort(array, (a, b) -> Integer.compare(a.length(), b.length()));
    }

    private void countingSortByDigit(int digitIndex) {
        int r = 256;
        int[] count = new int[r + 1];
        String[] aux = new String[array.length];

        for (String s : array) {
            char c = getCharAt(s, digitIndex);
            count[c + 1]++;
        }

        for (int i = 0; i < r; i++) {
            count[i + 1] += count[i];
        }

        for (String s : array) {
            char c = getCharAt(s, digitIndex);
            aux[count[c]++] = s;
        }

        System.arraycopy(aux, 0, array, 0, array.length);
    }

    private char getCharAt(String s, int index) {
        return (index < s.length()) ? s.charAt(index) : ' ';
    }

    public String[] getSortedArray() {
        return array;
    }
}
