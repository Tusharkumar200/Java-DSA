
class TrieNode{
    public char value;
    public TrieNode[] children;
    public boolean isEndOfWord;

    public TrieNode(char value){
    this.value = value;
    this.children = new TrieNode[26];
    this.isEndOfWord = false;
    }
}

public class Trie{

}