public class Reverse_String {
    public static String reverseString(String str , int index){
        if(index >= str.length()) return " ";
        char ch = str.charAt(index);
        String reversed = reverseString(str, index+1);
        return reversed + ch;

            }
    public static void main(String[] args) {
        System.out.println( reverseString("tushar",0));

    }
}
