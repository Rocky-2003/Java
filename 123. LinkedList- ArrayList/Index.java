// Java program to Demonstrate Working of a LinkedList

// Importing required classes
import java.util.*;

// Main class
class Index {

  // main driver method
  public static void main(String args[]) {

    // Creating an object of the
    // class linked list
    LinkedList<String> object = new LinkedList<String>();

    // Adding the elements to the object created
    // using add() and addLast() method

    // Custom input elements
    object.add("A");
    object.add("B");
    object.addLast("C");

    // Print the current LinkedList
    System.out.println(object);

    // Removing elements from the List object
    // using remove() and removeFirst() method
    object.remove("B");
    object.removeFirst();

    System.out.println("Linked list after "
        + "deletion: " + object);
  }
}
