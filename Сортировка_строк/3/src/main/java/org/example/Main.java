package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("last");
        list.add("night");
        list.add("i");
        list.add("saw");
        list.add("that");
        list.add("beauty");
        list.add("queen");

        System.out.println("До сортировки: ");
        System.out.println(list);

        list.sort();

        System.out.println("После сортировки: ");
        System.out.println(list);
    } 
}
