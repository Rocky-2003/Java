
interface Test1 {
  void print();

}



public class Index {
  static void fun(Test1 t) {
    t.print();
  }

  public static void main(String[] arg) {
    fun(() -> System.out.print("Hello world"));
  }
}