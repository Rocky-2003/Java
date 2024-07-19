import java.math.BigInteger;

public class Index {
  public static void main(String[] arg) {
    int n = 20;

    BigInteger f = new BigInteger("1");

    for (int i = 1; i <= n; i++) {
      BigInteger x = BigInteger.valueOf(i);

      f = f.multiply(x);

    }
    
    System.out.println(f);
  }
}