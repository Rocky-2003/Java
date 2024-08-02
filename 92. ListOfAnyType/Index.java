import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Index {
  


    public static void printNumberList(List<? extends Number> list) {
        for (Number element : list) {
            System.out.println(element);
        }
    }
    public static void printNumberList2(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        List<Float> floatList = List.of(1.0f, 2.0f, 3.0f);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Rocky");
        stringList.add("Mor");
        stringList.add("Shab");
        System.out.println("Integer List:");
        printNumberList(intList);

        System.out.println("\nDouble List:");
        printNumberList(doubleList);

        System.out.println("\nFloat List:");
        printNumberList(floatList);

        printNumberList2(stringList);
        printNumberList2(floatList);
    }
}