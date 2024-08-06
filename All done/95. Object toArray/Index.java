import java.util.ArrayList;

public class Index {
  public static void main(String[] arg) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);

    Object arr[] = al.toArray();
    for (Object a : arr) {
    System.out.println(a);
   }




  }
}