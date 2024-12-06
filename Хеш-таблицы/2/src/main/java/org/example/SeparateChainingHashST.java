package org.example;

import java.util.LinkedList;

public class SeparateChainingHashST<Key, Value> {
    private int M;
    private LinkedList<Node>[] chains;

    private class Node {
        Key key;
        Value value;

        Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public SeparateChainingHashST(int M) {
        this.M = M;
        chains = (LinkedList<Node>[]) new LinkedList[M];
        for (int i = 0; i < M; i++) {
            chains[i] = new LinkedList<>();
        }
    }

    private int hash1(Key key) {
        return (key.hashCode() * 11 % M + M) % M;
    }

    private int hash2(Key key) {
        return (key.hashCode() * 17 % M + M) % M;
    }

    public void put(Key key, Value value) {
        int index1 = hash1(key);
        int index2 = hash2(key);

        int targetIndex = chains[index1].size() <= chains[index2].size() ? index1 : index2;

        for (Node node : chains[targetIndex]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        chains[targetIndex].add(new Node(key, value));
    }

    public void printTable() {
        for (int i = 0; i < M; i++) {
            System.out.print("Цепочка " + i + ": ");
            for (Node node : chains[i]) {
                System.out.print("(" + node.key + ", " + node.value + ") ");
            }
            System.out.println();
        }
    }

    public double averageProbesForHits() {
        int totalProbes = 0;
        int totalKeys = 0;

        for (LinkedList<Node> chain : chains) {
            int chainSize = chain.size();
            totalProbes += (chainSize * (chainSize + 1)) / 2;
            totalKeys += chainSize;
        }

        return totalKeys == 0 ? 0 : (double) totalProbes / totalKeys;
    }

    public double averageProbesForMisses() {
        int totalProbes = 0;

        for (LinkedList<Node> chain : chains) {
            totalProbes += chain.size();
        }

        return (double) totalProbes / M;
    }
}
