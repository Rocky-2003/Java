public class Index {
  // Java program to demonstrate working of printf()

  public static void main(String args[]) {
    int x = 100;

    System.out.printf("Printing Simple Integer: %d\n", x);

    // this will print it upto 2 decimal places
    System.out.printf("Formated with precision: %.2f\n", Math.PI);

    float n = 5.2f;

    // automatically appends zero to the rightmost part
    // of decimal
    System.out.printf("Formated to specified Width: %.4f\n", n);

    n = 2324435.3f;

    // here number is formatted from right margin and
    // occupies a width of 20 characters
    System.out.printf("Formted to right margin: n = %20.4f\n", n);

  }

}
