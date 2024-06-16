import java.util.HashMap;
import java.util.Map;

public class _70_LC_ClimbingStairs {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static int climbStairs(int n){
        if(map.containsKey(n)) return map.get(n);
        if(n == 0) return 1;
        if(n < 0) return 0;
        int res = climbStairs(n-1) + climbStairs(n-2);
        map.put(n, res);
        return res;
    }

    // Testing code
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }
}
