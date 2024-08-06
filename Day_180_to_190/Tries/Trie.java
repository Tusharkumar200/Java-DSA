import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode{
    public char value;
    private Map<Character , TrieNode> children;
    public boolean isEndOfWord;

    public TrieNode(char value){
    this.value = value;
    this.children = new HashMap<>();
    this.isEndOfWord = false;
    }

    public boolean hasChild(char ch){
        return children.containsKey(ch);
    }

    public void insertChild(char ch){
        children.put(ch,new TrieNode(ch));
    }

    public TrieNode getChild(char ch){
        return children.get(ch);
    }


    public String toString(){
        return "Value = "+value;
    }
}

public class Trie{
    private TrieNode root;

    public Trie(){
        this.root = new TrieNode(' ');
    }

    public void insert(String word){
        TrieNode current = root;

        for(char ch: word.toCharArray()){

            
            if(!current.hasChild(ch)){
                current.insertChild(ch);

            }
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }

    public List<String> autoComplete(String prefix){
        
    }
}