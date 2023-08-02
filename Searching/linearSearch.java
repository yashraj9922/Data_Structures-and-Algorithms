package Searching;

import java.util.Scanner;

public class linearSearch {

    //search element in array: return the index if item found
    //otherwise if item not found return -1
    static int linearsearch(int arr[], int key){
        if(arr.length == 0){
            return -1;
        }

        for(int idx = 0; idx < arr.length; idx++){
            int element = arr[idx];
            if(element == key){
                return idx;
            }
        }
        return -1; //if element not found
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
