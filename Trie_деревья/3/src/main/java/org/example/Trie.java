package org.example;

import java.util.Collections;
import java.util.Set;

class Trie {
    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        for (int i = 0; i < word.length(); i++) {
            insertSuffix(word.substring(i), word);
        }
    }

    private void insertSuffix(String suffix, String word) {
        TrieNode current = root;
        for (char c : suffix.toCharArray()) {
            current.getChildren().putIfAbsent(c, new TrieNode());
            current = current.getChildren().get(c);
            current.getWords().add(word);
        }
    }

    public Set<String> search(String substring) {
        TrieNode current = root;
        for (char c : substring.toCharArray()) {
            if (!current.getChildren().containsKey(c)) {
                return Collections.emptySet();
            }
            current = current.getChildren().get(c);
        }
        return current.getWords();
    }
}