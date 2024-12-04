package org.example;

class ArrayBasedBST {
    private int[] keys;
    private int[] left;
    private int[] right;
    private int size;
    private int rootIndex;

    public ArrayBasedBST(int capacity) {
        keys = new int[capacity];
        left = new int[capacity];
        right = new int[capacity];
        size = 0;
        rootIndex = -1;

        for (int i = 0; i < capacity; i++) {
            left[i] = -1;
            right[i] = -1;
        }
    }

    public void insert(int key) {
        if (size == keys.length) {
            throw new IllegalStateException("Error... (T_T)");
        }
        if (rootIndex == -1) {
            rootIndex = size;
            keys[size++] = key;
        } else {
            insertRec(rootIndex, key);
        }
    }

    private void insertRec(int currentIndex, int key) {
        if (key < keys[currentIndex]) {
            if (left[currentIndex] == -1) {
                left[currentIndex] = size;
                keys[size++] = key;
            } else {
                insertRec(left[currentIndex], key);
            }
        } else if (key > keys[currentIndex]) {
            if (right[currentIndex] == -1) {
                right[currentIndex] = size;
                keys[size++] = key;
            } else {
                insertRec(right[currentIndex], key);
            }
        }
    }

    public boolean search(int key) {
        return searchRec(rootIndex, key);
    }

    private boolean searchRec(int currentIndex, int key) {
        if (currentIndex == -1) {
            return false;
        }
        if (keys[currentIndex] == key) {
            return true;
        } else if (key < keys[currentIndex]) {
            return searchRec(left[currentIndex], key);
        } else {
            return searchRec(right[currentIndex], key);
        }
    }

    public void inOrderTraversal() {
        inOrderRec(rootIndex);
    }

    private void inOrderRec(int currentIndex) {
        if (currentIndex != -1) {
            inOrderRec(left[currentIndex]);
            System.out.print(keys[currentIndex] + " ");
            inOrderRec(right[currentIndex]);
        }
    }
}
