import java.util.ArrayList;

public class Index{

  // static Generics method
  public static <T> void count( ArrayList<T> arr, T x) {
    System.out.println(arr.get(0));
    // Traverse the array
    for (T e : arr) {
      System.out.println(e);
    }
  
  }
  public static void main(String[] args) {
    ArrayList<String> s = new ArrayList<>();
    // Integer arr[] = { 10, 20, 30, 40, 10, 30 };
    s.add("Rocky");
    s.add("Mor");
    s.add("Shab");
    s.add("Jaat");
    count(s, "Rocky");
  }
}




