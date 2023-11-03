public class orderAgnosticBinarySearch {
    // binary search only works on sorted array
    // here sorted is non-decreasing order...we need to change code for
    // non-increasing order
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5 }; // ascending order sorted...to know that array is ascending order sorted
                                          // if(arr[0]<arr[arr.length - 1])
        int[] arr1 = { 5, 4, 3, 2, 1 }; // descending order sorted
        int target = 5;
        int ans = binarysearch(arr, target);
        int ans1 = binarysearch(arr1, target);
        System.out.println(ans);
        System.out.println(ans1);
    }

    // return the index
    // return -1 if not found
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            // find the middle element
            // int mid = (start + end) / 2;
            // int mid = start + (end - start) / 2;
            int mid = start + (end - start) / 2; // to avoid overflow

            // three cases
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
