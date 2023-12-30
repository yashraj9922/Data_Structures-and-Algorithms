// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// leetcode: https://leetcode.com/problems/running-sum-of-1d-array/
// 1480. Running Sum of 1d Array

public class RunningSum1dArray {
    class Solution {
        public int[] runningSum(int[] nums) {

            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i - 1] + nums[i];

            }
            return nums;
        }
    }
}