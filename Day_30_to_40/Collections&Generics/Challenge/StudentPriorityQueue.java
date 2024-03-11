package Challenge;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

  public static void main(String[] args) {
    PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<>() {
      public int compare(Student student, Student t1){
        return student.getGrade() - t1.getGrade();
      }
    });

    queue.offer(new Student("Tushar", "B"));
    queue.offer(new Student("Ankit", "A"));
    queue.offer(new Student("Harsh", "C"));
    queue.offer(new Student("Scahin", "A"));

    System.out.printf("Queue is: %s",queue );
    System.out.printf("Got %s",queue.poll());
    System.out.printf("Got %s",queue.poll());
    System.out.printf("Got %s",queue.poll());
    System.out.printf("Got %s",queue.poll());
  }
  private static class Student{

    private final String name;
    private final String grade;

    public Student(String name,String grade){
      this.name = name;
      this.grade = grade;
    }

    public String getName(){
      return name;
    }

    public String getGrade(){
      return grade;
    }

    public String toString(){
      return name + ": "+grade;
    }

  }
  
}
