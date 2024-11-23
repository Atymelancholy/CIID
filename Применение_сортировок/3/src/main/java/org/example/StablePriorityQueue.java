package org.example;

import java.util.*;

public class StablePriorityQueue<T> {
    private static class QueueItem<T> {
        T value;
        int priority;
        int insertionIndex;

        QueueItem(T value, int priority, int insertionIndex) {
            this.value = value;
            this.priority = priority;
            this.insertionIndex = insertionIndex;
        }
    }

    private PriorityQueue<QueueItem<T>> queue;
    private int insertionCounter;

    public StablePriorityQueue() {
        this.insertionCounter = 0;
        queue = new PriorityQueue<>((a, b) -> {
            if (a.priority != b.priority) {
                return Integer.compare(a.priority, b.priority);
            } else {
                return Integer.compare(a.insertionIndex, b.insertionIndex);
            }
        });
    }

    public void add(T value, int priority) {
        queue.add(new QueueItem<>(value, priority, insertionCounter++));
    }

    public T poll() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll().value;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
