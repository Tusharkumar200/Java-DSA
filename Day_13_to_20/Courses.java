class Courses{
  static int maxCapacity = 100;
  String courseName;
  int enrollments;

  String[] enrolledStudents;
  
  Courses(String courseName){
    this.courseName = courseName;
    this.enrollment = 0;
    this.enrolledStudents = new String[maxCapacity];
  }

 

  static void setMaxCapacity(int maxCapacity){
    Courses.maxCapacity = maxCapacity;
  }

  void enrolledStudent(String studentName){
    enrolledStudents[enrollments] = studentName;
    enrollments++;
  }
  
  void unenrollstudent(String studentName){
    System.out.println("Student Removed...");
    enrollments--;
  }
}