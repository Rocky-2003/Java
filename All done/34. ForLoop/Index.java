public class Index {
  public static void main(String[] args) {
    // ? Table of a Number (2,3 any number)

    int num = 5;
    for (int i = 0; i <= 10; i++) {
      System.out.println(num * i);
    }

    // ? Factorial of a Number
    int fact = 1;
    for (int i = 1; i <= num; i++) {

      fact = fact * i;

    }
    System.out.println("factorial: "+ fact);
  }
}
