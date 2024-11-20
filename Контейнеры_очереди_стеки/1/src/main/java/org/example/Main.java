package org.example;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Введите арифметическое выражение в инфиксной нотации:");
        String infixExpression = scanner.nextLine().trim();

        if (infixExpression.isEmpty()) {
            logger.warning("Пустое выражение. Завершение работы.");
            return;
        }

        try {
            String postfixExpression = infixToPostfix(infixExpression);
            logger.log(Level.INFO, "Постфиксная нотация: {0}", new Object[]{postfixExpression});
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Ошибка: {0}", e.getMessage());
        }
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : infix.toCharArray()) {
            if (Character.isWhitespace(c)) {
                continue;
            }

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c).append(' ');
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                processClosingParenthesis(stack, postfix);
            } else if (isOperator(c)) {
                processOperator(stack, postfix, c);
            } else {
                throw new IllegalArgumentException("Недопустимый символ: " + c);
            }
        }

        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '(' || top == ')') {
                throw new IllegalArgumentException("Скобки не сбалансированы.");
            }
            postfix.append(top).append(' ');
        }
        return postfix.toString().trim();
    }

    private static void processClosingParenthesis(Deque<Character> stack, StringBuilder postfix) {
        while (!stack.isEmpty() && stack.peek() != '(') {
            postfix.append(stack.pop()).append(' ');
        }
        if (stack.isEmpty() || stack.pop() != '(') {
            throw new IllegalArgumentException("Скобки не сбалансированы.");
        }
    }

    private static void processOperator(Deque<Character> stack, StringBuilder postfix, char operator) {
        while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(operator)) {
            postfix.append(stack.pop()).append(' ');
        }
        stack.push(operator);
    }

    private static boolean isOperator(char c) {
        return "+-*/".indexOf(c) >= 0;
    }

    private static int precedence(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> -1;
        };
    }
}
