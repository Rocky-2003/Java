public class Index {

  void soutMain() {
    System.out.println("This is the Main Class: Index");
  }

  public static void main(String[] arg) {
    Index I = new Index();

    B b = I.new B();
    A a = I.new A();
    C c = I.new C();

    a.sout1();
    b.sout2();
    c.sout3();

  }

  class A extends Index {

    public void sout1() {
      soutMain();
      System.out.println("This is class: A");
    }
  }

  class B extends Index {
    public void sout2() {
      soutMain();
      System.out.println("This is class: B");
    }
  }

  class C extends Index {
    public void sout3() {
      soutMain();
      System.out.println("This is class: C");
    }
  }

}
