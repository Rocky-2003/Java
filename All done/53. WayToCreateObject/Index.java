public class Index {

  public static class InnerIndex {
    InnerIndex() {
      System.out.println("I'm Inner Index:");
    }


  }
  public static void main(String[] arg) {
    // Creating a object using `new` keyword
    InnerIndex obj1 = new InnerIndex();
    InnerIndex obj2 = (InnerIndex)obj1.clone();
  }
}


