import java.util.ArrayList;
import java.util.Scanner;

public class inpArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        // input in arraylist
        System.out.println("Enter the elements in ArrayList....");
        for (int i = 0; i < 6; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }
        System.out.println("list.add List: " + list);

        // get element at any index
        System.out.println("Enter the elements in ArrayList...from index 3");
        for (int j = 0; j < 6; j++) {
            System.out.println("list.get() List => Element index " + j + ": " + list.get(j));
        } // list[index] will not work here
    }
}
