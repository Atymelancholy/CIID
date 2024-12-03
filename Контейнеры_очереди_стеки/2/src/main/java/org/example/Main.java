package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Исходный список:");
        list.printList();

        list.removeAfter(2);

        System.out.println("Список после удаления:");
        list.printList();
    }
}
