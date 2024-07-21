import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file
        for (int counter = 0; counter < 3; counter++) {
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
    }
}
