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
    al.add(6);
    al.add(7);
    al.add(8);
    al.add(9);
    al.add(10);

   
    Iterator<Integer> it = al.iterator();
   
    while (it.hasNext()) {  
      if (it.next() % 2 == 0) {
        it.remove();
      }
    }

  }
}