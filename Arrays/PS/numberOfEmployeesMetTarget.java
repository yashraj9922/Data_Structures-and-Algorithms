package PS;

// 2798. Number of Employees Who Met the Target

public class numberOfEmployeesMetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        numberOfEmployeesMetTarget s = new numberOfEmployeesMetTarget();
        int[] hours = { 80, 80, 80, 80, 80 };
        int target = 80;
        System.out.println(s.numberOfEmployeesWhoMetTarget(hours, target));
    }
}
