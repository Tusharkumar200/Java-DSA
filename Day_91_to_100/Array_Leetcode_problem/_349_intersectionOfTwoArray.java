import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _349_intersectionOfTwoArray {

  public static void intersection(int[] num1, int[] num2){

        Arrays.sort(num1);
        Arrays.sort(num2);
        int i=0;
        int j=0;
        Set<Integer> set = new HashSet<Integer>(); 
        
        while(i < num1.length && j < num2.length){
          if(num1[i] == num2[j]){
            set.add(num1[i]);
            i++;
            j++;
          }
          else if(num1[i] < num2[j]){
            i++;
           
          }
          else j++;
        }

        int[] result = new int[set.size()];
        int index = 0;
        for(var num:set) {
          result[index] = Integer.parseInt(num.toString());
          index++;
          System.out.println( result );
        }
  }
  public static void main(String[] args) {
    int num1[] ={1,2,2,1,9};
    int num2[] = {2,2,9};
    intersection(num1,num2);
    

  }
}
