import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Index {
  public static void main(String[] args) throws IOException {
    // * //////////////////////////////////////////////////////////////
    // * This way in unBufferedReader or Writer way of Charater Stream
    // * //////////////////////////////////////////////////////////////
    // Initialy we have no readed data
    FileReader source = null;
    FileWriter target1 = null;

    // Reading from file
    source = new FileReader("./text.txt");

    // writing from file
    target1 = new FileWriter("./copy.txt");

    try {
      // int temp;
    
      // Check is data available or not, if available then print it
      if ((temp = source.read()) != -1) {
       
        target1.write((char) temp);
        System.out.println((char) temp);
        System.out.println("Data readed SuccesFully");
      }
    } finally {
      // Clossing charaterStream
      if (source != null) {
        source.close();
        target1.close();
      }
    }

  }
}
