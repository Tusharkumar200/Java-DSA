public class Say_Digits {

    private static String[] digits = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void sayDigits(int num){
        
        if(num == 0) return;
        
        int lastDight = num%10;
        sayDigits(num/10);
        System.out.print(digits[lastDight] + " ");
    }

    public static void main(String[] args) {
        sayDigits(12566);
    }
}
