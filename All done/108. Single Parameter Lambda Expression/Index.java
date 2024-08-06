interface Test1 {
  void print(Integer i);
}

public class Index {

  static void fun(Test1 t, Integer p) {
    t.print(p);
  }

  public static void main(String[] arg) {

    fun(p -> System.out.println(p), 12);

  }
}