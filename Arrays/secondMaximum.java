public class secondMaximum {
    static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < secondMax && arr[i] != max) {
                secondMax = arr[i];// {2,5,3}....test case
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 4, 5, 6, 3, 5, 0, 6, 34, 6, 23, 56 };

        int result = findSecondMax(ar);
        System.out.print("Second Maximum Value: " + result);
    }
}
