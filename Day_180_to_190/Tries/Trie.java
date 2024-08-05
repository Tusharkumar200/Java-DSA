
class TrieNode{
    public char value;
    public TrieNode[] children;
    public boolean isEndOfWord;

    public TrieNode(char value){
    this.value = value;
    this.children = new TrieNode[26];
    this.isEndOfWord = false;
    }

    public String toString(){
        return "Value = "+value;
    }
}

public class Trie{
    private TrieNode root;

    public Trie(){
        this.root = new TrieNode(' ')
    }

    public void insert(String word){
        TrieNode current = root;

        for(char ch: word.toCharArray()){

            int index = ch - 'a';

            if(current.children[index] == null){
                current.children[index] = new TrieNode(ch);
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
}