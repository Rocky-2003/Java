import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Index {

  static void printCol(Collection<Integer> c, Predicate<Integer> p) {
    for (Integer x : c) {
      if (p.test(x)) {
        System.out.print(x + " ");
      }
    }
  }

  public static void main(String[] arg) {

    // ? Function  Interface
    class MyPredicateEven implements Predicate<Integer> {
      // The only abstract method
      // to return when the integer is even
      public boolean test(Integer x) {
        return (x % 2 == 0);
      }
    }

    List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10));
    printCol(l, new MyPredicateEven());
  }
}