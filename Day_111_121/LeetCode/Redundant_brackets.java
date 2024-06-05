package LeetCode;

import java.util.*;
import java.util.ArrayList;

public class Redundant_brackets{
    public static boolean findRedundantBrackets(String s){
        Stack<Character> stack = new Stack<>();
        List<Character> operators =  Arrays.asList('+','-','*','/');

        for(char ch: s.toCharArray()){

            if(ch == '(' || operators.contains(ch)){
                stack.push(ch);
            }
            else if(ch == ')'){
                char top = stack.pop();
                if(!operators.contains(top)) return true;

                while(!stack.isEmpty() && operators.contains(stack.peek())){
                    stack.pop();
                }
                stack.pop();
            }
        }
        return false;
        
    }
}