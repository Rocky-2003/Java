import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Index{
  public static void main(String[] arg) {
    List<Integer> l = new ArrayList<>();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);


    ListIterator<Integer> it = l.listIterator(l.size());

    while (it.hasPrevious()) {
      it.set(it.previous() * 2);
    }

    System.out.println(l);
  }
}