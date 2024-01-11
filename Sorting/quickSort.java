import java.util.Arrays;
import java.util.Scanner;

// abdul bari
public class quickSort {
    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i < j && arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void quick(int arr[], int low, int high) {
        if (low < high) {
            int pividx = partition(arr, low, high);
            quick(arr, low, pividx - 1);
            quick(arr, pividx + 1, high);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of an Array: ");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter elements of an array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            int n = arr.length;
            quick(arr, 0, n - 1);
            System.out.println(Arrays.toString(arr));
        }
    }
}
