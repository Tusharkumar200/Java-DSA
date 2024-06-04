import java.util.Stack;
// O(n) time complexity
// GFG problem link: https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1
public class get_min_stack {
    Stack<Integer> minStack;
    Stack<Integer> stack;

    public get_min_stack() {
        this.minStack = new Stack<>();
        this.stack = new Stack<>();
    }

    int getMin(){
        if(stack.isEmpty()) return -1;
        return minStack.peek();
    }
    int pop(){
        if(stack.isEmpty()) return -1;
        minStack.pop();
        return stack.pop();
    }
    void push(int x)
    {
        stack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
            return;
        }
        int minTillNow = minStack.peek();
        if(x < minTillNow){
            minStack.push(x);
        }else{
            minStack.push(minTillNow);
        }
    }

}
