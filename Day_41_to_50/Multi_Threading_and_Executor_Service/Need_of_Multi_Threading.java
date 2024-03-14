class Need_of_Multi_Threading{
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    // First task
    for(int i=1;i<=1000;i++){
      System.out.printf("%d* ",i);
    } 
    System.out.println("\n * task complete");

    // First task
    for(int i=1;i<=1000;i++){
      System.out.printf("%d$ ",i);
    } 
    System.out.println("\n $ task complete");

    // First task
    for(int i=1;i<=1000;i++){
      System.out.printf("%d# ",i);
    } 
    System.out.println("\n # task complete");
    long endTime = System.currentTimeMillis();
    System.out.printf("totla time: %d",endTime-startTime);


  }
}