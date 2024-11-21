package org.example;
import java.util.logging.Logger;

    class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    class LinkedListUtils {
        static Logger logger = Logger.getLogger(LinkedListUtils.class.getName());


        private LinkedListUtils() {
            throw new IllegalStateException("Utility class");
        }

        public static void removeAfter(ListNode node) {
            if (node == null || node.next == null) {
                return;
            }
            node.next = node.next.next;
        }

        public static void printList(ListNode head) {
            logger.info(() -> {
                StringBuilder logMessage = new StringBuilder();
                ListNode current = head;
                while (current != null) {
                    logMessage.append(current.value).append(" ");
                    current = current.next;
                }
                return logMessage.toString().trim();
            });
        }

        public static ListNode findNode(ListNode head, int value) {
            ListNode current = head;
            while (current != null) {
                if (current.value == value) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }

        public static ListNode createListFromInput(String[] input) {
            ListNode head = null;
            ListNode tail = null;
            for (String num : input) {
                int value = Integer.parseInt(num.trim());
                ListNode newNode = new ListNode(value);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            return head;
        }
}
