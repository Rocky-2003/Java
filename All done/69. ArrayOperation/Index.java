import java.util.ArrayList;

class Index {
  public static void main(String[] arg) {

    ArrayList<String> al = new ArrayList<String>(4);

    // Adding Elements
    al.add("Rocky");
    al.add("Mor");
    al.add("Shab");
    // al.add(2, "Shab");


    // Iterating over array
    for (int i = 0; i < al.size(); i++) {
      System.out.println(al.get(i));
    }


    // Changing Elements
    al.set(1, "Choudhary");

    // removing Elements
    al.remove(2);
    al.remove("Choudhary");

    // Iterating over array
    for (int i = 0; i < al.size(); i++) {
      System.out.println(al.get(i));
    }
  }
}