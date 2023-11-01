package Recursion;

public class binarySearch {
    static int search(int arr[], int key, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (key < arr[mid]) {
            return search(arr, key, start, mid - 1);
        }

        return search(arr, key, mid + 1, end);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
        int key = 6;
        int start = 0;
        int end = arr.length - 1;

        int index = search(arr, key, start, end);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}