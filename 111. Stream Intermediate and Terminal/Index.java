import java.util.*;
import java.util.stream.Stream;

public class Index {

  public static void main(String[] arg) {
    List<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    // 1. Stream<Integer> s = al.stream();
    // 2. al.Stream().filter();

    // ? Creating a Stream
    Stream<Integer> s = al.stream();

    // ? Chaining methods on Stream
    s.filter(x -> x % 2 == 0).filter(x -> x > 5).forEach(x -> System.out.println(x));
    ;
  }
}