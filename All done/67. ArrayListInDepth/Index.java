import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Index {
  public static void main(String[] args) {
    // Using ArrayList
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Cherry");
    System.out.println("ArrayList: " + arrayList);

    // Using Vector
    List<String> vector = new Vector<>();
    vector.add("Dog");
    vector.add("Elephant");
    vector.add("Frog");
    System.out.println("Vector: " + vector);

    // Using LinkedList
    List<String> linkedList = new LinkedList<>();
    linkedList.add("Giraffe");
    linkedList.add("Hippo");
    linkedList.add("Iguana");
    System.out.println("LinkedList: " + linkedList);

    // Using CopyOnWriteArrayList
    List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    copyOnWriteArrayList.add("Jaguar");
    copyOnWriteArrayList.add("Kangaroo");
    copyOnWriteArrayList.add("Lion");
    System.out.println("CopyOnWriteArrayList: " + copyOnWriteArrayList);
  }
}
