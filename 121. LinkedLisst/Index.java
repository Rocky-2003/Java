import java.util.Iterator;
import java.util.LinkedList;

public class Index {

  public static void main(String[] arg) {
    LinkedList<Integer> ls = new LinkedList<>();

    ls.add(1);
    ls.add(2);
    ls.add(3);
    ls.add(4);
    ls.add(5);

    System.out.println(ls);

    // Iterate using Iterator;

    Iterator<Integer> i = ls.iterator();

    while (i.hasNext()) {
      System.out.println(i.next());
    }

  }
}