import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class Index {
  public static void main(String[] arg) throws UnsupportedEncodingException {
    // ? Ways to create a string
    // 1. Simple way
    String s = "abc";

    // 2. String using Byte
    byte[] b_arr = { 71, 101, 101, 107, 115 };
    String a = new String(b_arr);

    // 3. String using byte , charset
    Charset c = Charset.defaultCharset();
    String b = new String(b_arr, c);

    // 4. String using byte,start_Index, endIndex-1 charset_Name
    String c1 = new String(b_arr, 1, 4, "US-ASCII");

    // 5. String using char array;;
    char[] ch = { 'g', 'e', 'e', 'k' };
    String d = new String(ch); // ! same as using byte we can set the start index, last index, chaset,
                               // charsetName

    //6.  String using int[]
    int[] uni_code = { 71, 101, 101, 107, 115 };
    String e = new String(uni_code, 1, 3); // eek



  }
}