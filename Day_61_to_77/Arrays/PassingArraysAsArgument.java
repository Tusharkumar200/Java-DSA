public class PassingArraysAsArgument {
  
  public static void update(int marks[]){
    System.out.println("new  marks");
       
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;
      System.out.println(marks[i]);
    }
  }
  public static void main(String[] args) {
    System.out.println("old marks");
    int marks []= {95,94,99};
    update(marks);

    for (int i : marks) {
      System.out.println(i);
    }
    System.out.println();
  }
}
