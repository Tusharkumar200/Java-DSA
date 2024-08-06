public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        
        String[] words = {"car","card","care","careful","egg","eggs" , "apple"};

        for(String word: words){
            trie.insert(word);
        }
        System.out.println(trie.autoComplete("car"));
        System.out.println("Done"); 
    }

   
}
