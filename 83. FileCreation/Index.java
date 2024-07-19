import java.io.File;

public class Index {
  public static void main(String[] arg) {

    try {

      File newFile = new File("./data.txt");
      if (newFile.createNewFile()) {
        System.out.println("New File is created");
      } else {
        System.out.println("File is created!s");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}