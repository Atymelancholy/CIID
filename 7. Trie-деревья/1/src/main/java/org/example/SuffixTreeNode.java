package org.example;
import java.util.*;

class SuffixTreeNode {
    private final Map<Character, SuffixTreeNode> children;

    public SuffixTreeNode() {
        this.children = new HashMap<>();
    }

    public void addSuffix(String suffix) {
        SuffixTreeNode currentNode = this;
        for (char ch : suffix.toCharArray()) {
            currentNode = currentNode.children.computeIfAbsent(ch, k -> new SuffixTreeNode());
        }
    }

    public int countNodes() {
        int count = 1; // Count this node
        for (SuffixTreeNode child : children.values()) {
            count += child.countNodes();
        }
        return count;
    }
}