package Assignment;

import java.util.Scanner;

public class _01_count_vowels {

  public static void countVowel(String str){
    int countVowel = 0;
    String vowel []={"a","e","i","o","u"};
    for (int i = 0; i < vowel.length; i++) {
      System.out.println(vowel[i]);
      if(vowel[i].equals(str.charAt(i))){
        countVowel++;
      }
    }
    System.out.println(countVowel);
  }
  public static void main(String[] args) {
    System.out.println("Enter the sentence");
    try (Scanner input = new Scanner(System.in)) {
      String str = input.nextLine();
      countVowel(str);
    }
  }
}
