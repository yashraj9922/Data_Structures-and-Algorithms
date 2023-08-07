package PS;

public class flooringNo {

    // return the index of greatest no. <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // when target is smaller than the smallest element in an array
        if (target < arr[start]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println(floor(arr, target));
    }
}