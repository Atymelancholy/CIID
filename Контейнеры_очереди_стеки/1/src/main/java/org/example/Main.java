package org.example;

public class Main {

    public static void main(String[] args) {
        InfixToPostfix converter = new InfixToPostfix();

        String infix = " 5 * 6 + (2 - 9)";
        String postfix = converter.toPostfix(infix);

        System.out.println("Инфиксное выражение: " + infix);
        System.out.println("Постфиксное выражение: " + postfix);
    }
}
