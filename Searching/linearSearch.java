package Searching;

import java.util.Scanner;

public class linearSearch {

    static int linearsearch(int arr[], int key){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter key: ");
        int key = sc.nextInt();

        int arr[] = {1, 2, 45, 6, 7, 78, 4, 34, 86, 23, 60};
        int result = linearsearch(arr, key);

        System.out.println(result);
    }
}
