import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        // int[] arr = { 5, 1, 4, 2, 8 };
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        selection(arr);
        printArray(arr);
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) {
        int i;
        System.out.println("Non-Decreasing order: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            // System.out.println();
        }
    }
}