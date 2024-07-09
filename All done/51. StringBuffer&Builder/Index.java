

class Index {
  public static void main(String[] arg) {

    int[][] a = new int[2][3];

    int x = 10;
    for (int i = 0; i <= 1; i++) {
      for (int j = 0; j < 3; i++) {
        a[i][j] = x;
        x=x+10;
     }
    }


    for (int i = 0; 1 <=1; i++) {
      for (int j = 0; j < 3; i++) {
        System.out.println(a[i][j]);
      }
    }
  }
}