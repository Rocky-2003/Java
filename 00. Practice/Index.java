import java.util.ArrayList;

class Student {
    void print() {
        System.out.println("Student");
    }

    void print2()
    {
        System.out.println("Parent Class");
        
    }
}


class EngineeringStudent extends Student {
    void print() {
        System.out.println("Engineering Student");
    }
}

public class Index {


    static <T> void print1(ArrayList<T> c) {
        for (T e : c) {
            System.out.println(e);
        }
    }

    public static <T> void printData(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        ArrayList<? extends Student> al = new ArrayList<>();
        ArrayList<EngineeringStudent> al1 = new ArrayList<>();
      

        // al = al1;
        al1.add(new EngineeringStudent());
        al.add(new Student());
        al1.get(0).print();
        al.get(0).print();
       

     
    }
}

