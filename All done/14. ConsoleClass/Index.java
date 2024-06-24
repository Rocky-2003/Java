public class Index {
  public static void main(String[] args) {
    // Java program to demonstrate working of System.console()
    // Note that this program does not work on IDEs as
    // System.console() may require console

    // Using console to take input from the user
    System.out.print("Enter You Name:");
    String name = System.console().readLine();

    // Outputing the data readed from the use
    System.out.println("You entered string " + name);

  }
}
