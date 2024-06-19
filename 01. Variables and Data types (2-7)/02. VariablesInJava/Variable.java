/**
 * Variable
 */
public class Variable {

  // This is a Static variable
  static int z = 33;

  // This is a Instance varibale
  int y = 44;

  public static void main(String[] args) {

    // This is a local varable
    int x = 23;
    System.out.println("Local Variable"+x);

    // Accessing Instance Varibale
    Variable variable = new Variable();
    System.out.println("Instance Variable"+variable.y);


    // Accessing Static Variable
    System.out.println("Static Variable"+z);

  }
}