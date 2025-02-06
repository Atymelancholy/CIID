package org.example;

class Node implements Comparable<Node> {
    private String key;
    private Node next;
    private Node prev;

    public Node(String key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getPrev() {
        return prev;
    }

    @Override
    public int compareTo(Node other) {
        return this.key.compareTo(other.key);
    }

    @Override
    public String toString() {
        return key;
    }
}