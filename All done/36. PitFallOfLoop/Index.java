public class Index {
  public static void main(String[] ags) {
    // infinite loop because condition is not apt
    // condition should have been i>0.
    for (int i = 5; i != 0; i -= 2) {
      System.out.println(i);
    }
    int x = 5;

    // infinite loop because update statement
    // is not provided.
    while (x == 5) {
      System.out.println("In the loop");
    }

    ArrayList<Integer> ar = new ArrayList<>();
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      ar.add(i);
    }
  }
}
