
interface Test1 {
  void print(Integer i, Integer l);
}
public class Index{
  static void fun(Test1 t, Integer i, Integer l) {
    t.print(i, l);
  }

  public static void main(String[] arg) {
    fun((x,y)->System.out.println(x+y), 14, 14);
    
  }
}