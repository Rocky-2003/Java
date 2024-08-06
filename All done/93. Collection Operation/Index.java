import java.util.ArrayList;
import java.util.List;

public class Index {
  public static void main(String[] arg) {
    
    List<Integer> al = new ArrayList<>();
    

    //add Operation
    al.add(1);
    al.add(2);
    al.add(23);

    // Size Operation
    System.out.print("Size Operation:");
    System.out.println(al.size());

    
    // isEmpty
    System.out.print("isEmpty Operation:");
    System.out.println(al.isEmpty());
    
    // contains
    System.out.print("contains Operation:");
    System.out.println(al.contains(1));
    
    // remove() 
    System.out.print("Remove Operation:");
    al.remove(0);
    System.out.println(al);


    



  }
}