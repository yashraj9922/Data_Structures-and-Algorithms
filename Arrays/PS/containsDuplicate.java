package PS;

// Leetcode 217. Contains Duplicate

import java.util.Arrays;

public class containsDuplicate {
    public boolean containDuplicate(int[] nums) {
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

    public static void main(String[] args) {
        containsDuplicate s = new containsDuplicate();
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(s.containDuplicate(nums));
    }
}