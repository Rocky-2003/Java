import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Index {
  public static void main(String[] args) throws IOException {
    // * //////////////////////////////////////////////////////////////
    // * This way in unBufferedReader or Writer way of Charater Stream
    // * //////////////////////////////////////////////////////////////

    // Reading from file
    InputStreamReader source = new InputStreamReader(System.in);

    // writing from file
    FileWriter target1 = new FileWriter("./copy.txt");

    try {
      int temp;

      // Check is data available or not, if available then print it
      if ((temp = source.read()) != -1) {

        target1.write(temp);
        System.out.println(temp);
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
