public class numbersSmallerThanCurrent {

// 1365. How Many Numbers Are Smaller Than the Current Number
// link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int result[] = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                int count = 0;
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] < nums[i]){
                        count++;
                    }
                }
                result[i] = count;
            }
            return result;
        }
    }
}