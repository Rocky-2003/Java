import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Index {

  static void printCol(Collection<Integer> c, Predicate<Integer> p) {
    for (Integer a : c) {
      if (p.test(a)) {
        System.out.println(a);
      }

    }
  }

  public static void main(String[] arg) {

    List<Integer> l = new ArrayList<>(
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
    Predicate<Integer> myPredicate = new Predicate<Integer>() {
      public boolean test(Integer x) {
        return x % 2 == 0;
      }
    };

    printCol(l, myPredicate);

  }
}