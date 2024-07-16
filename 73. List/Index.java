import java.util.ArrayList;
import java.util.List;

public class Index {
  public static void main(String[] arg) {

    List<Integer> l1 = new ArrayList<>();

    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.add(4);
    l1.add(5);

    List<Integer> l2 = new ArrayList<>();
    l2.add(6);
    l2.add(7);
    l2.add(8);
    l2.add(9);
    l2.add(10);

    l1.addAll(5, l2);


    System.out.println(l1);
  }
}