import java.util.ArrayList;
import java.util.Scanner;

public class multiDArraylist {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 2D arrayList
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            // Initialization of sub-ArrayList
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
            }

            // add elements
            System.out.println("Enter the elements.....");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Element(index) " + i + ": ");
                    list.get(i).add(sc.nextInt());
                }
            }

            // print elements
            System.out.println(list);
        }
    }
}
