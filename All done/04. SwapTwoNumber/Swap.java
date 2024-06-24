
public class Swap {
  public static void main(String[] args) {

    // Using Temporary Variable
    int a = 4;
    int b = 8;
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("A: " + a + "\nB: " + b);

    // Using Arithmetic Operator
    int i = 4;
    int j = 8;

    i = i + j;
    j = i - j;
    i = i - j;
    System.out.println("I: " + i + "\nJ: " + j);
  }
}
