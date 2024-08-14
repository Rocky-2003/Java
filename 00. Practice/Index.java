import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Index {
    public static void main(String[] arg) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) < arr.get(i)) {

                al.add(arr.get(i));
            } else if (arr.get(i - 1) == arr.get(i)) {

                al.add(arr.get(i));
            } else {
                al.add(arr.get(i - 1));
            }
        }
    System.out.println(al);
    }
}