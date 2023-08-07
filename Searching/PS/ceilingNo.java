package PS;

public class ceilingNo {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 4;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index of smallest no. >= target
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // when target is greater than the greatest element in an array
        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start; // when while loop breaks start will be at the next position of the target i.e.,
                      // ceiling/end+1
    }
}
