public class Index {
  public static void main(String[] args) {
    // ? Count Digits in a Number(99999) (use number/10)

    int num = 34465455;
    int digit = 0;
    System.out.println("Started");
    while (num > 0) {
      num = num / 10;
      digit++;

    }
    System.out.println(digit);

  }

}
