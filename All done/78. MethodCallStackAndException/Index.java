public class Index {
  public static void main(String[] arg) {
    try {
      System.out.println("Main Method Entered");
      methodA();
      System.out.println("Main Method Exited");
    } catch (ArithmeticException e) {
      System.out.println("Main Method Catch");
      e.printStackTrace();
    } finally {
      System.out.println("caught");
    }
  }

  public static void methodA() {
    System.out.println("MethodA Entered");
    methodB();
    System.out.println("MethodA Exited");
  }

  public static void methodB() {
    try {

      System.out.println("Method b Entered");
      int a = 3;
      int b = 0;
      int c = a / b;
      System.out.println("Method B exited");

    }

    finally {
      System.out.println("MethodB Finaly");
    }
  }
}














