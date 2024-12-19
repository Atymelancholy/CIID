package org.example;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
    }

    public Set<String> getAllWords() {
        Set<String> words = new HashSet<>();
        collectWords(root, new StringBuilder(), words);
        return words;
    }

    private void collectWords(TrieNode node, StringBuilder prefix, Set<String> words) {
        if (node.isEndOfWord) {
            words.add(prefix.toString());
        }
        for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
            prefix.append(entry.getKey());
            collectWords(entry.getValue(), prefix, words);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }
}