import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Index {
  public static void main(String[] args) throws IOException {
    FileReader source = null;

    String line;
    try {
      source = new FileReader("./text.txt");
      BufferedReader reader = new BufferedReader(source);

      if ((line = reader.readLine()) != null) {
        System.out.println("Line:-" + line);
        System.out.println("Data readed Success Fully");
      }

    } catch (Exception e) {
    
      e.printStackTrace();
      
    } 
  }
}
