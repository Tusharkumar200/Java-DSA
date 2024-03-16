package challenges.CountryMap;

import java.util.HashMap;
import java.util.*;

public class Country_Map {
  public static void main(String[] args) {
    Map<String,String> countryMap = new HashMap<>();
    countryMap.put("Bharat", "New Delhi");
    countryMap.put("China", "Beijing");
    countryMap.put("Pakistan", "Islamabad");
    countryMap.put("SriLanka", "Columbo");
    countryMap.put("Bangladesh", "Dhaka");

    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter The Country Name");
      String country = input.next();

      if (countryMap.containsKey(country)) {
        System.out.printf("Capital of %s is %s",country,countryMap.get(country));
      }else{
        System.out.println("Sorry we don't know the capital ");
      }
    }
  }
}
