package org.example;
import java.util.ArrayDeque;
import java.util.Deque;

    public class TwoStacksInDeque {
        private Deque<Integer> deque;

        public TwoStacksInDeque() {
            deque = new ArrayDeque<>();
        }

        public void pushA(int value) {
            deque.addFirst(value);
        }

        public int popA() {
            if (deque.isEmpty()) {
                throw new IllegalStateException("Stack A is empty");
            }
            return deque.removeFirst();
        }

        public void pushB(int value) {
            deque.addLast(value);
        }

        public int popB() {
            if (deque.isEmpty()) {
                throw new IllegalStateException("Stack B is empty");
            }
            return deque.removeLast();
        }
    }

