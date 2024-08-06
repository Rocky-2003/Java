import java.util.ArrayList;

public class Index {
  public static void main(String[] arg) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);

    // Provide array
    Integer i[] = new Integer[al.size()];

    // toArray(T[] i)
    i = al.toArray(i);

    // For loop
    for (Integer a : i) {
      System.out.println(a);
    }

  }
}