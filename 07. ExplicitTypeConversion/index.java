import java.io.IOException;

public class index {
  public static void main(String[] args) throws IOException {

    // Primitive Values
    double d = 49572034;

    float f = (float) d;

    long l = (long) f;

    int i = (int) l;

    short s = (short) i;

    byte b = (byte) s;


    System.out.println(d+"\n" +f+"\n"+l+"\n"+i+"\n"+s+"\n"+b);
  
    //Non-Primite Values
    String str = "456";
    Integer inter = Integer.parseInt(str);
    System.out.println(inter);


 }
}
