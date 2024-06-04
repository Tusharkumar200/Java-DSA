import java.util.Stack;
// O(n) time complexity
public class get_min_stack {
    Stack<Integer> minStack;
    Stack<Integer> stack;

    public get_min_stack() {
        this.minStack = new Stack<>();
        this.stack = new Stack<>();
    }

    int getMin(){

    }
    int pop(){

    }
    void push(int x)
    {
        if(stack.isEmpty()){
            stack.push(x);
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
