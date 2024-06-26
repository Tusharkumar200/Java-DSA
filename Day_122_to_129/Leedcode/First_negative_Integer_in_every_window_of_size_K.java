package Leedcode;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class First_negative_Integer_in_every_window_of_size_K {
    public long[] printFirstNegativeInteger(long A[] , int N, int k){

        ArrayDeque <Integer> dq = new ArrayDeque<>();
        ArrayList  <Long> result = new ArrayList<>();

        for(int i = 0; i < k; i++){
            if(A[i] < 0){
                dq.add(i);
            }
        }
        if(!dq.isEmpty()){
            result.add(A[dq.getFirst()]);
        }else{
            result.add(0l);
        }

        for(int i =k; i < N -1; i++){
            if(!dq.isEmpty() && dq.getFirst() < i - k + 1){
                dq.removeFirst();
            }
            if(A[i] < 0){
                dq.add(i);
            }
            if(!dq.isEmpty()){
                result.add(A[dq.getFirst()]);
            }else{
                result.add(0l);
            }
        }
        long[] ans = new long[result.size()];
        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}
