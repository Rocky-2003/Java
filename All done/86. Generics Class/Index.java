public class Index {
  public static void main(String[] arg) {

    Pair<Integer, String> p = new Pair<>();

    p.x = 23;
    p.y = "Hello World";

    String str = (String) p.y;
    System.out.println(str);

  }
}

class Pair<T, S> {
  T x;
  S y;
}