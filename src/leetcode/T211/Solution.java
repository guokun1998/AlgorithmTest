package leetcode.T211;

import java.util.*;

public class Solution{

    List<String> list = new LinkedList<>();

    public void addWord(String word) {
        list.add(word);
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (word.length() != next.length()) {
                continue;
            }
            boolean isSuit = true;
            for (int i = 0; i < next.length(); i++) {
                char c1 = next.charAt(i);
                char c2 = word.charAt(i);
                if (c1 == c2 || c2 == '.') {
                    continue;
                }
                else {
                    isSuit = false;
                    break;
                }
            }
            if (isSuit)
                return true;
        }
        return false;
    }
}

/*
["WordDictionary","addWord","addWord","search","search","search","search","search","search","search","search"]
[[],["a"],["ab"],["a"],["a."],["ab"],[".a"],[".b"],["ab."],["."],[".."]]
 */
class WordDictionary {

    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("ead");
        wordDictionary.addWord("bae");
        wordDictionary.addWord("bae");
        System.out.println();
        System.out.println(wordDictionary.search(".ad"));
        System.out.println(wordDictionary.search("aad"));
        System.out.println(wordDictionary.search("a.d"));
        System.out.println(wordDictionary.search("b.e"));
        System.out.println(wordDictionary.search(null));
    }
    private WordDictionaryNode wordDictionaryNode;

    /** Initialize your data structure here. */
    public WordDictionary() {
        wordDictionaryNode = new WordDictionaryNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        List<WordDictionaryNode> list = new ArrayList<>();
        addWordToDictionary(word,wordDictionaryNode);
    }

    public static void addWordToDictionary(String word,WordDictionaryNode wordDictionaryNode) {
        Set<WordDictionaryNode> children = wordDictionaryNode.getChildren();
        if (children == null) {
            children = new HashSet<>();
        }
        if (word.length() == 0)
            return;

        char c = word.charAt(0);
        //寻找是否children里已存在c
        Iterator<WordDictionaryNode> iterator = children.iterator();
        while (iterator.hasNext()) {
            WordDictionaryNode next = iterator.next();
            if (next.getWord() == c) {
                addWordToDictionary(word.substring(1),next);
                return;
            }
        }
        //不存在c
        WordDictionaryNode wordDictionaryNode1 = new WordDictionaryNode(c,null);
        children.add(wordDictionaryNode1);
        wordDictionaryNode.setChildren(children);
        addWordToDictionary(word.substring(1),wordDictionaryNode1);
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        if (word==null || word.isEmpty())
            return true;
        WordDictionaryNode wordDictionaryNode = this.wordDictionaryNode;

        return searchInDictionary(word,wordDictionaryNode);
    }

    public boolean searchInDictionary(String word, WordDictionaryNode wordDictionaryNode){
        Set<WordDictionaryNode> children = wordDictionaryNode.getChildren();
        if (children != null && !word.isEmpty()) {
            char c = word.charAt(0);
            //c== '.'
            if (c == '.') {
                for (WordDictionaryNode temp:
                        children) {
                    if (searchInDictionary(word.substring(1),temp)) {
                        return true;
                    }
                }
            }
            //c!='.'
            else {
                for (WordDictionaryNode temp:
                        children) {
                    if (temp.getWord() == c) {
                        return searchInDictionary(word.substring(1),temp);
                    }
                }
            }
        }
        else if (children==null && word.isEmpty())
            return true;
        else {
            return false;
        }
        return false;
    }


}
class WordDictionaryNode{
    private char word;
    private Set<WordDictionaryNode> children;

    public char getWord() {
        return word;
    }

    public void setWord(char word) {
        this.word = word;
    }


    public WordDictionaryNode() {
    }

    public WordDictionaryNode(char word, Set<WordDictionaryNode> children) {
        this.word = word;
        this.children = children;
    }

    public Set<WordDictionaryNode> getChildren() {
        return children;
    }

    public void setChildren(Set<WordDictionaryNode> children) {
        this.children = children;
    }
}