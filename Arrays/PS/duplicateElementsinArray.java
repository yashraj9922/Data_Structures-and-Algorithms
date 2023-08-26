//26. Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution1 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }
}

public class duplicateElementsinArray {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = { 1, 1, 2 };
        int len = s.removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
