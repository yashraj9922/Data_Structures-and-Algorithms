public class binarySearch {
    // binary search only works on sorted array
    // here sorted is non-decreasing order...we need to change code for
    // non-increasing order
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5 }; // sorted...to know that array is ascending order sorted
                                          // if(arr[0]<arr[arr.length - 1])
                                          // int [] arr = {5,4,3,2,1}; // not sorted
        int target = 5;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if not found
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // find the middle element
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2; // to avoid overflow

            // three cases
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}