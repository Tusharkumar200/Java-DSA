import java.util.Stack;

public class get_min_stack_O1_time{
    
    int minEle;
    Stack<Integer> stack;

    public get_min_stack_O1_time() {
        this.minEle = 0;
        this.stack = new Stack<>();
    }

    int getMin(){
        if(stack.isEmpty()) return -1;
        return minEle;
    }
    int pop(){
        if(stack.isEmpty()) return -1;
        int topValue = stack.peek();

        if(topValue >= minEle) return topValue;

        int currentMini = minEle;
        minEle = (2 * minEle) - topValue;
        
        return currentMini;
    }
    void push(int x)
    {
        if(stack.isEmpty()){
            minEle = x;
            stack.push(x);
           
        }else{
        if(x >= minEle){
            stack.push(x);
        }else{
            int newValue = (2 * x) - minEle;
            stack.push(newValue);
            minEle = x;
        }
    }
    }
}
