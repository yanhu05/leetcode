package main.tree;

import java.util.HashMap;
import java.util.Map;

/*
 *
 *  https://leetcode.com/problems/implement-trie-prefix-tree/?tab=Description
 *
 *  Idea is from https://www.youtube.com/watch?v=AXjmTQ8LEoI&t=199s
 *
 */

public class Trie {
    private TrieNode root = new TrieNode();

    public Trie() {
    }

    public void insert(String word) {
        if (word == null) return;
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.children.containsKey(c)) {
                node = node.children.get(c);
                if (i == word.length() - 1) {
                    node.endOfWord = true;
                }
            } else {
                TrieNode childNode = new TrieNode();
                if (i == word.length() - 1) {
                    childNode.endOfWord = true;
                }
                node.children.put(c, childNode);
                node = childNode;
            }

        }
    }

    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.length() == 0) return false;
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (node.children.containsKey(c)) {
                node = node.children.get(c);
            } else {
                return false;
            }
        }
        return true;
    }


    public boolean search(String word) {
        if (word == null || word.length() == 0) return false;
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.children.containsKey(c)) {
                node = node.children.get(c);
                if (i == word.length() - 1 && !node.endOfWord) return false;

            } else {
                return false;
            }
        }
        return true;
    }


    private class TrieNode {
        Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
        boolean endOfWord;

    }


    public static void main(String[] args) {

        Trie myTrie = new Trie();
        myTrie.insert("abc");
        myTrie.insert("ab");
        myTrie.insert("lnm");
        System.out.println(myTrie.search("abc"));
        System.out.println(myTrie.startsWith("l"));

    }
}




