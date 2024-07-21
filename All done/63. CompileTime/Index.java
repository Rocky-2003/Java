 class child {

  public static void parent() {
    System.out.println("No argument Needed!");
  }

  public static void parent(int a) {
    System.out.println(a);
  }

  public static void parent(int a, int b) {
    System.out.println(a + "_" + b);
  }


  public static float parent(float a) {
    return a;
  }

 
}

public class Index extends child {
  public static void main(String[] args) {
    child.parent();
    child.parent(2);
    child.parent(2, 4);
   
 System.out.println( child.parent(2.2f)); }
}