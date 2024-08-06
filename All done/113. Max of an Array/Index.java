import java.util.Arrays;

public class Index{
  public static void main(String[] arg) {
    int arr[] = { 1, 2, 3, 4,1000, 5, 6, 7, 8, 9, 10,500 };

    int max = Arrays.stream(arr).max().getAsInt();
    System.out.println(max);

  }
}