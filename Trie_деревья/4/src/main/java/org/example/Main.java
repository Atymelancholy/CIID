package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        double probability = 0.9;
        int wordCount = 10;

        Trie trie = generateWords(probability, wordCount);
        Set<String> uniqueWords = trie.getAllWords();
        Map<Integer, Integer> lengthDistribution = calculateLengthDistribution(uniqueWords);

        printLengthDistribution(lengthDistribution);
        printUniqueWords(uniqueWords);
    }

    private static Trie generateWords(double probability, int wordCount) {
        Trie trie = new Trie();
        Random random = new Random();

        for (int i = 0; i < wordCount; i++) {
            StringBuilder word = new StringBuilder();
            while (random.nextDouble() < probability) {
                char nextChar = (char) ('a' + random.nextInt(26));
                word.append(nextChar);
            }
            if (word.length() > 0) {
                trie.insert(word.toString());
            }
        }

        return trie;
    }

    private static Map<Integer, Integer> calculateLengthDistribution(Set<String> uniqueWords) {
        Map<Integer, Integer> lengthDistribution = new HashMap<>();
        for (String word : uniqueWords) {
            int length = word.length();
            lengthDistribution.put(length, lengthDistribution.getOrDefault(length, 0) + 1);
        }
        return lengthDistribution;
    }

    private static void printLengthDistribution(Map<Integer, Integer> lengthDistribution) {
        System.out.println("Длина слова| Уникальное количество слов");
        System.out.println("--------------------------------");
        lengthDistribution.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("%12d | %d%n", entry.getKey(), entry.getValue()));
    }

    private static void printUniqueWords(Set<String> uniqueWords) {
        System.out.println("\nСлова:");
        uniqueWords.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
