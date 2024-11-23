package org.example;
import java.util.logging.Logger;
import java.util.Scanner;

public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode head = getUserInputList(scanner);

        int targetValue = getTargetNodeValue(scanner);
        processRemoval(head, targetValue);

        scanner.close();
    }

    private static ListNode getUserInputList(Scanner scanner) {
        logger.info("Введите элементы связанного списка через пробел:");
        String[] input = scanner.nextLine().split(" ");
        ListNode head = LinkedListUtils.createListFromInput(input);

        logger.info("Ваш связанный список:");
        LinkedListUtils.printList(head);

        return head;
    }

    private static int getTargetNodeValue(Scanner scanner) {
        logger.info("\nВведите значение узла, после которого хотите удалить следующий узел:");
        return scanner.nextInt();
    }

    private static void processRemoval(ListNode head, int targetValue) {
        ListNode targetNode = LinkedListUtils.findNode(head, targetValue);
        if (targetNode == null) {
            logger.info("Узел с таким значением не найден.");
        } else {
            LinkedListUtils.removeAfter(targetNode);

            logger.info("Обновленный список:");
            LinkedListUtils.printList(head);
        }
    }
}