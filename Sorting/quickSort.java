import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
    static int partition(int arr[], int l, int h) {
        int pivot = arr[l], i = l, j = h;

        while (i < j) {
            while (arr[i] <= pivot && i < h) {
                i++;
            }

            while (arr[j] > pivot && j > l) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int tmp = arr[l];
        arr[l] = arr[j];
        arr[j] = tmp;

        return j;
    }

    static void quick(int arr[], int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            quick(arr, l, p);
            quick(arr, p + 1, h);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        quick(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
