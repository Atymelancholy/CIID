package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        String listString1 = list.toString();
        System.out.println("Исходный список:" + listString1);

        list.removeAfter(2);

        String listString2 = list.toString();
        System.out.println("Список после удаления:" + listString2);
    }
}
