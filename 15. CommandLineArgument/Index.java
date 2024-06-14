public class Index {
  // Program to check for command line arguments
  public static void main(String[] args) {
    // Check if any command-line arguments are provided
    if (args.length == 0) {
      System.out.println("No command-line arguments provided.");
    } else {
      // Print each command-line argument
      System.out.println("Command-line arguments:");
      for (int i = 0; i < args.length; i++) {
        System.out.println("Argument " + (i + 1) + ": " + args[i]);
      }
    }
  }
  //*  PS D:\Desktop\Java\Java_Programs\15. CommandLineArgument> javac Index.java 
  //*  PS D:\Desktop\Java\Java_Programs\15. CommandLineArgument> java Index.java rocky mor
  //*  Command-line arguments:
  //*  Argument 1: rocky
  //*  Argument 2:mor
}
