public class StringTest {
  public static void main(String[] args){
    System.out.println("String Builder");
    StringBuilder sb = new StringBuilder("Hi");
    sb.append(",tushar ");
    sb.append("how are you");
    sb.toString();
    System.out.println(sb);
  }
}
