import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        try (// int[] arr = { 5, 1, 4, 2, 8 };
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of an Array: ");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter elements of an array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            bubble(arr);
            printArray(arr);
        }
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
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
