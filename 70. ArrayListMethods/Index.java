import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

class Index {
  public static void main(String[] arg) {
    // Adding Elements
    ArrayList<String> al = new ArrayList<String>(5); // Create an ArrayList with initial capacity of 5
    al.add("Geeks"); // add(Object o)
    al.add("For");
    al.add(1, "Java"); // add(int index, Object element)
    al.addAll(Arrays.asList("Programming", "Language")); // addAll(Collection C)
    al.addAll(2, Arrays.asList("New", "Elements")); // addAll(int index, Collection C)
    System.out.println("After adding elements: " + al);

    // Modifying and Removing Elements
    al.set(2, "Advanced"); // set(int index, E element)
    al.remove("Java"); // remove(Object o)
    al.remove(1); // remove(int index)
    al.removeIf(s -> s.startsWith("G")); // removeIf(Predicate filter)
    System.out.println("After modifications and removals: " + al);

    // Cloning and Capacity Management
    ArrayList<String> clonedList = (ArrayList<String>) al.clone(); // clone()
    System.out.println("Cloned List: " + clonedList);

    al.ensureCapacity(10); // ensureCapacity(int minCapacity)
    al.trimToSize(); // trimToSize()
    System.out.println("After ensuring capacity and trimming: " + al);

    // Accessing Elements
    System.out.println("Element at index 0: " + al.get(0)); // get(int index)
    System.out.println("Index of 'Advanced': " + al.indexOf("Advanced")); // indexOf(Object O)
    System.out.println("Last index of 'Language': " + al.lastIndexOf("Language")); // lastIndexOf(Object O)
    System.out.println("Is the list empty? " + al.isEmpty()); // isEmpty()
    System.out.println("Size of the list: " + al.size()); // size()

    // Checking and Iterating
    System.out.println("Does the list contain 'Advanced'? " + al.contains("Advanced")); // contains(Object o)
    al.forEach(System.out::println); // forEach(Consumer<? super E> action)
    ListIterator<String> listIterator = al.listIterator(); // listIterator()
    System.out.print("ListIterator output: ");
    while (listIterator.hasNext()) {
      System.out.print(listIterator.next() + " ");
    }
    System.out.println();

    // Spliterator and SubList
    Spliterator<String> spliterator = al.spliterator(); // spliterator()
    System.out.println("Spliterator estimate size: " + spliterator.estimateSize());
    List<String> subList = al.subList(0, 2); // subList(int fromIndex, int toIndex)
    System.out.println("SubList from index 0 to 2: " + subList);

    // Array Operations
    String[] array = al.toArray(new String[0]); // toArray(Object[] O)
    System.out.println("Array from list: " + Arrays.toString(array));
    ArrayList<String> al2 = new ArrayList<>(Arrays.asList(array));
    System.out.println("ArrayList from array: " + al2);

    // Remove Range (Note: `removeRange` is protected, so it's not used directly
    // here.)
    // However, it's shown for educational purposes:
    // al.removeRange(0, 2); // removeRange(int fromIndex, int toIndex)
  }
}