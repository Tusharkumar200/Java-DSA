package Leedcode;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class First_negative_Integer_in_every_window_of_size_K {
    public long[] printFirstNegativeInteger(long A[] , int N, int K){

        ArrayDeque <Integer> dq = new ArrayDeque<>();
        ArrayList  <Long> result = new ArrayList<>();

        for(int i = 0; i < K; i++){
            if(A[i] < 0){
                dq.add(i);
            }
        }
        if(!dq.isEmpty()){
            result.add(A[dq.getFirst()]);
        }else{
            result.add(0l);
        }
    }
}
