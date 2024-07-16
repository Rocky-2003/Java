public class Index {

  int a = 4;

  public int m() {

    return a;
  }

  public static void main(String[] arg) {
    Sub cl = new Sub();
    Index i = new Index();
    System.out.println(i.a);
    System.out.println(cl.m(8));
  }
}

class Sub extends Index {

  // Method Overiding
  int m(int n) {
    a = n;
    return a;
  }
}