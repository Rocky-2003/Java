import java.io.FileNotFoundException;
import java.util.Scanner;

public class Index {
  public static void main(String[] arg) {

    try {

      Scanner sc = new Scanner(System.in);
      int arr[] = { 1, 2, 3, 4, 5 };
      System.out.println(arr[9]);

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Program is ended");
    }

    try {
      int x = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }

  }
}