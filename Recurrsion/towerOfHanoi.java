package Recurrsion;

import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of disks: ");
        int n = sc.nextInt();
        tower(n, 'A', 'B', 'C');
    }

    public static void tower(int n, char src, char helper, char dest) {
        if (n == 0) {
            System.out.println("No disk to move");
        } else if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        } else {
            tower(n - 1, src, dest, helper);
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            tower(n - 1, helper, src, dest);
        }
    }
}
