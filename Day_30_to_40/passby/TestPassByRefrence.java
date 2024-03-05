package passby;

public class TestPassByRefrence {


  public static void main(String[] args) {
    Point first = new Point(4,8);

    System.out.println("First : "+first);
    move(first);
    System.out.println("First : "+first);

  }
  public static void move(Point p) {
    p.x++;
    p.y++;
    System.out.println(p);
    
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("x: ").append(x).append(", ");
    sb.append("y: ").append(y);
    return sb.toString();
  }
  

  public static class Point {
      
      int x;
      int y;
      public Point(int x,int y){
        this.x = x;
        this.y = y;
      }
      
  }
}
