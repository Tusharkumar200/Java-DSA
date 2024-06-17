public class Check_for_pallindrome {
    
    private static boolean isPallindrome(String str , int i,int j){
        if(i >= j) return true;
        if(str.charAt(i) != str.charAt(j)) return false;
        return isPallindrome(str, i+1, j-1);
    }

    public static void main(String[] args) {
        String str = "tushar";
        isPallindrome(str, 0, str.length()-1);
    }
}
