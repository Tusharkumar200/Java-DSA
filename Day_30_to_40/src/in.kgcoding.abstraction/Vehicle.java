public abstract class Vehicle implements Transport {

  private int noOfTires;

  public abstract void makeStartSound();

  public void getSetGo(){
    System.out.println("Going to place...");
  }

  public Vehicle(int onOfTires){
    this.noOfTires = noOfTires;
  }

  public int getNoOfTires(){
    return noOfTires;
  }

  public void setNoOfTires(int noOfTires){
    this.noOfTires = noOfTires;
  }

  public void commute(){
    System.out.println("going ...");
  }
}