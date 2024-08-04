import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Index {

  Index() {
    System.out.println("Hello");
  }

  // Constructor
  Index(int a) {
    System.out.println(a);
  }

  // Instance Method
  public void show(int a) {
    System.out.println(a);
  }

  // Static Method
  public static void show2(int a) {
    System.out.println(a);
  }

  public static void main(String[] arg) {
    List<Integer> l1 = new ArrayList<Integer>();

    l1.add(10);
    l1.add(20);
    l1.add(30);
    l1.add(40);
    l1.add(50);

    System.out.println("Using Static Method:");
    // Using Static Method
    l1.forEach(Index::show2);

    System.out.println("Using Instance Method:");
    Index cl = new Index();
    // Using Instance Method
    l1.forEach(cl::show);

    System.out.println("Using Constructor");
    // Using Constructor
    l1.forEach(Index::new);

    System.out.println("Using Consumer Interface with accept() functionality");
    Consumer<Integer> consume = (Integer t) -> System.out.println(t);
    l1.forEach(consume);
    



    // Using Comprator Interface
    // Arrays of Strings
    String a[] = { "GfG", "IDE", "Courses" };
    String b[] = { "gfg", "ide", "courses" };

    // equals() method to compare ignoring
    // the cases
    // Third parameter is a comparator using
    // which we can define the basis of comparison
    if (Arrays.equals(
        a, b, String::compareToIgnoreCase))
      System.out.println("Yes");
    else
      System.out.println("No"); 
  }
}