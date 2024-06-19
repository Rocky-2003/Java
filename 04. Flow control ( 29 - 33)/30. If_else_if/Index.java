import java.util.Scanner;

import javax.swing.text.Style;

public class Index {
  public static void main(String[] args) {
    // Even odd Zero -ve Even -ve odd
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n < 0) {
      if (n % 2 == 0) {
        System.out.println("-ve Even");
      } else {
        System.out.println("-ve Odd");
      }
    } else if (n > 0) {
      if (n % 2 == 0) {
        System.out.println("+ve Even");
      } else {
        System.out.println("+ve Odd");
      }
    } else {
      System.out.println("Zero");
    }
  }
}
