class Index {
  public static void main(String[] args) {

    // Check Distinct Elements
    int[] a = { 1, 2, 3, 4, 5, 6, 8 };
    int count = 0;
    boolean isDistinct = true;

    for (int i = 0; i < a.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (a[i] == a[j]) {
          isDistinct = false;
          break;
        }
      }

      if (isDistinct == true) {
        count++;
      }
      isDistinct = true;
    }
    System.out.println(count);
  }
}