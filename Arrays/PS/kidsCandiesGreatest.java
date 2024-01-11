package PS;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies
// link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class kidsCandiesGreatest {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxCandies = 0;
            ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
            // int arr[] = new int[candies.length];
            for (int i = 0; i < candies.length; i++) {
                maxCandies = Math.max(maxCandies, candies[i]);
            }
            for (int i = 0; i < candies.length; i++) {
                candies[i] += extraCandies;
                if (candies[i] >= maxCandies) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }
            return result;
        }
    }
}
