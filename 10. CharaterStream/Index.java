import java.io.FileReader;
import java.io.IOException;

public class Index {
  public static void main(String[] args) throws IOException {
    //* //////////////////////////////////////////////////////////////
    // * This way in unBufferedReader or Writer way of Charater Stream
    // * //////////////////////////////////////////////////////////////
    // Initialy we have no readed data
    FileReader source = null;

    // Reading from file
    source = new FileReader("./text.txt");

    try {
      int temp;
      // Check is data available or not, if available then print it
      if ((temp = source.read()) != -1) {
        System.out.println((char) temp);
      }
      System.out.println("Data readed SuccesFully");
    } finally {
      // Clossing charaterStream
      if (source != null) {
        source.close();
      }
    }

  }
}
