//Class Declaration
public class Index {

  public static void main(String[] arg) {

    // Creating a object(Instance of Class)
    Dog sc = new Dog();

  }

  public static class Dog {
    Dog(String n) {
      System.out.println(n);

    }

    Dog() {
      System.out.println("Enter the Name:");
    }

  }

}