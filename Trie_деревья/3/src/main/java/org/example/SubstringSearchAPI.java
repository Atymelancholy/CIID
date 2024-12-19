package org.example;

import java.util.List;
import java.util.Set;

class SubstringSearchAPI {
    private final Trie trie;

    public SubstringSearchAPI(List<String> words) {
        this.trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
    }

    public Set<String> searchSubstring(String substring) {
        return trie.search(substring);
    }
}