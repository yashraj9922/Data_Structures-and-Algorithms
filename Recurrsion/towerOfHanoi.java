package Recurrsion;

import java.util.Scanner;

public class towerOfHanoi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of disks: ");
        int n = sc.nextInt();
        tower(n, 'S', 'H', 'D');
    }
    public static void tower(int n, char src, char helper, char dest){
        if(n == 0){
            return;
        }
        tower(n-1, src, dest, helper);
        System.out.println("Move from " + src + " to " + dest);
        tower(n-1, helper, src, dest);
    }
}