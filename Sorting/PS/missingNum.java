//Leetcode 268. Missing Number

package PS;

public class missingNum {
    public int missingNumber1(int[] nums) {
        int n = nums.length;
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }
        return sum1 - sum2;
    }

    // using cycle sort
    public int missingNumber2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 1 };
        missingNum obj = new missingNum();
        System.out.println(obj.missingNumber1(arr));
        System.out.println(obj.missingNumber2(arr));
    }
}
