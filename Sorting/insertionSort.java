import java.util.Scanner;

// apnoi kaksha
public class insertionSort {
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
            insertion(arr);
            printArray(arr);
        }
    }

    static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j > -1 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
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
