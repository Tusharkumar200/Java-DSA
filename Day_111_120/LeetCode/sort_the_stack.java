package LeetCode;

import java.util.*;

public class sort_the_stack{

    public static void insertSorted(Stack<Integer> stack , int num){

        if(stack.isEmpty()){
            stack.push(num);
            return;
        }

        int top  = stack.peek();

        if(top <= num){
            stack.push(num);
        }
        else{
            stack.pop();
            insertSorted(stack,num);
            stack.push(top);
        }
    }

    public static void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()) return;

        int num = stack.pop();
        sortStack(stack);
        insertSorted(stack,num);
    }
}