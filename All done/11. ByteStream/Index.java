import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Index {
  public static void main(String[] args) throws IOException {

    // Initially assigning null ot objects for
    // reading and writing to file
    FileInputStream source = null;
    FileOutputStream target1 = null;

    try {
      
      // Passing the files via local directory
      source = new FileInputStream("./text.rtf");
      target1 = new FileOutputStream("./copy.rtf");

      int temp;
      if ((temp = source.read()) != -1) {
        target1.write((byte) temp);
      }
      ;

      // Display message for successful execution of program
      System.out.print("Program successfully executed");
    } finally {
      if (source != null)
        source.close();

      if (target1 != null)
        target1.close();
    }
  }
}
