package LeetCode;

public class TwoStack {
  
  private int[] items;
  private int top1;
  private int top2;

  public TwoStack(int s){
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
}
