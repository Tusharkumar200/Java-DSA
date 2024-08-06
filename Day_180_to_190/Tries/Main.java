public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        
        String[] words = {"car","carpool","card","care","careful","egg","eggs" , "apple"};

        for(String word: words){
            trie.insert(word);
        };
        trie.remove("carpool");
        System.out.println(trie.autoComplete("car"));
     
    }

   
}
