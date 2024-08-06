import java.util.ArrayList;
import java.util.List;

public class Index {
  public static void main(String[] arg) {
    List<Integer> l = new ArrayList<>();
    // add collection method
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    l.add(5);

    // set list method
    l.set(1, 3);

    // get list method
    l.get(1);

    // indexOf list operation
    l.indexOf(3);

    l.remove(1);


    System.out.println(l);

  }
}
