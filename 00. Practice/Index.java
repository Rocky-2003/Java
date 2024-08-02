import java.util.ArrayList;
import java.lang.ArithmeticException;

public class Index {

    

    public static void main(String[] arg) throws ArithmeticException{
        int m = 3;
        int n = 12;

        ArrayList<Integer> al = new ArrayList<>();
        // Your code here
        for (int i = 1; i <= n; i++) {
            if (!(i % m == 0)) {
                al.add(i);

            }
        }

        System.out.println(al.size());

        int i = al.size();
        System.out.println(i);
try{
    throw new Error(ArithmeticException);
}

    }
}
