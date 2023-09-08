import java.util.Arrays;

public class rowColMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 5, 7, 9 }, { 10, 14, 19 } };
        System.out.println(Arrays.toString(search(arr, 7)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            }
            if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}