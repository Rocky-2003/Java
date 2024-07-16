import java.util.ArrayList;
import java.util.Iterator;

/**
 * Index
 */
public class Index {
  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>();
    list.add("apple");
    list.add("banana");
    list.add("banana");
    list.add("Cherry");

    // 1. Using For Loop
    System.out.println("Using For-Loop");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    System.out.println("Using For-Each Loop");
    // 2. Using For-each loop
    for (String fruit : list) {
      System.out.println(fruit);
    }

    System.out.println("Using Iterator");
    // Using a Iterator
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    
    System.out.println("Using For-each Method");
    // Using a for_each Method
    list.forEach(fruit -> System.out.println(fruit));
  }

}
