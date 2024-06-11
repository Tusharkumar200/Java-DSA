package Leedcode;

import java.util.Stack;

public class Reverse_Queue_Recursion {
    public static Stack<Integer> pushAtBottom(Stack <Integer> myStack,int x){
        if(myStack.isEmpty()){
            myStack.push(x);
            return myStack;
        }

        int num = myStack.pop();
        myStack = pushAtBottom(myStack,x);
        myStack.push(num);

        return myStack;
        
    }

    public static void reverseStack(Stack <Integer> Stack){
        if(Stack.isEmpty()){
            return;
        }

        int num = Stack.pop();
        reverseStack(Stack);
        Stack = pushAtBottom(Stack,num);
    }
}
