import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Index {
  public static void main(String[] arg) throws IOException {

    FileReader iStrm= null;
    FileWriter oStrm = null;
    try {
      File newFile = new File("textData.txt");
      System.out.println("HEllo");
      if (newFile.createNewFile()) {
        System.out.println("New file is Created");
      } else {
        System.out.println("File is already Created");
      }

      iStrm = new FileReader("Copy.txt");
      oStrm = new FileWriter(newFile);
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