import java.util.ArrayList;

public class Index {
  public static void main(String[] arg) {
    

    // Size of the
    // ArrayList
    int n = 5;



    // Declaring the ArrayList with
    // initial size n
    ArrayList<Integer> al = new ArrayList<Integer>(n);

    // Appending new elements at
    // the end of the list
    for (int i = 1; i <= n; i++)
      al.add(i);

    // Printing elements
    System.out.println(al);

    // Remove element at index 3
    al.remove(3);

    // Displaying the ArrayList
    // after deletion
    System.out.println(al);

    // Printing elements one by one
    for (int i = 0; i < al.size(); i++)
      System.out.print(al.get(i) + " ");


  }
}