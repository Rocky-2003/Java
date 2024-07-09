import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Index {
  public static void main(String[] args) throws IOException {
    FileReader source = new FileReader("./text.txt");
    FileWriter target = new FileWriter("./copy.txt");

    String line;
    try {
      // source = new FileReader("./text.txt");
      BufferedReader reader = new BufferedReader(source);
      BufferedWriter writer = new BufferedWriter(target);

      if ((line = reader.readLine()) != null) {
        System.out.println(line);
        writer.write(line);
        writer.newLine();
        // System.out.println("Line:-" + line);
        // System.out.println("Data readed Success Fully");
      }

    } catch (Exception e) {

      e.printStackTrace();

    } finally {
     
        source.close();
        target.close();
        // reader.close();


    }
  }
}