import java.util.Scanner;

public class bubbleSort {
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
        bubbleSort(arr, n);
        printArray(arr, n);
    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void printArray(int[] arr, int n) {
        int i;
        System.out.println("Non-Decreasing order: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            // System.out.println();
        }
    }
}
