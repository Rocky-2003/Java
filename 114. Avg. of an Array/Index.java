import java.util.Arrays;

public class Index {
  public static void main(String[] arg) {
    int arr[] = { 1, 2, 3, 4, 5 };
    double avg = Arrays.stream(arr).average().getAsDouble();

    System.out.println(avg);
  }
}