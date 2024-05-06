package Bit_Manipulation;

public class Bits {

  public static void getBit(){
        // get bit
    int n=5;
    int pos = 1;
    int bitMask = 1<<pos;
    if((bitMask & n)==0){
        System.out.println("bit was zero");
    }
    else{
      System.out.println("bit was not zero");
    }
  }

  public static void setBit(){

    //Set Bit
    int n=5;
    int pos = 1;
    int bitMask = 1<<pos;
    int newNumber = bitMask | n;
    System.out.println("set bit: "+newNumber);

  }
  public static void clearBits(){
      // clear Bits
      int n=5;
      int pos = 1;
      int bitMask = 1<<pos;
          
    int notBitMask = ~(bitMask);
    int newNumbers = notBitMask & n;
    System.out.println("clearBits : "+newNumbers);
  }

  public static void updateBit(){
    
    // update Bits;
      int n=5;
      int pos = 1;
      int bitMask = 1<<pos;
      int oper = 1;
    
    if(oper ==1){
      int newNumber = bitMask | n;
      System.out.println(newNumber);
  }
  else{
    int newBitMask = ~(bitMask);
    int newNumber = newBitMask & n;
    System.out.println("updateBits: "+newNumber);
  }
  }
  public static void main(String[] args) {
    updateBit();
    
  }
}
