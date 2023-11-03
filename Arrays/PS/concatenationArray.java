package PS;

// Leetcode 1929. Concatenation of Array

public class concatenationArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        concatenationArray s = new concatenationArray();
        int[] nums = { 1, 2, 1 };
        int[] arr = s.getConcatenation(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}