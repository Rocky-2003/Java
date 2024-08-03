import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Index {
  public static void main(String[] arg){
    List<Integer> al = Arrays.asList(1, 2,3, 4, 5, 6);

    Stream<Integer> s = al.stream();
    s.forEach(x->System.out.println(x));
  }
}
