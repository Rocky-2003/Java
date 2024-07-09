public class Index {
  static int a = 4;
  int b = 3;

  static void sout() {
    System.out.println(a);
    // ? Static method can only acces the staic variables & Methods but non-staic
    // ?can acess both static and not-static
    // System.out.println(b);
    // ? Static can not have acces to this keyword because they belong to class not
    // ? instance
    // System.out.println(this.a);
  }

  public static void main(String[] arg) {
    System.out.println(Index.a);
    Index.sout();
  }
}