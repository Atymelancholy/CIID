package org.example;

class LinkedList {
    private Node head;

    public void add(String key) {
        Node newNode = new Node(key);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void sort() {
        head = quickSort(head);
    }

    private Node quickSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        String pivot = head.key;

        Node lessHead = null;
        Node lessTail = null;
        Node equalHead = null;
        Node equalTail = null;
        Node greaterHead = null;
        Node greaterTail = null;
        Node current = head;

        while (current != null) {
            int comparison = current.key.compareTo(pivot);

            if (comparison < 0) {
                if (lessHead == null) {
                    lessHead = lessTail = current;
                } else {
                    lessTail.next = current;
                    lessTail = current;
                }
            } else if (comparison == 0) {
                if (equalHead == null) {
                    equalHead = equalTail = current;
                } else {
                    equalTail.next = current;
                    equalTail = current;
                }
            } else {
                if (greaterHead == null) {
                    greaterHead = greaterTail = current;
                } else {
                    greaterTail.next = current;
                    greaterTail = current;
                }
            }
            current = current.next;
        }

        if (lessTail != null) lessTail.next = null;
        if (equalTail != null) equalTail.next = null;
        if (greaterTail != null) greaterTail.next = null;

        lessHead = quickSort(lessHead);
        greaterHead = quickSort(greaterHead);

        return concatenate(lessHead, equalHead, greaterHead);
    }

    private Node concatenate(Node lessHead, Node equalHead, Node greaterHead) {
        Node resultHead = null;
        Node resultTail = null;

        if (lessHead != null) {
            resultHead = lessHead;
            resultTail = getTail(lessHead);
        }

        if (equalHead != null) {
            if (resultHead == null) {
                resultHead = equalHead;
                resultTail = getTail(equalHead);
            } else {
                resultTail.next = equalHead;
                resultTail = getTail(equalHead);
            }
        }

        if (greaterHead != null) {
            if (resultHead == null) {
                resultHead = greaterHead;
            } else {
                resultTail.next = greaterHead;
            }
        }

        return resultHead;
    }

    private Node getTail(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        return current;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            if (current.next != null) {
                System.out.print(current.key + " -> ");
            } else {
                System.out.print(current.key);
            }
            current = current.next;
        }
        System.out.println();
    }
}

