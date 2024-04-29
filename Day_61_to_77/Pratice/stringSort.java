public class stringSort {
  public static void main(String[] args) {
    String name[] = {"Madras","Delhi","Ahameadabad","Calcutta","Bombay"};
    String temp;
    for (int i = 0; i < name.length; i++) {
      for (int j = i+1; j < name.length; j++) {
        if(name[j].compareTo(name[i])<0){
            temp = name[i];
            name[i] = name[j];
            name[j] = temp;

        }
      }
      System.out.println(name[i]);
    }
  }
}
