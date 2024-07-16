

public class Index {

  int x = 3;
  int y;

  Index() {
    System.out.println("Hey");
  }

  Index(int a) {
    y = a;
  }

  void prin() {
    System.out.println(y);
  }

  public static void main(String[] arg) {

    Child obj = new Child();
  }

}

class Child extends Index {
  public Child() {
    super(8);
    System.out.println(super.x);
    super.prin();
  }

}