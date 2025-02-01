package org.example;

import java.util.Arrays;
import java.util.Objects;

public class ArrayKey implements Comparable<ArrayKey> {
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
        for (int i = 0; i < this.length(); i++) {
            int cmp = Integer.compare(this.getKeyAt(i), other.getKeyAt(i));
            if (cmp != 0) {
                return cmp;
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ArrayKey arrayKey = (ArrayKey) obj;
        return Arrays.equals(key, arrayKey.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(key));
    }

    @Override
    public String toString() {
        return Arrays.toString(key);
    }
}

