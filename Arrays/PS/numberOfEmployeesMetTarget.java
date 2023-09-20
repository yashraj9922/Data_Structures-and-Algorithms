package PS;

// 2798. Number of Employees Who Met the Target

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                counter++;
            }
        }
        return counter;
    }
}

public class numberOfEmployeesMetTarget {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] hours = { 80, 80, 80, 80, 80 };
        int target = 80;
        System.out.println(s.numberOfEmployeesWhoMetTarget(hours, target));
    }
}
