public class VarArgs{
  public static void main(String[] args) {
     
    num(10,20,40,80,80);
  }
  // use (...) to perfome VarArgs
  public static void num(int ...a){
    for (int p : a) {
      System.out.println(p);
    }
  }
}