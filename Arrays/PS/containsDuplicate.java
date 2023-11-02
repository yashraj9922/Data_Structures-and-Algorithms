package PS;

// Leetcode 217. Contains Duplicate

import java.util.Arrays;

class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[counter]) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter != nums.length - 1;
    }
}

public class containsDuplicate {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(s.containsDuplicate(nums));
    }
}