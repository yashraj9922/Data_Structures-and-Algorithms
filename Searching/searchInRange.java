package Searching;

public class searchInRange {
    static int linearsearch(int arr[], int key, int start, int endIdx) {
        if (arr.length == 0) {
            return -1;
        }

        for (int idx = start; idx <= endIdx; idx++) {
            int element = arr[idx];
            if (element == key) {
                return idx;
            }
        }
        return -1; // if element not found
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 5;
        int start = 2;
        int endIdx = 5;
        System.out.println(linearsearch(arr, key, start, endIdx));
    }
}