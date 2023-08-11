package PS;

// Find first and last position of an element in a sorted array => leeetcode 34
public class firstLastPositionOfElement {
    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        int startIndex = search(nums, target, true);
        int endIndex = search(nums, target, false);

        ans[0] = startIndex;
        ans[1] = endIndex;

        return ans;
    }

    static int search(int[] nums, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential answer found....
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        int[] ans = searchRange(nums, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}