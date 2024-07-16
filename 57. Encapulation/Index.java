public class Index {

  public static void main(String[] arg) {
    Run get = new Run();

    System.out.println(get.add());
    System.out.println(get.val1());
    System.out.println(get.val2());
    System.out.println(get.name());
  }
}

class Run {
  private int a = 24;
  private int b = 2;

  private String s = "Rocky Mor Shab";

  public int add() {
    return a + b;
  }

  public int val1() {
    return a;
  }

  public int val2() {
    return b;
  }

  public String name() {
    return s;
  }

}