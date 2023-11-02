package PS;

// Leetcode 27. Remove Element

class Solution9 {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}

public class removeSameElements {
    public static void main(String[] args) {
        Solution9 s = new Solution9();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(s.removeElement(nums, val));
    }
}
