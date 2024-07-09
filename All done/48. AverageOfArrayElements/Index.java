class Index {
  public static void main(String[] arg) {
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    int avg = sum / a.length;
    System.out.println(a.length);
  }
}