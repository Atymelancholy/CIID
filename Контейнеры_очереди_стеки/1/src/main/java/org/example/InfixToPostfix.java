package org.example;

import java.util.Stack;

public class InfixToPostfix {

    private enum Operator {
        ADD('+', 1),
        SUBTRACT('-', 1),
        MULTIPLY('*', 2),
        DIVIDE('/', 2),
        EXPONENT('^', 3);

        private final char symbol;
        private final int precedence;

        Operator(char symbol, int precedence) {
            this.symbol = symbol;
            this.precedence = precedence;
        }

        public char getSymbol() {
            return symbol;
        }

        public int getPrecedence() {
            return precedence;
        }

        public static Operator fromChar(char ch) {
            for (Operator op : values()) {
                if (op.symbol == ch) {
                    return op;
                }
            }
            throw new IllegalArgumentException("Invalid operator: " + ch);
        }
    }

    public String toPostfix(String infix) {
        Stack<Operator> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(null);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != null) {
                    result.append(stack.pop().getSymbol());
                }
                stack.pop();
            } else if (isOperator(ch)) {
                Operator currentOp = Operator.fromChar(ch);
                while (!stack.isEmpty() && stack.peek() != null &&
                        stack.peek().getPrecedence() >= currentOp.getPrecedence()) {
                    result.append(stack.pop().getSymbol());
                }
                stack.push(currentOp);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop().getSymbol());
        }

        return result.toString();
    }

    private boolean isOperator(char ch) {
        try {
            Operator.fromChar(ch);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
