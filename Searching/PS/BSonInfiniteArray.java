package PS;

//Find position of an element in an infinite sorted array(unknown size) => Amazon
public class BSonInfiniteArray {

    static int ans(int[] arr, int target) {
        // first find the range
        // first start with range of 2
        int start = 0;
        int end = 1;

        // condition for target to lie within range
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, start, end, target);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
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
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 12, 15, 18, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80 };
        int target = 18;
        System.out.println(ans(arr, target));
    }
}
