import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int count = 0;

    System.out.println("To Stop the count press and charater and enter");
    System.out.println("Enter Integer values and get the mean:");
    while (sc.hasNextInt()) {
      int i = sc.nextInt();
      sum = sum + i;
      count++;
    }

    int mean = sum / count;
    System.out.println(mean);
    sc.close();

  }
}
