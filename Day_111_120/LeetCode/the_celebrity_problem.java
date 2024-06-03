
import java.util.Stack;

public class the_celebrity_problem {
    int celebrity(int M[][], int n) {
        Stack<Integer> stack = new Stack<>();
        // 1. push all the elements in the stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // 2. pop two elements and check if they know each other
        while (stack.size() != 1) {
            int a = stack.pop();
            int b = stack.pop();

            // if a knows b, if yes push b to stack else put a
            if (M[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }

        // There is only one person in stack
        int pc = stack.pop(); 
        // 3. check if pc  is a celebrity
        for (int i = 0; i < n; i++) {
            if (M[pc][i] == 1) return -1;// pc know someone!
            
        }
        for (int i = 0; i < n; i++) {
            if (M[i][pc] == 0 && i != pc) return -1; // there is someone who don't know pc!
        }
        return pc;
    }
}