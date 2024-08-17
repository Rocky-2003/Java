import java.util.Iterator;
import java.util.LinkedList;

public class Index {
  public static void main(String[] arg) {
    LinkedList<Integer> ls = new LinkedList<>();
    int k = 3;

    ls.add(1);
    ls.add(5);
    ls.add(6);
    ls.add(7);
    ls.add(3);
    ls.add(4);
    ls.add(9);

    System.out.println(ls);
    Iterator<Integer> i = ls.iterator();
    while (ls.size() > 1) {

      int count = 1;
      while (count < k) {
        while (i.hasNext() && count <= k) {
          i.next();
          count++;

        }
        if (count < k) {
          i = ls.iterator();
          i.next();
          count++;
        }

        i.remove();

        
      }

    }
    

    System.out.println(ls);
  }
}