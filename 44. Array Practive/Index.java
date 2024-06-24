import java.util.Scanner;

public class Index {

  public static boolean isSorted(int[] a, int n) {
    System.out.println(a.length);
    for (int i = 1; i < a.length; i++) {
      if (a[i] < a[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int x = 10;
    System.out.println(a.length);
    for (int i = 0; i < a.length; i++) {
      a[i] = x;
      x = x -1;
    }

    boolean arrSoted = isSorted(a, n);

    if (arrSoted == true) {
      System.out.println("True");
    } else {
      System.out.println("Flase");
    }

  }
}