import java.util.ArrayList;

public class Index {

  public static void main(String[] arg){
    ArrayList<ArrayList<Integer>> al = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();


    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);
    list2.add(12);
    list2.add(23);
    list2.add(34);
    list2.add(45);
    list2.add(05);


    
    // Modifying ArrayList itself 
    al.add(list1);
    al.add(list2);
    
    // Modifying ArrayList items 
    // Modify the elements of the 0 index ArrayList (list1)
    // Change the first element (index 0) to 10

    al.get(0).set(0, 10); // list1.get(0) is 1, setting it to 10

    // Change the second element (index 1) to 20
    al.get(0).set(1, 20); // list1.get(1) is 2, setting it to 20

    // Change the third element (index 2) to 30
    al.get(0).set(2, 30); // list1.get(2) is 3, setting it to 30

    System.out.println(al);
   }
}