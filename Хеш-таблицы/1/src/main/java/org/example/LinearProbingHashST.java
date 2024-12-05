package org.example;

public class LinearProbingHashST<Key, Value> {
    private int n;
    private int m;
    private Key[] keys;
    private Value[] values;

    public LinearProbingHashST(int capacity) {
        m = capacity;
        n = 0;
        keys = (Key[]) new Object[m];
        values = (Value[]) new Object[m];
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % m;
    }

    public void put(Key key, Value value) {
        if (n >= m / 2) resize(2 * m);

        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % m) {
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        n++;
    }

    private void resize(int capacity) {
        LinearProbingHashST<Key, Value> temp = new LinearProbingHashST<>(capacity);
        for (int i = 0; i < m; i++) {
            if (keys[i] != null) {
                temp.put(keys[i], values[i]);
            }
        }
        keys = temp.keys;
        values = temp.values;
        m = temp.m;
    }

    public double averageCostOfHit() {
        if (n == 0) return 0.0;

        int totalProbes = 0;

        for (int i = 0; i < m; i++) {
            if (keys[i] != null) {
                int probes = 1;
                int j = hash(keys[i]);
                while (!keys[j].equals(keys[i])) {
                    j = (j + 1) % m;
                    probes++;
                    if (probes > m) {
                        throw new IllegalArgumentException("Ошибка в логике хэш-таблицы!");
                    }
                }
                totalProbes += probes;
            }
        }

        return (double) totalProbes / n;
    }
}
