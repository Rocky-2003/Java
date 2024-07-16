public class Index {
  public static void main(String[] args) {
    // ? Types of Array
    // ! 1D Array
    int a[] = { 1, 2, 3, 4, 5 };

    // !2D Array
    int b[][] = new int[2][3];
    int x = 1;
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        b[i][j] = x;
        x += 1;
      }
    }
    System.out.println(b[1][2]);

    // ! 3D Array

    int[][][] c = {

        {
            { 1, 2, 3 }, { 3, 2, 1 },
        },
        {
            { 4, 5, 6 }, { 6, 5, 4 },
        },
    };
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 3; k++) {
          System.out.print(c[i][j][k] + " ");
        }
        System.out.print(",");
      }
      System.out.println();
    }
  }
}
