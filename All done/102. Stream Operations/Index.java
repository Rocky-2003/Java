import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Index {
  public static void main(String[] arg) {
    // ? Stream from a collection
    List<String> al = Arrays.asList("Rocky", "Mor", "Shab", "BassAla", "Jaat");
    Stream<String> s = al.stream();
    System.out.println("Stream from a collection");
    s.forEach(x -> System.out.println(x));

    //? Stream from an array
    String[] array = { "x", "y", "z" };
    Stream<String> streamFromArray = Arrays.stream(array);
    System.out.println("Stream from an array");
    streamFromArray.forEach(x -> System.out.println(x));

    //? Stream using a generating function
    Stream<Integer> streamFromGenerate = Stream.generate(() -> 1).limit(10);
    System.out.println("Stream using a generating function");
    streamFromGenerate.forEach(x -> System.out.println(x));

    //? Stream using an iterator
    Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1).limit(10);
    System.out.println("Stream using an iterator");
    streamFromIterate.forEach(x -> System.out.println(x));

  }
}