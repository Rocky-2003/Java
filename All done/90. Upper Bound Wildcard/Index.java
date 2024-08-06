import java.util.ArrayList;

public class Index {

  // static void printObj(ArrayList<?> arr) {
  // ? Here we use unbound means any type of object so we used the Object Refernce
  // here(Note: Object is the Last and one ansestor of every class that is use by
  // Unbound Wildcard Generics and that's why we can't able use type specific
  // operation here)
  // for (Object val : arr) {
  // ?cant access the printp, because we have access only Object not the type
  // specific operations
  // val.printp();
  // }
  // }

  static void printObj1(ArrayList<? extends Student> arr) {
    for (Student val : arr) {
      val.printp();
    }
  }

  public static void main(String[] args) {
    // ArrayList<?> l1 = new ArrayList<>();
    ArrayList<? extends Student> l2 = new ArrayList<>();

    ArrayList<EngStudent> EngStu = new ArrayList<>();
    // l1 = EngStu;
    l2 = EngStu;

    EngStu.add(new EngStudent());
    EngStu.add(new EngStudent());
    EngStu.add(new EngStudent());
  

    printObj1(EngStu);

  }
}

class Student {
  void printp() {
    System.out.println("Student");
  }
}

class EngStudent extends Student {
  void printp() {
    System.out.println("EngineeringStudent");
  }
}

class MangStudents extends Student {
  void printp() {
    System.out.println("MangStudents");
  }
}