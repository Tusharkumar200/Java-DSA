package LeetCode;

import java.util.Stack;

public class reverseUsingRecursion{
    public static Stack<Integer> pushAtBottom2(Stack <Integer> myStack, int x){

    if(myStack.isEmpty()){
      myStack.push(x);
      return myStack;
    }

    int num = myStack.pop();
    myStack = pushAtBottom2(myStack,x);
    myStack.push(num);

    return myStack;
  }

  public stack void reverseStack(Stack<Integer> stack){

    if(stack.isEmpty()) return;

    int num = stack.pop();
    reverseStack(stack)

    pushAtBottom2(stack,num);
  }
}