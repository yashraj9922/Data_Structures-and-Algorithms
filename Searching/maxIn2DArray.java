package Searching;

public class maxIn2DArray {
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [][]arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(max(arr));
    }
}
