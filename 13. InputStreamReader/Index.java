import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Index {
  public static void main(String[] args) {


    FileInputStream source= null;

    try {
      source = new FileInputStream("./text.txt");
      InputStreamReader isr = new InputStreamReader(source);
      
      int cha;
      // appling condition if not data then don't write it
      while ((cha = isr.read()) != -1) {
        System.out.println( (char) cha);
      }
      System.out.println("data readed Succesfully");
      isr.close();
    } catch (Exception e) {
      e.printStackTrace();
      
    }
  }
}


