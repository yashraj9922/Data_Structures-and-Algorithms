import java.util.Scanner;

public class resizeArray {
    static int[] resizeArrays(int[] arr, int capacity){
        int [] newarr = new int[capacity];
        for(int i = 0; i<arr.length; i++){
            newarr[i] = arr[i];
        }
        arr = newarr;
        return arr;
    }

    public static void main(String[] args) {

        int ar[] = {1,2,4,5,6,3,5,0,6,34,6,23,56};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Capacity of new array ");
            int cap = sc.nextInt();

            int result[] = resizeArrays(ar, cap);
            for (int i = 0; i < result.length; i++)
                System.out.print(result[i] + " ");
        }
    }
}
