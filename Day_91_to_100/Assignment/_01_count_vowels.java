package Assignment;

import java.util.Scanner;

public class _01_count_vowels {

  public static void countVowel(String str){
    int countVowels = 0;
    for (int i=0;i<str.length();i++ ) {
        char ch = str.charAt(i);
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
          countVowels++;
        }
    }
    System.out.println("Total vowel : "+countVowels);

  }
  public static void main(String[] args) {
    System.out.println("Enter the sentence");
    try (Scanner input = new Scanner(System.in)) {
      String str = input.nextLine();
      countVowel(str);
    }
  }
}
