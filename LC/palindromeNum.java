// Leetcode 9. Palindrome Number

package LC;

public class palindromeNum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 121;
        System.out.println(s.isPalindrome(x));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int temp = x;
        int rev = 0;
        while (temp != 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp /= 10;
        }
        return rev == x;
    }
}
