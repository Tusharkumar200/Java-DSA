package challenges;

import java.util.List;

public class StringFilterAndConcatenate {
  public static void main(String[] args) {
    List<String> str = List.of("Tushar Kuamr","Bad","is Learning Java","ghatiya","ganda","on KG Coding","Best Youtube programming channel");

    String result = str.stream()
                            .filter(strs -> strs.length() > 10)
                            .reduce("",(a,b) -> a+" "+b);
    System.out.println(result);
  }
}
