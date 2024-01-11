package PS;

// Problem: Build Array from Permutation Leetcode 1920 (Easy) Link: https://leetcode.com/problems/build-array-from-permutation/
public class buildArrayFromPermuntation {
    class Solution {
        public int[] buildArray(int[] nums) {
            int arr[] = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                arr[i] = nums[nums[i]];
            }
            return arr;
        }
    }
}
