public class StringBuilderExample {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    StringBuffer sb1 = new StringBuffer("Hello");
    // Append a string to the builder
    sb.append(" World");
    sb1.append(" World");

    // Insert a string at a specific position
    sb.insert(6, "Java ");  
    sb1.insert(6, "Java ");

    // Replace a portion of the string
    sb.replace(6, 10, "Beautiful");
    sb1.replace(6, 10, "Beautiful");

    // Delete a portion of the string
    sb.delete(15, 21);
    sb1.delete(15, 21);

    // Convert to String and print the result
    String result = sb.toString();
    System.out.println(result); // Output: Hello Beautiful World
    String result1 = sb1.toString();
    System.out.println(result1); // Output: Hello Beautiful World
  }
}
