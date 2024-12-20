package org.example;

public class Main {
    public static void main(String[] args) {

        StablePriorityQueue<String> spq = new StablePriorityQueue<>();

        spq.add("A", 1);
        spq.add("B", 2);
        spq.add("C", 1);
        spq.add("D", 2);
        spq.add("E", 1);

        while (!spq.isEmpty()) {
            System.out.println(spq.poll());
        }
    }
}
