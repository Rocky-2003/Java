import java.util.ArrayList;
import java.util.List;


public class Index {
  public static void main(String[] arg) {
    List<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);

    // Using for each loop 
    for (Integer a : al) {
      System.out.println(a);
    }
  }
}