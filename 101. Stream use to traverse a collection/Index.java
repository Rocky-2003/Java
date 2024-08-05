import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Index {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("apple", "banana", "avocado", "orange", "apricot");

    List<String> result = strings.stream() // Create a stream from the list
        .filter(s -> s.startsWith("a")) // Filter strings that start with "a"
        .map(String::toUpperCase) // Convert to uppercase
        .collect(Collectors.toList()); // Collect the result into a list

    System.out.println(result); // Output: [APPLE, AVOCADO, APRICOT]
  }
}
  