/**
 * DataTypes
 */
public class DataTypes {
  public static void main(String[] args) {
    //Data type in java
    // 1. Primitive DataTypes     2. Non-Primitive DataTypes
    //* 1. Primitive Data Types
    boolean b = true;
    byte B = 23;
    char c = 'a';
    short s = 234;
    int i = 455;
    float f = 4.44f;
    long l = 394573904;
    double d = 230489503;

    //* 2. Non-Primitive Data Types
    String S = "Rocky Mor";
    int[] arr = new int[] { 1, 2, 3, 4, 5 };
    // and etc



  
    System.out.println(b + "\n" + B + "\n" + c + "\n" + s + "\n" + i + "\n" + f + "\n" + l + "\n" +S);
    for (int e = 0; e <= arr.length; e++) {
           System.out.println(arr[e]);
   }




}
  
}