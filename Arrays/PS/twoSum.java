// Leetcode 1. Two Sum

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
public class twoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 2 };
        int target = 6;

        int[] result = sum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] sum(int[] nums, int target) {
        int[] result = new int[2];
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = target - nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (nums[i] == temp[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
