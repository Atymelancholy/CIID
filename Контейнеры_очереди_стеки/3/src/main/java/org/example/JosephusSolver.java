package org.example;
import java.util.LinkedList;
import java.util.Queue;

    public class JosephusSolver {

        private int n;
        private int m;
        private Queue<Integer> queue;

        public JosephusSolver(int n, int m) {
            this.n = n;
            this.m = m;
            this.queue = new LinkedList<>();
            initializeQueue();
        }

        private void initializeQueue() {
            for (int i = 0; i < n; i++) {
                queue.add(i);
            }
        }

        public String getEliminationOrder() {
            StringBuilder eliminationOrder = new StringBuilder();
            while (queue.size() > 1) {
                for (int i = 0; i < m - 1; i++) {
                    queue.add(queue.poll());
                }
                eliminationOrder.append(queue.poll()).append(" ");
            }
            return eliminationOrder.toString().trim();
        }

        public int getLastPerson() {
            return queue.peek();
        }
    }

