import java.util.Scanner;

import javax.swing.text.Style;

public class Index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    System.out.println("Enter a Charater of Strigns");
    String st = sc.nextLine();
    System.out.println("Enter a string and get the charater at:");
    char ch = sc.next().charAt(0);
    System.out.println("Enter a Short");
    short s = sc.nextShort();
    System.out.println("Enter a Integer");
    int a = sc.nextInt();
    System.out.println("Enter an Long");
    long b = sc.nextLong();
    System.out.println("Enter a Float");
    float c = sc.nextFloat();
    System.out.println("Enter a Double");
    double d = sc.nextDouble();

    sc.close();
    System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+s+"\n"+ch+"\n"+st);


  }
}
