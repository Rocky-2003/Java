import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Index {
  public static void main(String[] arg) {
    List<Integer> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(9);

    ListIterator<Integer> it = l.listIterator();

    while (it.hasNext()) {
      // it.add(5);
      System.out.println(it.next());
      it.add(5);
    }

    System.out.println(l);
  }
}