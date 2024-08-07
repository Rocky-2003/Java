import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Index{
  public static void main(String[] arg){
    List<Integer> lst = new ArrayList<>();
    lst.add(1);
    lst.add(2);
    lst.add(3);


    // List Iteratro creation
    ListIterator<Integer> it = lst.listIterator();


// Treavesing
while (it.hasNext()) {
      System.out.println(it.next());
    }

  }
}