class MultiRunnable implements Runnable {
  @SuppressWarnings("deprecation")
  public void run() {
    try {
      System.out.println("Thread " + Thread.currentThread().getId());
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

public class Index {

  public static void main(String[] arg) {
    for (int i = 0; i < 8; i++) {

      Thread object = new Thread(new MultiRunnable());
      object.start();
    }
    
  
  }
}