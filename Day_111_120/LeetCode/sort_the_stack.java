package LeetCode;

import java.util.*;

public class sort_the_stack{

    public static void insertSorted(Stack<Integer> stack , int num){

        
    }

    public static void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()) return;

        int num = stack.pop();
        sortStack(stack);
        insertSorted(stack,num);
    }
}