// leetcode: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package PS;

import java.util.ArrayList;
import java.util.List;

public class disappearedNum {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        disappearedNum obj = new disappearedNum();
        System.out.println(obj.findDisappearedNumbers(arr));
    }
}
