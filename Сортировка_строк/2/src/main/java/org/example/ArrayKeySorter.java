package org.example;
import java.util.Arrays;

public class ArrayKeySorter {

    private ArrayKeySorter() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static class ArrayKey implements Comparable<ArrayKey> {
        private final int[] key;

        public ArrayKey(int[] key) {
            this.key = key;
        }

        public int getKeyAt(int index) {
            return index < key.length ? key[index] : -1;
        }

        public int length() {
            return key.length;
        }

        @Override
        public int compareTo(ArrayKey other) {
            int lengthCmp = Integer.compare(this.length(), other.length());
            if (lengthCmp != 0) {
                return lengthCmp;
            }
            int maxLength = this.length();
            for (int i = 0; i < maxLength; i++) {
                int cmp = Integer.compare(this.getKeyAt(i), other.getKeyAt(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        }

        @Override
        public String toString() {
            return Arrays.toString(key);
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
