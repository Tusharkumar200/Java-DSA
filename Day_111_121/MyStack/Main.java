package MyStack;

public class Main {
  public static void main(String[] args) {
    MyStack stack = new MyStack(5);

    // push
    stack.push(5);
    stack.push(4);
    stack.push(3);
    stack.push(2);
    stack.push(1);
    
// pop
    stack.pop();
    stack.pop();
    stack.pop();

    // peek
    System.out.println("peek is: "+stack.peek());


// size of stack
System.out.println(stack);
System.out.println("size : "+stack.size());
  }
}
