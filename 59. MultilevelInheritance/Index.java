public class Index {

  public void name() {
    System.out.println("Rocky");
  }

  public static void main(String[] arg) {
    two g = new two();
    g.age();
    g.name();
    g.id();
  }
}

class one extends Index {
  public void age() {
    System.out.println("20");
  }

}

class two extends one {
  public void id() {
    System.out.println("23");
  }




}
