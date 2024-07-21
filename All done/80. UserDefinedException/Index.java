public class Index {

  public static void performAction(String message) throws CustomUncheckedException {
    if (message == null || message.isEmpty()) {
      throw new CustomUncheckedException("Input can not be empty or null");
    }
  }

  public static void anotherAction(String message) throws CustomUncheckedException {
    if (message == null || message.isEmpty()) {
      throw new CustomUncheckedException("Input can not be empty or null");
    }
  }

  public static void main(String[] arg) {
    try {
      performAction("");

    } catch (CustomUncheckedException e) {
      System.err.println(e.getMessage());
      System.out.println(e.getLocalizedMessage());
    } catch (Exception e) {
      System.out.println(e.getLocalizedMessage());
    }
  }
}

class CustomUncheckedException extends Exception {
  public CustomUncheckedException(String message) {
    super(message);
  }
}
