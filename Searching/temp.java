public class temp {
    public static void main(String[] args) {
        // code
    }

    static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAs = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (isAs) {
                if (key < arr[mid]) {
                    end = mid - 1;
                } else if (key > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (key > arr[mid]) {
                    end = mid - 1;
                } else if (key < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
