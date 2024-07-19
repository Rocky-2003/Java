
class ThreadClass extends Thread {
  public void run() {
    try {
      System.out.println("Thread " + Thread.currentThread().getId()
          + " is running");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

public class Index {

  public static void main(String[] arg) {
    int n = 8; // Number of threads
    for (int i = 0; i < n; i++) {
      ThreadClass object = new ThreadClass();
      object.start();
    }
  }
}