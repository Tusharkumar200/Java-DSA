package LeetCode;

public class TwoStack {
  
  private int[] items;
  private int top1;
  private int top2;
  private int size;

  public TwoStack(int s){
    this.size = s;
      this.items = new int[s];
      this.top1= 0;
      this.top2= s-1;

  }

  public void push1(int num){
    if(top1 > top2) return;
    
    items[top1] = num;
    top1++;

  }
  public void push2(int num){
    if(top1 > top2) return;
    
    items[top2] = num;
    top2++;
  }

  public int pop1(){
    if(top1 == 0) return -1;
    top1--;
    return items[top1];
  }
  public int pop2(){
    if(top2 == size-1) return -1;
    top2++;
    return items[top2];
  }
}
