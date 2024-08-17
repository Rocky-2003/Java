import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Index {
    public static void main(String[] arg) {
        int n = 7;
        int k = 3;
        LinkedList<Integer> al  = new LinkedList<>();
    for(int i =0; i<= n; i++){
        al.add(i);
    }

    Iterator<Integer> it = al.iterator();
    
    while (al.size() > 1) {
        int count = 1;
        System.out.println(al);
        while (count <= k) {
            while (it.hasNext() && count <= k) {
                it.next();
                count++;
            }

            if (count < k) {
                it = al.iterator();
                it.next();
                count++;
            }
        }
        it.remove();
        System.out.println(al);
    }
    }
}