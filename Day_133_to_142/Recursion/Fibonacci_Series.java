

public class Fibonacci_Series {
    private static int fib(int num){
        if(num <= 1) return num;
        return fib(num-2) + fib(num-1);
    }

    public static void main(String[] args) {
        int num =8;
        
        for(int i =0; i<num;i++){
            System.out.print(fib(i) + " ");
        }
    }
}
