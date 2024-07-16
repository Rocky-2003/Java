final public class Index {

  // 1. Final Variable
  final int a = 2;

  // 2. Blank Final Variable
  final int b;

  // 3. Final Static Variable
  final static int c = 3;

  // 4. Blank Final Satic Variable
  final int d;

  final static int e;

  // ? Initializtion of Blank variables
  // 1. curly braces
  {
    b = 4;
  }

  // 2. Inside Constructor
  Index() {
    this.d = 8;
  }

  // 3. Static Curly braces
  static {
    e = 9;
  }

  final public static void main(String[] args) {

    // Final Transitivity Property
    final StringBuilder sb = new StringBuilder("Geeks");
    System.out.println(sb);
    sb.append("ForGeeks");
    System.out.println(sb);

    // ///////////////////////////////////////

    Index sc = new Index();
    System.out.println(sc.a + "," + sc.b + "," + c + "," + sc.d + "," + Index.e);
  }
}