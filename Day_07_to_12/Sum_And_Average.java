class Sum_And_Average{
  public static void main(String[] args) {
    System.out.println("WElcome to Array sum and Average ");
    int[] numArray = ArrayUtility.inputArray();
    long sum =sum(numArray);
    double avg =Average(numArray);

    System.out.println("Sum of the Array is : "+ sum);
    System.out.println("Average of the Array is : "+ avg);

}

static long sum(int[] numArray){
  long sum=0;
  for(int i=0;i<numArray.length;i++){

    sum+=numArray[i];
  }
  return sum;
}

static double Average(int[] numArray){
  double sum = sum(numArray);
    return (sum/numArray.length);
}

}