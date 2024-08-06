import java.util.ArrayList;
import java.util.List;

public class Index {
  
  public static void passList(List<?> arr) {
    
    for (Object val : arr) {
      System.out.println(val);
    }

  }
  public static void main(String[] arg){
    ArrayList<String> al = new ArrayList<>();
    al.add("Rocky");
    al.add("Mor");
    al.add("Shab");
    al.add("Jaat");

    List<Integer> al2 = new ArrayList<>();
    al2.add(2);
    al2.add(3);
    al2.add(4);
    al2.add(45);
    passList(al);
    passList(al2);
  }
}