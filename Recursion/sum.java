package Recursion;

public class sum {
    static int sumofNum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumofNum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(sumofNum(n));
    }
}
