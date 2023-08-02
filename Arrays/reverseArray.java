public class reverseArray {
    static int[] reverseAnArray(int[] arr) {
        int idx = 0;
        int rev[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[idx] = arr[i];
            idx++;
        }
        return rev;
    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 4, 5, 6, 3, 5, 0, 6, 34, 6, 23, 56 };

        int result[] = reverseAnArray(ar);
        System.out.print("reverse: ");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}
