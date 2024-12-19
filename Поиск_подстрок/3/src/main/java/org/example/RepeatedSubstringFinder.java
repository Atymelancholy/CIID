package org.example;

public class RepeatedSubstringFinder {
    public static int findLongestRepeatedSubstring(String b, String s) {
        int n = s.length();
        int m = b.length();
        int[] positions = new int[n];
        int posCount = 0;

        for (int i = 0; i <= n - m; i++) {
            if (s.substring(i, i + m).equals(b)) {
                positions[posCount++] = i;
            }
        }

        if (posCount == 0) {
            return -1;
        }

        int maxLength = 0;
        int bestStart = -1;

        for (int i = 0; i < posCount - 1; i++) {
            int currentStart = positions[i];
            int currentLength = 1;

            for (int j = i + 1; j < posCount; j++) {
                if (positions[j] == positions[i] + currentLength * m) {
                    currentLength++;
                } else {
                    break;
                }
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                bestStart = currentStart;
            }
        }
        return bestStart;
    }
}
