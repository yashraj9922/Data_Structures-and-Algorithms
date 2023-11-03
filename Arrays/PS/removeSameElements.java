package PS;

// Leetcode 27. Remove Element


public class removeSameElements {
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

    public static void main(String[] args) {
        removeSameElements s = new removeSameElements();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(s.removeElement(nums, val));
    }
}
