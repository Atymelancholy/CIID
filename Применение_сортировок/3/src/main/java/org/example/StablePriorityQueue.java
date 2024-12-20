package org.example;

import java.util.*;

public class StablePriorityQueue<T extends Comparable<T>> {
    private static class QueueItem<T extends Comparable<T>> implements Comparable<QueueItem<T>> {
        T value;
        int priority;
        int insertionIndex;

        QueueItem(T value, int priority, int insertionIndex) {
            this.value = value;
            this.priority = priority;
            this.insertionIndex = insertionIndex;
        }

        @Override
        public int compareTo(QueueItem<T> other) {
            int priorityComparison = Integer.compare(this.priority, other.priority);
            if (priorityComparison != 0) {
                return priorityComparison;
            }
            return Integer.compare(this.insertionIndex, other.insertionIndex);
        }
    }

    private PriorityQueue<QueueItem<T>> queue;
    private int insertionCounter;

    public StablePriorityQueue() {
        this.insertionCounter = 0;
        queue = new PriorityQueue<>();
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
