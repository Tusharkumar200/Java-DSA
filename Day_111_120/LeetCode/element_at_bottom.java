package LeetCode;

import java.util.Stack;

public class element_at_bottom {

  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x){
        Stack<Integer> temp = new Stack<>();

        while(!myStack.isEmpty())
          temp.push(myStack.pop());
        temp.push(x);
        

        while(!temp.isEmpty()){
          myStack.push(temp.pop());
        }
        return myStack;
  }

  // 2nd approched

}
