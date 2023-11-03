// Leetcode 66. Plus One
package PS;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = { 9, 9, 9 };
        int[] ans = plus(digits);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }


        static int[] plus(int[] digits) {
            int n = digits.length;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] newNumber = new int[n + 1];// when a new array is created...all the elements are initialized to 0...hence extra 0 is automatically added at the end of array
            newNumber[0] = 1;
            return newNumber;
        }
    }
