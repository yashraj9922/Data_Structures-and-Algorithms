package PS;

// 1512. Number of Good Pairs

public class goodPairs {
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (current == nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        goodPairs s = new goodPairs();
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        System.out.println(s.numIdenticalPairs(nums));
    }
}