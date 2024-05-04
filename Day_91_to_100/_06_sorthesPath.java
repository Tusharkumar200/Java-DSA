public class _06_sorthesPath {

  public static float path(String path){
    
    int x =0;
    int y=0;
    for (int i = 0; i < path.length(); i++) {
      char dir = path.charAt(i);
      // south
      if(dir == 'S'){
        y--;
      }
      // North
      else if(dir == 'N'){
        y++;
      }

      // East
      else if(dir == 'E'){
      x++;
      }
      // West
      else{
        x--;
      }
    }
    int x2 = x*x;
    int y2 = y * y;

    return (float)Math.sqrt(x2+y2);

  }
  public static void main(String[] args) {
    String Path = "WNEENESENNN";
    System.out.println(path(Path));
  }
}
