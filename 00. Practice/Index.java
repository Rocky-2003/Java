import java.util.Scanner;


/**
 * Index
 */
public class Index {

  public static int Nth_term(int a, int r, int n) {
    int result = a *(int)(Math.pow(r, n-1));

    return result;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int r = sc.nextInt();
    int n = sc.nextInt();

    System.out.println(Nth_term(a, r, n));

  }
}