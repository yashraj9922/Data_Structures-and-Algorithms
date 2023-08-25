package PS;

// Leetcode 1470. Shuffle the Array

class Solution {
    public int[] shuffle(int[] nums, int n){
        int []arr = new int[2*n];
        for(int i = 0; i < n; i++){
            arr[2*i] = nums[i];
            arr[2*i + 1] = nums[i + n];
        }
        return arr;
    }
}

public class shuffleArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int []nums = {2,5,1,3,4,7};
        int n = 3;
        int []arr = s.shuffle(nums, n);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}