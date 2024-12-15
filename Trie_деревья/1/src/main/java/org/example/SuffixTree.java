package org.example;

class SuffixTree {
    private final SuffixTreeNode root;

    public SuffixTree(String text) {
        this.root = new SuffixTreeNode();
        buildSuffixTree(text);
    }

    private void buildSuffixTree(String text) {
        for (int i = 0; i < text.length(); i++) {
            root.addSuffix(text.substring(i));
        }
    }

    public int countUniqueSubstrings() {
        return root.countNodes() - 1;
    }
}