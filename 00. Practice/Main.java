public class Main {

  public static boolean within3OfMultipleOf10(int n) {
    // Calculate the remainder when n is divided by 10
    int remainder = n % 10;

    // // Check if remainder is within the range -3 to 3
    // if (remainder >= -3 && remainder <= 3) {
    //   return true;
    // }

    // Check if n itself is within 3 units of the next multiple of 10
    if (remainder >= 7 && remainder <= 13) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    // Test cases
    System.out.println(within3OfMultipleOf10(7)); // true (7 is 3 units from 10)
    System.out.println(within3OfMultipleOf10(5)); // true (20 is 0 units from 20)
    System.out.println(within3OfMultipleOf10(28)); // true (28 is 2 units from 30)
    System.out.println(within3OfMultipleOf10(37)); // false (37 is not within 3 units of any multiple of 10)
  }
}
