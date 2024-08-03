import java.util.ArrayList;
import java.util.Iterator;

public class Index {
  public static void main(String[] arg) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);

    Iterator<Integer> i = al.iterator();

    while (i.hasNext()) {
      System.out.println(i.next());
      
    }


  }
}