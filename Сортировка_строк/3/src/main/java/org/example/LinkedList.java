package org.example;

public class LinkedList {
    private Node head;
    private Node tail;

    public void add(String key) {
        Node newNode = new Node(key);
        if (head == null) {
            head = tail = newNode;
        } else {
            if (tail != null) {
                tail.setNext(newNode);
                newNode.setPrev(tail);
            }
            tail = newNode;
        }
    }

    public void sort() {
        if (head != null) {
            head = threeWayQuickSort(head, tail);
            updateTail();
        }
    }

    private Node threeWayQuickSort(Node low, Node high) {
        if (low == null || high == null || low == high) {
            return low;
        }

        Node[] partitioned = partition(low, high);
        Node lessPart = partitioned[0];
        Node equalPart = partitioned[1];
        Node greaterPart = partitioned[2];

        if (lessPart != null) {
            lessPart = threeWayQuickSort(lessPart, findTail(lessPart));
        }
        if (greaterPart != null) {
            greaterPart = threeWayQuickSort(greaterPart, findTail(greaterPart));
        }

        return concatenate(lessPart, equalPart, greaterPart);
    }

    private Node[] partition(Node low, Node high) {
        String pivot = high.getKey();
        PartitionNodes nodes = new PartitionNodes();

        Node current = low;
        while (current != null) {
            Node next = current.getNext();
            current.setNext(null);
            current.setPrev(null);
            nodes.updateNodes(current, pivot);
            current = next;
        }
        return new Node[]{nodes.lessHead, nodes.equalHead, nodes.greaterHead};
    }

    private Node findTail(Node node) {
        while (node != null && node.getNext() != null) {
            node = node.getNext();
        }
        return node;
    }

    private Node concatenate(Node less, Node equal, Node greater) {
        Node newHead = null;
        Node newTail = null;
        if (less != null) {
            newHead = less;
            newTail = findTail(less);
        }
        if (equal != null) {
            if (newHead == null) newHead = equal;
            else if (newTail != null) newTail.setNext(equal);
            equal.setPrev(newTail);
            newTail = findTail(equal);
        }
        if (greater != null) {
            if (newHead == null) newHead = greater;
            else if (newTail != null) newTail.setNext(greater);
            greater.setPrev(newTail);
        }
        return newHead;
    }

    private void updateTail() {
        tail = findTail(head);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode).append(currentNode.getNext() != null ? " -> " : "");
            currentNode = currentNode.getNext();
        }
        return sb.toString();
    }

    private static class PartitionNodes {
        Node lessHead;
        Node lessTail;
        Node equalHead;
        Node equalTail;
        Node greaterHead;
        Node greaterTail;

        void updateNodes(Node current, String pivot) {
            if (current.getKey().compareTo(pivot) < 0) {
                addNode(current, true);
            } else if (current.getKey().compareTo(pivot) == 0) {
                addNode(current, false);
            } else {
                addNode(current, null);
            }
        }

        private void addNode(Node current, Boolean isLess) {
            if (isLess == null) {
                greaterTail = updatePartition(greaterHead, greaterTail, current);
                if (greaterHead == null) greaterHead = greaterTail;
            } else if (isLess) {
                lessTail = updatePartition(lessHead, lessTail, current);
                if (lessHead == null) lessHead = lessTail;
            } else {
                equalTail = updatePartition(equalHead, equalTail, current);
                if (equalHead == null) equalHead = equalTail;
            }
        }

        private Node updatePartition(Node head, Node tail, Node current) {
            if (head == null) return current;
            tail.setNext(current);
            current.setPrev(tail);
            return current;
        }
    }
}
