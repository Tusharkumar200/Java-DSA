package challenges_3;
import java.util.List;

public class TestingEmployee {
  public static void main(String[] args) {
    List <Employee> employees = List.of(

      new Employee ("Tushar", 50000),
      new Employee ("Ram ", 1000000),
      new Employee ("Kanish", 80000),
      new Employee ("Anish", 90000)
    );

    employees.stream()
              .sorted((emp1,emp2)-> Integer.compare(emp1.getSalary(), emp2.getSalary()))
              .forEach(System.out::println);;
  }
}
