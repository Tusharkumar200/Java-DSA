package MyStack;
import java.util.*;
public class MyStack {
  private int[] items;
  private int top;
  private int size;

  public MyStack(int size){
     this.size = size;
     this.items = new int[size];
     this.top = 0;
  }

  public void push(int value){
    if(top == size) throw new StackOverflowError();
   this.items[this.top] = value;
    this.top++;
  }

  public int pop(){

    if(top == 0) throw new EmptyStackException();  //stack underFlow
      
    this.top--;
    int value = items[top];
    items[top] = 0;
    return value;

  }

  public int peek(){
    return items[top-1];
  }


  public int size(){
    return top;
  }

  public String toString(){
    StringBuilder stringBuilder = new StringBuilder();
    for(int i = size -1 ; i>=0;i--){
      stringBuilder.append(items[i]).append(" \n");
    }
    return stringBuilder.toString();
  }

}
