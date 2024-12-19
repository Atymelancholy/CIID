package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TrieNode {
    private final Map<Character, TrieNode> children;
    private final Set<String> words;

    public TrieNode() {
        this.children = new HashMap<>();
        this.words = new HashSet<>();
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public Set<String> getWords() {
        return words;
    }
}