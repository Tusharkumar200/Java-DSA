import java.util.Stack;

public class introStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    
    // push
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println(stack.peek());
    // iterate over stack
    while(!stack.isEmpty()){
      Integer value = stack.pop();
      System.out.println("element "+ value);
    }

    
    // System.out.println(stack);
    
    // pop
    // stack.pop();
    // stack.pop();
    
    System.out.println(stack.isEmpty());
    System.out.println(stack);


  }
}
