import java.util.ArrayList;
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

    public TrieNode[] getChildren(){
        return children.values().toArray(new TrieNode[0]);
    }

    public void removeChild(TrieNode node){
        children.remove(node.value);
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

    private TrieNode getLastNodeForPrefix(TrieNode root, String prefix , int index){
        if(index == prefix.length()){
            return root;
        }
        char ch = prefix.charAt(index);
        
         TrieNode nextNode = root.getChild(ch);
         return getLastNodeForPrefix(nextNode,prefix,index+1);
    
    }

    private void searchForAllPossibleWords(TrieNode node , String pre , List<String> result){
        if(node == null) return;
       
        if(node.isEndOfWord){
            result.add(pre);
        }

        for(TrieNode child: node.getChildren()){
            searchForAllPossibleWords(child,pre + child.value,result);
        }
    }

    public List<String> autoComplete(String prefix){
        List<String> result = new ArrayList<>();
        TrieNode startingPoint = getLastNodeForPrefix(root, prefix,0);
        searchForAllPossibleWords(startingPoint, prefix, result);
        return result;
    }

    private void remove(TrieNode root, String word , int index){
            if(root == null) return;
            if(index == word.length()){
                root.isEndOfWord = false;
                return;
            }

            char currentChar = word.charAt(index);
            TrieNode current = root.getChild(currentChar);

            if(current == null) return;

            remove(current,word,index+1);

            if (current.getChildren().length == 0 && !current.isEndOfWord){
                root.removeChild(current);
                
            }
    }

    public void remove(String word){
        remove(root,"car",0);
    }
}