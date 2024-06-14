import java.util.Scanner;

import javax.net.ssl.SNIHostName;

/**
 * Index
 */
public class Index {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int presntDay = sc.nextInt();
    int FindDay = sc.nextInt();

    int day = presntDay - (FindDay % 7);
    if (day > 0) {
      System.out.println(day);
    } else {
      System.out.println(day + 7);
    }

  }
}