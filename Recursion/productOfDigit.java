package Recursion;

public class productOfDigit {
    static int product(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + product(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(product(123));
    }
}