package polymorphism;

public class Overloding {
  public int add(int a, int b){
    return a+b;
  }

  public String add(String a,String b){
    return a+b;
  }

  public int add(int a,int b,int c,int d){
    return a+b+c+d;
  }

  public static void main(String[] args) {
    Overloding overload = new Overloding();
    int sum =overload.add(15,82);
    String name =overload.add("Tushar ","kumar");

    System.out.println(sum);
    System.out.println(name);
  }
}
