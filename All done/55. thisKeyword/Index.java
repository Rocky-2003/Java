public class Index {
  public static class InnerIndex {
    int i = 20;
    String s = "Rocky";

    InnerIndex() {
      //3. Invoking Constructor
      this(4);

      //1.  Accessing Instance Variable
      System.out.println(this.i);
    }


    InnerIndex(int a) {
      this.i = a;
      // 2. Invoking Instance methods
      this.sout();
    }
    
    public void sout() {
      System.out.println(this.s);
    }


    InnerIndex so() {
//4.  Returning Current Object
      return this;
    }
    
    

  }

  public static void main(String[] args) {
    InnerIndex obj = new InnerIndex();
    obj.sout();
    obj.so().sout();
  
  }

}