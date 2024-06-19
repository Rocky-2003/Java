public class Index {
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    boolean c = true;
    boolean d = false;

    // Logical And &&
    System.out.println("Logical AND");
    System.out.println(a && c);
    System.out.println(b && a);
    System.out.println(a && b);
    System.out.println(b && d);
    // Logical OR ||
    System.out.println("Logical OR");
    System.out.println(b || a);
    System.out.println(c || a);
    System.out.println(d || b);
    System.out.println(c || b);
    // logical Not !
    System.out.println("Logical Not");
    System.out.println(!a);
  }
}
