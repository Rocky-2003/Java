import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Index {
  public static void main(String[] arg) throws IOException {

    FileInputStream iStrm= null;
    FileOutputStream oStrm = null;
    try {
      File newFile = new File("./textData.txt");
      if (newFile.createNewFile()) {
        System.out.println("New file is Created");
      } else {
        System.out.println("File is already Created");
      }

      iStrm = new FileInputStream("./textData.txt");
      oStrm = new FileOutputStream("./Copy.txt");
      int c;
      while ((c = iStrm.read()) != -1) {
        oStrm.write(c);
      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      if (iStrm != null) {
        iStrm.close();
      }
      if (oStrm != null) {
        oStrm.close();
     
      }
    }
  }
}