public class Index<T> implements Imp<T> {

  private T item;

  @Override
  public void compare(T o) {
    this.item = o;
    System.out.println(o);

  }

  public static void main(String[] args) {
    Index<String> cl = new Index<>();
    cl.compare("Rocky Mor Shab");
  }
}

interface Imp<T> {

  public void compare(T o);
}