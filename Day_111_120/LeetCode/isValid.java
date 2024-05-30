package LeetCode;

import java.util.Stack;

public class isValid {
  public static boolean isValidParenthesis(String expression){
    Stack <Character> stack = new Stack<>();

    for (char ch: expression.toCharArray()){
      if(
        ch == '{' ||
        ch == '(' ||
        ch == ']'){

          // opening Bracket
          stack.push(ch);

        }
        else{
          if(stack.isEmpty()) return false;
          char top = stack.pop();

          if(
            ch == '}'&& top != '{' ||
            ch == ']'&& top != '[' ||
            ch == ')'&& top != '('
          ) return false;
        }

  }
    return stack.isEmpty();
  }
}
