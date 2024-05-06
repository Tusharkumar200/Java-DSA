public class _07_compair {
  public static void main(String[] args) {
    String s1 = "Tushar";
    String s2 = "Tushar";
    String s3 = new String("Tushar");

    if(s1 == s2){
      System.out.println("Equial");
    }
    else{
      System.out.println("not equal");
    }

    if(s1.equals(s3)){
      System.out.println("Tusahr equal");
    }
    else{
      System.out.println("Tushar not equal");
    }
  }
}
