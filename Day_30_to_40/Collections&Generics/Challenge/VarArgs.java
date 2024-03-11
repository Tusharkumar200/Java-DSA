package Challenge;

class VarArgs{
  public static void main(String[] args) {
    System.out.println(concatenate("Tusahr"));
    System.out.println(concatenate("Tusahr"," Kumar"));
    System.out.println(concatenate("Tusahr"," Kumar"," chandrwanshi"));
  }
  public static String concatenate(String... strs){
    StringBuilder sb = new StringBuilder();
    for(String str: strs){
      sb.append(str).append(" ");
    }
    return sb.toString();
  }
}