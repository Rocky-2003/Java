// Java program to Illustrate Working of an ArrayList

// Importing required classes 
import java.io.*;
import java.util.*;

// Main class 
public class Index {

  // Main driver method
  public static void main(String[] args) {
    // Creating an ArrayList of Integer type
    ArrayList<Integer> arrli = new ArrayList<Integer>();

    // Appending the new elements
    // at the end of the list
    // using add () method v,a for loops
    for (int i = 1; i <= 5; i++)
      arrli.add(i);

    // Printing the ArrayList
    System.out.println(arrli);

    // Removing an element at index 3
    // from the ArrayList
    // using remove() method
    arrli.remove(3);

    // Printing the ArrayList after
    // removing the element
    System.out.println(arrli);
  }
}
