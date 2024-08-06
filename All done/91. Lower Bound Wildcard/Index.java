import java.util.ArrayList;
import java.util.List;

public class Index {

  static void printList(List<? super Dog> list) {
  

    for (Object val : list) {
      System.out.println(val);
    }
  }

  static void addDog(List<? super Dog> list) {
    list.add(new Dog());
  }

  public static void main(String[] arg) {

    ArrayList<Animals> anim = new ArrayList<>();
    ArrayList<Dog> dog = new ArrayList<>();
    ArrayList<Cat> cat = new ArrayList<>();
    ArrayList<Object> objects = new ArrayList<>();


    anim.add(new Dog());
    addDog(anim);
    addDog(dog);
    addDog(objects);
    // addDog(cat); this will give us the comiple time error becaust CAT is not the
    // parent and children of Dog , and as we know super means ancestors so, cat is
    // not ancestor
   

   
    printList(dog); // Should contain Dog
    printList(anim); // Should contain Dog
    printList(objects); // Should contain Dog
  }
}

class Animals {
  void c() {
    System.out.println("Animals speaks");
  }
}

class Dog extends Animals {

  void speak() {
    System.out.println("Bow Bow");
  }
}

class Cat extends Animals {

  void speak() {
    System.out.println("Meao Meao");
  }
}