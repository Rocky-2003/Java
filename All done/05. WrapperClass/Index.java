public class Index {

  public static void main(String[] args) {

    //  AutoBoxing
    Integer I = Integer.valueOf(100);
    //  UnBoxing
    int i = I;
     System.out.println(i);
    //  AutoBoxing of char to Charater
    Character C = Character.valueOf('r');

    // Unboxing of Charater to char;
     int c = C;

     System.out.println(C + "----" + c);
    
    
     Integer L = Integer.valueOf(i);
     System.out.println(L);
  }
}