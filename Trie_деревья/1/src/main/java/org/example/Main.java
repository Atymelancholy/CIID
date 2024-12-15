package org.example;
import java.util.HashSet;
import java.util.Scanner;

class TrieNode {
    TrieNode[] children;
    boolean isEndOfString;

    public TrieNode() {
        children = new TrieNode[26];
        isEndOfString = false;
    }
}

class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfString = true;
    }

    public boolean contains(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfString;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = getInputText(scanner);
        int L = getInputSubstringLength(scanner, text);
        if (L <= 0 || L > text.length()) {
            System.out.println("Длина подстроки должна быть положительной и не превышать длину текста.");
            return;
        }
        HashSet<String> uniqueSubstrings = findUniqueSubstrings(text, L);
        printUniqueSubstrings(uniqueSubstrings, L);
    }

    private static String getInputText(Scanner scanner) {
        System.out.print("Введите текст: ");
        return scanner.nextLine().toLowerCase();
    }

    private static int getInputSubstringLength(Scanner scanner, String text) {
        System.out.print("Введите длину подстроки L: ");
        return scanner.nextInt();
    }

    private static HashSet<String> findUniqueSubstrings(String text, int L) {
        Trie trie = new Trie();
        HashSet<String> uniqueSubstrings = new HashSet<>();
        for (int i = 0; i <= text.length() - L; i++) {
            String substring = text.substring(i, i + L);
            if (!trie.contains(substring)) {
                trie.insert(substring);
                uniqueSubstrings.add(substring);
            }
        }
        return uniqueSubstrings;
    }

    private static void printUniqueSubstrings(HashSet<String> uniqueSubstrings, int L) {
        System.out.println("Уникальные подстроки длиной " + L + ":");
        for (String s : uniqueSubstrings) {
            System.out.println(s);
        }
        System.out.println("Количество уникальных подстрок длиной " + L + ": " + uniqueSubstrings.size());
    }
}
