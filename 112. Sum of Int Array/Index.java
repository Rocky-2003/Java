import java.util.Arrays;

public class Index{
  public static void main(String[] arg) {
    int arr[] = { 1, 2, 3, 4, 5 };
    // Stream operation sum // present only in INTStream , long, Souble
    int sum = Arrays.stream(arr).sum();
    System.out.println(sum);
    
  }
}